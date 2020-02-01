import java.util.regex.*;

public class Main
{
    public static String subtituteVowels(String s, char c){
        String pattern = "[aiueoAIUEO]";
        String result="";
        for (int i=0; i<s.length(); i++){
            String strChar = s.charAt(i)+"";
            if (strChar.matches(pattern)){
                result = result+c;
            }
            else{
                result = result+s.charAt(i);
            }
        }
        if (result.equals(s) || result.length() == 0){
            result = "Tidak ada huruf vokal!";
        }
        return result;
    }
    
	public static void main(String[] args) {
		String string = subtituteVowels("Selamat Pagi",'i');
		System.out.println("output : "+string);
	}
}