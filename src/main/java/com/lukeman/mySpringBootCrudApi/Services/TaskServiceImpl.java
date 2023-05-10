package com.lukeman.mySpringBootCrudApi.Services;

import com.lukeman.mySpringBootCrudApi.Config.BusinessException;
import com.lukeman.mySpringBootCrudApi.Dao.TaskRepository;
import com.lukeman.mySpringBootCrudApi.Models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        List<Task> taskList = null;
        try {
            taskList = taskRepository.findAll();
        }catch (Exception e){
            throw new BusinessException("605","something went wrong while getting all tasks"+ e.getMessage());
        }
        if (taskList.isEmpty()){
            throw new BusinessException("604","Hey list completely empty");
        }

        return taskList;
    }

    @Override
    public Task getTaskById(int id) {
        try {
            return taskRepository.findById(id).get();
        }catch (Exception e){
            throw new BusinessException("606","given task ID does not exist in DB" + e.getMessage());
        }

    }

    // == Method to save a Task ==
    @Override
    public Task saveTask(Task task) {

        if (task.getDescription().isEmpty()|| task.getDescription().length() == 0){
            throw new BusinessException("601","Please send proper description, It blank");
        }

        try {
            return taskRepository.save(task);
        }catch (IllegalArgumentException e){
           throw new BusinessException("602","given task is null"+ e.getMessage());
        }catch (Exception e){
            throw new BusinessException("603","Something went wrong"+ e.getMessage());
        }
    }

    @Override
    public void deleteTaskById(int id) {
        try {
            taskRepository.deleteById(id);
        }catch (NoSuchElementException e){
            throw new BusinessException("609","given task ID does not exist in DB" + e.getMessage());
        }
    }
}
