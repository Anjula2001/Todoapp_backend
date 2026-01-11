package com.todoapp.todoapp.controller;

import com.todoapp.todoapp.dto.ActivityDTO;
import com.todoapp.todoapp.services.ActivityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1")
public class ActivityController {

    @Autowired
    public ActivityServices activityServices;

    @GetMapping("/getactivity")
    public List<ActivityDTO> getActivity(){
    return activityServices.getAllActivities();
}

    @PostMapping("/saveactivity")
    public ActivityDTO saveActivity(@RequestBody ActivityDTO activityDTO){
    return activityServices.AddActivity(activityDTO);

    



}


}
