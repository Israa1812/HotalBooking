package com.example.Room.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "IdBook")
    private int IdBook;
    @Column(name = "IdRoom")
    private int IdRoom;
    @Column(name = "is_vailed")
    private boolean is_vailed ;
    @Column(name = "nameCustmor")
    private char nameCustmor;

    public Book() {
    }

    public int getIdBook() {
        return IdBook;
    }

    public void setIdBook(int idBook) {
        IdBook = idBook;
    }

    public int getIdRoom() {
        return IdRoom;
    }

    public void setIdRoom(int idRoom) {
        IdRoom = idRoom;
    }

    public boolean isIs_vailed() {
        return is_vailed;
    }

    public void setIs_vailed(boolean is_vailed) {
        this.is_vailed = is_vailed;
    }
    public char getNameCustmor() {
        return nameCustmor;
    }

    public void setNameCustmor(char nameCustmor) {
        this.nameCustmor = nameCustmor;
    }
}
