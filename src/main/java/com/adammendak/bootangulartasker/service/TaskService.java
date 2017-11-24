package com.adammendak.bootangulartasker.service;

import com.adammendak.bootangulartasker.model.Task;

public interface TaskService {

    Iterable<Task> listTasks();

    Task save(Task task);

}
