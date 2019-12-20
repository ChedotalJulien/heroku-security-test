// declaration of package entities
package co.simplon.entities;

// imports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//annotations
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

// use class
	public class AppRole {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String roleName;
		
	}
// end