package com.portofolio.taskmanager.portofolio_task_app;

import com.portofolio.taskmanager.portofolio_task_app.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);
    
}