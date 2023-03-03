package io.github.katarzynaNow.todoapp.model;

import java.util.List;
import java.util.Optional;

public interface TaskGroupRepository {
    List<TaskGroup> findAll();//odczyt
    Optional<TaskGroup> findById(Integer id);//odczyt pojedynczego
    TaskGroup save(TaskGroup entity);//zapis

    boolean existsByDoneIsFalseAndProject_Id(Integer groupId);
}
