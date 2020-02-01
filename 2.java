import java.util.regex.*;

public class Main
{
    public static boolean checkUsername(String s){
        String pattern = "^x[A-Z]{4,7}x$";
        if (s.matches(pattern)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean checkPassword(String s){
        String pattern = "([a-z].*)([0-9].*)(\\W.*)([A-Z][A-Z][A-Z].*)";
        if (s.matches(pattern)){
            return true;
        }
        else{
            return false;   
        }
    }
    
	public static void main(String[] args) {
		boolean statusUsername = checkUsername("x");
		boolean statusPass = checkPassword("bggg23#KAF&");
		System.out.println("check username : "+statusUsername);
		System.out.println("check password : "+statusPass);
	}
}