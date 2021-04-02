package com.example.Room.controller;

import com.example.Room.entity.Room;
import com.example.Room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService service;

    @PostMapping("/addRoom")
    public Room addRoom( @RequestBody  Room room){
        return service.saveRoom(room);
    }

    @PostMapping("/addRooms")
    public List<Room> addRooms(@RequestBody  List<Room> room){
        return service.saveRoom(room);
    }
    @GetMapping("/Rooms")
    public List<Room> findAllRoom(){
        return service.getRoom();
    }
    @GetMapping("/Rooms/{id}")
    public Room findRoomById( @PathVariable int id){
        return service.getRoomById(id);
    }
    @GetMapping("/Rooms/{isVailed}")
    public Room findRoomByVailedtion( @PathVariable boolean isvailed){
        return service.getRoomByVaildtion(isvailed);
    }

    @PutMapping("/updata")
    public Room updataRoom( @RequestBody  Room room){
        return service.updataRoom(room);
    }

    @DeleteMapping("/delete/{id}")
    public String  deletRoom(@PathVariable int id){
        return service.deletRoom(id);
    }
}
