// declaration of package entities
package co.simplon.entities;

// imports
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

//annotations
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

// use class
	public class AppUser {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(unique = true)
		private String username;
		@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
		private String password;
		private String actived;
		@ManyToMany(fetch = FetchType.EAGER)
		private Collection<AppRole> roles=new ArrayList<>();
	}
// end