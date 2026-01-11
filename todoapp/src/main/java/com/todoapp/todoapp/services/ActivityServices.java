package com.todoapp.todoapp.services;

import com.todoapp.todoapp.dto.ActivityDTO;
import com.todoapp.todoapp.model.ActivityModel;
import com.todoapp.todoapp.repo.Activityrepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional

public class ActivityServices {

    @Autowired
    private Activityrepo activityrepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<ActivityDTO> getAllActivities(){
        List<ActivityModel> activitylist = activityrepo.findAll();
        return modelMapper.map(activitylist,new TypeToken<List<ActivityDTO>>(){

        }.getType());
    }

    public ActivityDTO AddActivity(ActivityDTO activityDTO){

        activityrepo.save(modelMapper.map(activityDTO,ActivityModel.class));
        return  activityDTO;
    }






}
