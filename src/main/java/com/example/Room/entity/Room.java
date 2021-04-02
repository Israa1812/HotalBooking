package com.example.Room.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Room_tabel")
public class Room {

    @Id
    @GeneratedValue
    private int Id;
    private boolean isVailed ;
    private char nameCustmor;

    public boolean getIsVailed() {
        return isVailed;
    }
}
