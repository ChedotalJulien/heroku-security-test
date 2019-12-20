// declaration of package web
package co.simplon.web;

// imports
import co.simplon.entities.Task;
import co.simplon.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//annotations
	@RestController
//use class
	public class TestRestController {
		//annotations
		@Autowired
		private TaskRepository taskRepository;
		//annotations
		@GetMapping("/tasks")
		public List <Task> listTasks(){
			return taskRepository.findAll();
		}
		//annotations
		@PostMapping("/tasks")
		public Task save(@RequestBody Task t){
			return taskRepository.save(t);
		}
	}
// end