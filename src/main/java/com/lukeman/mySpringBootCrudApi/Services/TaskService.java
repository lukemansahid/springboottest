package com.lukeman.mySpringBootCrudApi.Services;

import com.lukeman.mySpringBootCrudApi.Models.Task;

import java.util.List;

public interface TaskService {

   public List<Task> getAllTasks();

   public Task getTaskById(int id);

   public Task saveTask(Task task);

   public void deleteTaskById(int id);

}
