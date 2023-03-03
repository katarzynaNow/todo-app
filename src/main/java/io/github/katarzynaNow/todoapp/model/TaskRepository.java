package io.github.katarzynaNow.todoapp.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.net.ContentHandler;
import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll(); //pobranie wszytskich tasków

    Page<Task> findAll(Pageable page);

    Optional<Task> findById(Integer id);//pobranie konkretnego tasku

    boolean existsById(Integer id);
    boolean existsByDoneIsFalseAndGroup_Id(Integer groupId);

    Task save(Task entity);

    List<Task> findByDone(@Param("state") boolean done);

}
