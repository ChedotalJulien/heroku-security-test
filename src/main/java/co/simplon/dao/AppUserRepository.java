// declaration of package dao
package co.simplon.dao;

// imports
import co.simplon.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//annotations
@RepositoryRestResource
// use class
	public interface AppUserRepository extends JpaRepository<AppUser,Long> {
		public AppUser findByUsername(String username);
	}
// end