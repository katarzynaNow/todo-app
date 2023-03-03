package io.github.katarzynaNow.todoapp.adapter;

import io.github.katarzynaNow.todoapp.model.TaskGroup;
import io.github.katarzynaNow.todoapp.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SqlTaskGroupRepository extends TaskGroupRepository, JpaRepository<TaskGroup, Integer> {
    @Override
    @Query("select distinct g from TaskGroup g join fetch g.tasks ")//zapytanie na encjach, Hibernate query language - HQL
    List<TaskGroup> findAll();

    @Override
    boolean existsByDoneIsFalseAndProject_Id(Integer groupId);//wszytkie niezrobione grupy w ramach danego obiektu

}
