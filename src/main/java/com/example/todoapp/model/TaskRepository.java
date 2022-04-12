package com.example.todoapp.model;

import org.springframework.data.jpa.repository.JpaRepository;

interface TaskRepository extends JpaRepository<Task, Integer> {
}
