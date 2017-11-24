package com.adammendak.bootangulartasker.controller;

import com.adammendak.bootangulartasker.model.Task;
import com.adammendak.bootangulartasker.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
@Slf4j
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping( value = {"", "/"})
    public Iterable<Task> listTasks() {
        return this.taskService.listTasks();
    }

    @RequestMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }

}
