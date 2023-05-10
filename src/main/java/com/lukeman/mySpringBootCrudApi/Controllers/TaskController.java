package com.lukeman.mySpringBootCrudApi.Controllers;

import com.lukeman.mySpringBootCrudApi.Config.BusinessException;
import com.lukeman.mySpringBootCrudApi.Models.Task;
import com.lukeman.mySpringBootCrudApi.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class TaskController {

    @Autowired
    private  TaskService taskService;


    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public ResponseEntity<List<Task>> getAllTasks() {

            List<Task> allTasks = taskService.getAllTasks();

            return new ResponseEntity<List<Task>>(allTasks, HttpStatus.OK);
    }


    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getTaskById(@PathVariable("id") int id) {

        try {
            Task task = taskService.getTaskById(id);

            return new ResponseEntity<Task>(task, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveTask(@RequestBody Task task){

        try {
            Task savedTask = taskService.saveTask(task);
            return new ResponseEntity<Task>(savedTask, HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<?> updateTask(@RequestBody Task task){

        try {
            Task updatedTask = taskService.saveTask(task);

            return new ResponseEntity<Task>(updatedTask, HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/tasks/{id}/delete", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTaskById(@PathVariable("id") int id) {

        taskService.deleteTaskById(id);

        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}
