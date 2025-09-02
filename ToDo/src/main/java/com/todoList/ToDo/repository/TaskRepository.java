package com.todoList.ToDo.repository;

import com.todoList.ToDo.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks,Long> {
}
