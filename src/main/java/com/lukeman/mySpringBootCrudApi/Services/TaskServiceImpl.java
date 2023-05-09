package com.lukeman.mySpringBootCrudApi.Services;

import com.lukeman.mySpringBootCrudApi.Models.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public List<Task> getAllTask() {
        return null;
    }

    @Override
    public Task getTaskById(int id) {
        return null;
    }
}
