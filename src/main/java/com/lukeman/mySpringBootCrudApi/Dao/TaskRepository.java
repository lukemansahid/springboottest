package com.lukeman.mySpringBootCrudApi.Dao;

import com.lukeman.mySpringBootCrudApi.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
