package io.github.katarzynaNow.todoapp.model;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    List<Project> findAll();//odczyt
    Optional<Project> findById(Integer id);//odczyt pojedynczego
    Project save(Project entity);//zapis
}
