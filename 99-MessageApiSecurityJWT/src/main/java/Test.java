import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
 public static void main(String[] args) {
	BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
	
	//We are encoding password
	//use encoded password in your Securityconfiguration file
	System.out.println(passwordEncoder.encode("zensar"));
}
}
