import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main
{
    public static String randomize(String s){
        String result = "";
        List<Integer> list = new ArrayList();
        Random random = new Random();
        while (list.size() < s.length()){
            int index = random.nextInt(s.length());
            if (!list.contains(index)){
                result = result+s.charAt(index);
                list.add(index);
            }   
        }
        return result;
    }
    
	public static void main(String[] args) {
		String string = randomize("akukk");
		System.out.println("output : "+string);
	}
}