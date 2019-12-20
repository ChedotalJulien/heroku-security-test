// declaration of package service
package co.simplon.service;

// imports
import co.simplon.entities.AppRole;
import co.simplon.entities.AppUser;

// use class
	public interface AccountService {
		public AppUser saveUser(AppUser appUser);
		public AppRole save(AppRole role);
		public AppUser findUserByUsername(String username);
		public void addRoleToUser(String username,String roleName);
	}
// end