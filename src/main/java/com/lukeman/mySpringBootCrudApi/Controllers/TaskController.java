package com.lukeman.mySpringBootCrudApi.Controllers;

import com.lukeman.mySpringBootCrudApi.Models.Task;
import com.lukeman.mySpringBootCrudApi.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class TaskController {

    @Autowired
    private  TaskService taskService;


//    @GetMapping
    public List<Task> getAllTasks() {
        return null;
    }
}
