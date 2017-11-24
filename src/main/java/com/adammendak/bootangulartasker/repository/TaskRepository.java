package com.adammendak.bootangulartasker.repository;

import com.adammendak.bootangulartasker.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {


}
