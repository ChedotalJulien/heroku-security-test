// declaration of package
package co.simplon;

//imports
import co.simplon.dao.TaskRepository;
import co.simplon.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

								// enter point of the application
//annotations
@SpringBootApplication
//use class
	public class HerokuSecurityTestApplication implements CommandLineRunner {
		//annotations
		@Autowired
		private TaskRepository taskRepository;
		
		public static void main(String[] args) {
			SpringApplication.run(HerokuSecurityTestApplication.class, args);
		}
		//annotations
		@Override
		public void run(String... arg0) throws Exception {
			Stream.of("T1","T2","T3").forEach(t->{
				taskRepository.save(new Task(null,t));
			});
			taskRepository.findAll().forEach(t->{
				System.out.println(t.getTaskName());
			});
		}
	}
//end