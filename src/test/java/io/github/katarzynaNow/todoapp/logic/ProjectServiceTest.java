package io.github.katarzynaNow.todoapp.logic;

import io.github.katarzynaNow.todoapp.model.TaskGroup;
import io.github.katarzynaNow.todoapp.model.TaskGroupRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProjectServiceTest {

    @Test
    @DisplayName("should throw illegalStateException when configured to allow just one group and other undone group exists")
    void createGroup_noMultipleGroupsConfig_And_undoneGroupsExists_throwsIllegalStateException() {
        //given
        var mockGroupRepository = new TaskGroupRepository() {
            @Override
            public List<TaskGroup> findAll() {
                return null;
            }

            @Override
            public Optional<TaskGroup> findById(Integer id) {
                return Optional.empty();
            }

            @Override
            public TaskGroup save(TaskGroup entity) {
                return null;
            }

            @Override
            public boolean existsByDoneIsFalseAndProject_Id(Integer groupId) {
                return false;
            }
        };
        //when
        //then
    }
}