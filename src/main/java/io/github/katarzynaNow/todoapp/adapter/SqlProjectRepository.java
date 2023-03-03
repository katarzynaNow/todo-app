package io.github.katarzynaNow.todoapp.adapter;

import io.github.katarzynaNow.todoapp.model.Project;
import io.github.katarzynaNow.todoapp.model.ProjectRepository;
import io.github.katarzynaNow.todoapp.model.TaskGroup;
import io.github.katarzynaNow.todoapp.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {
    @Override
    @Query("select distinct p from Project p join fetch p.steps ")
    List<Project> findAll();
}
