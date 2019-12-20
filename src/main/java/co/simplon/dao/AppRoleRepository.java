// declaration of package dao
package co.simplon.dao;

// imports
import co.simplon.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//annotations
@RepositoryRestResource
// use class
	public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
		public AppRole findByRoleName(String roleName);
	}
// end