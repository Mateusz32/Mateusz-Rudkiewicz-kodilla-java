package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
