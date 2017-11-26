import { Component, OnInit } from '@angular/core';
import {TaskService} from "../task.service";
import {Task} from "../tasks.module";

@Component({
  selector: 'app-tasks-add',
  templateUrl: './tasks-add.component.html',
  styleUrls: ['./tasks-add.component.css']
})
export class TasksAddComponent implements OnInit {

  addTaskValue: string = null;

  constructor(private taskService: TaskService) { }

  ngOnInit() {
  }

  // onTaskAdd(event) {
  //     let task : Task = new Task(event.target.value, false, "todayString");
  //     this.taskService.addTask(task)
  //         .unsubscribe(
  //             (newTask : Task) => {
  //                 this.addTaskValue = ' ';
  //             }
  //         )
  // }

}
