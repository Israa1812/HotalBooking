package com.example.Room.service;

import com.example.Room.entity.Room;
import com.example.Room.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository repository;
        //post method//

    public Room saveRoom(Room room){
       return repository.save(room);
    }

    public List<Room> saveRoom(List<Room> rooms){
        return repository.saveAll(rooms);
    }


        //get method//
        public List<Room> getRoom(){
            return repository.findAll();
        }

    public Room getRoomById(int id){
        return repository.findById(id).orElse(null);
    }

    public Room getRoomByVaildtion(boolean isvailed){
        return repository.findByVailedtion(isvailed);
    }


       //delet method//

    public String deletRoom(int id){
        repository.deleteById(id);
        return "Room removed !!!!"+ id;
    }


        //updata method//
    public Room updataRoom(Room room){
        Room existingRoom = repository.findById(room.getId()).orElse(null);
        existingRoom.setVailed(room.getIsVailed());
        existingRoom.setNameCustmor(room.getNameCustmor());
        return repository.save(existingRoom);
    }
}
