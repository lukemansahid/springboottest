package com.lukeman.mySpringBootCrudApi.Services;

import com.lukeman.mySpringBootCrudApi.Models.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTask();

    Task getTaskById(int id);


}
