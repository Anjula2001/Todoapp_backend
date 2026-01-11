package com.todoapp.todoapp.repo;

import com.todoapp.todoapp.dto.ActivityDTO;
import com.todoapp.todoapp.model.ActivityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Activityrepo extends JpaRepository<ActivityModel,Integer> {
}
