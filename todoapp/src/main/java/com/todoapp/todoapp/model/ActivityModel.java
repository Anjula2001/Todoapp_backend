package com.todoapp.todoapp.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DialectOverride;

@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Data

public class ActivityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String date;
    private String context;
 //   @Version
   // private int version;


    public ActivityModel(){
    }

    public ActivityModel(int id, String date, String context) {
        this.id = id;
        this.date = date;
        this.context = context;
        //this.version = 1;
    }

    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}




