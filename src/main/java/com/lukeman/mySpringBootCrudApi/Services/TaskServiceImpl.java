package com.lukeman.mySpringBootCrudApi.Services;

import com.lukeman.mySpringBootCrudApi.Dao.TaskRepository;
import com.lukeman.mySpringBootCrudApi.Models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {


        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(int id) {

    return taskRepository.findById(id).get();

    }

    @Override
    public Task saveTask(Task task) {

        Task savedTask = taskRepository.save(task);

        return savedTask;
    }

    @Override
    public void deleteTaskById(int id) {
        taskRepository.deleteById(id);
    }
}
