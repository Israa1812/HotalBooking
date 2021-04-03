package com.example.Room.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue
    @Column(name = "IdRoom")
    private int IdRoom;
    @Column(name = "typeRoom")
    private char typeRoom;
    @Column(name = "isVailed")
    private boolean isVailed ;
    @Column(name = "nameCustmor")
    private char nameCustmor;

    public Room() {
    }
    public int getIdRoom() {
        return IdRoom;
    }
    public void setIdRoom(int idRoom) {
        IdRoom = idRoom;
    }

    public char getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(char typeRoom) {
        this.typeRoom = typeRoom;
    }

    public boolean isVailed() {
        return isVailed;
    }

    public void setVailed(boolean vailed) {
        isVailed = vailed;
    }

    public char getNameCustmor() {
        return nameCustmor;
    }

    public void setNameCustmor(char nameCustmor) {
        this.nameCustmor = nameCustmor;
    }
}
