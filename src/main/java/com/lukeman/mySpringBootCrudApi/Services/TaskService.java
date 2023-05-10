package com.lukeman.mySpringBootCrudApi.Services;

import com.lukeman.mySpringBootCrudApi.Models.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task getTaskById(int id);

    Task saveTask(Task task);

    void deleteTaskById(int id);

}
