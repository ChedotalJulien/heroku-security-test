// declaration of package dao
package co.simplon.dao;

// imports
import co.simplon.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// use class
	public interface TaskRepository extends JpaRepository <Task, Long> {
	
	}
// end
