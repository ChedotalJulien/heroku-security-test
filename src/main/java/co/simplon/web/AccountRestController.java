// declaration of package web
package co.simplon.web;

// imports
import co.simplon.entities.AppUser;
import co.simplon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//annotations
	@RestController
//use class
	public class AccountRestController {
		//annotations
		@Autowired
		private AccountService accountService;
		//annotations
		@PostMapping("/register")
		public AppUser register(@RequestBody RegisterForm userForm){
			if(!userForm.getPassword().equals(userForm.getRepassword()))
				throw new RuntimeException("you must confirm your password");
			
			AppUser user=accountService.findUserByUsername(userForm.getUsername());
			if(user!=null) throw new RuntimeException("this user already exists");
			
			AppUser appUser=new AppUser();
			appUser.setUsername(userForm.getUsername());
			appUser.setPassword(userForm.getPassword());
			
			return accountService.saveUser(appUser);
		}
	}
// end