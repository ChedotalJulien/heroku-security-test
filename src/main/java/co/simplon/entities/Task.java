// declaration of package entities
package co.simplon.entities;

// imports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//annotations
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

// use class
	public class Task {
		@Id @GeneratedValue
		private Long id;
		private String taskName;
	}
// end