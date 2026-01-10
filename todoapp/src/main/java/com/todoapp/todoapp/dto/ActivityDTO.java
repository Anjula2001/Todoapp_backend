package com.todoapp.todoapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class ActivityDTO {
    private Integer id;
    private String date;
    private String context;

}
