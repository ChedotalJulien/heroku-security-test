// declaration of package service
package co.simplon.service;

// imports
import co.simplon.dao.AppRoleRepository;
import co.simplon.dao.AppUserRepository;
import co.simplon.entities.AppRole;
import co.simplon.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//annotations
@Service
@Transactional

//use class
	public class AccountServiceImpl implements AccountService {
		//annotations
		@Autowired
		private AppUserRepository appUserRepository;
		private AppRoleRepository appRoleRepository;
		private BCryptPasswordEncoder bCryptPasswordEncoder;
		//annotations
		@Override
		public AppUser saveUser(AppUser appUser) {
			appUser.setPassword(bCryptPasswordEncoder.encode(appUser.getPassword()));
			return appUserRepository.save(appUser);
			//return appUser;
		}
		//annotations
		@Override
		public AppRole save(AppRole role) {
			return appRoleRepository.save(role);
		}
		//annotations
		@Override
		public AppUser findUserByUsername(String username) {
			return appUserRepository.findByUsername(username);
		}
		//annotations
		@Override
		public void addRoleToUser(String username, String roleName) {
			AppUser appUser=appUserRepository.findByUsername(username);
			AppRole appRole=appRoleRepository.findByRoleName(roleName);
			appUser.getRoles().add(appRole);
		}
	}
// end