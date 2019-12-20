// declaration of package web
package co.simplon.web;

// imports
import lombok.Data;

//annotations
@Data
//use class
	public class RegisterForm {
		private String username;
		private String password;
		private String repassword;
	}
// end