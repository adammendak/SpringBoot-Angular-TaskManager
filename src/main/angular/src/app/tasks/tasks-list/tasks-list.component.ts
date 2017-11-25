import { Component, OnInit, Output } from '@angular/core';
import {Response} from "@angular/http";

import {Task} from "../tasks.module";
import {TaskService} from "../task.service";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

  constructor(private taskService: TaskService) { }

  ngOnInit() {
      console.log("fetching data")
      return this.taskService.getTasks().subscribe(
          (tasks : any[]) => {
              this.tasks = this.tasks,
                  console.log(tasks)
      },  (error) => console.log(error)
      );
  }

  getDueDateLabel( task : Task){
      return task.completed ? 'label-success' : 'label-primary';
  }

  onTaskChange(event, task) {
      console.log('Task has changed');
      this.taskService.saveTask(task, event.target.checked).subscribe();
  }


}
