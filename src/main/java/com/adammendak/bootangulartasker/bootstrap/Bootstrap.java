package com.adammendak.bootangulartasker.bootstrap;

import com.adammendak.bootangulartasker.model.Task;
import com.adammendak.bootangulartasker.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Bootstrap  implements CommandLineRunner{

    private TaskService taskService;

    public Bootstrap(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run(String... strings) throws Exception {

    taskService.save(new Task(1L, "first Task to do ", LocalDate.now(), true));
    taskService.save(new Task(2L, "second Task to do ", LocalDate.now(), false));
    taskService.save(new Task(3L, "third do ", LocalDate.now(), true));
    taskService.save(new Task(4L, "fourth Task to do ", LocalDate.now(), false));

    }
}
