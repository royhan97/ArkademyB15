public class Main
{
    public static void printSquare(int c){
        for (int i=0; i<c; i++){
            for (int j=0; j<c; j++){
                if (i==0 || i==c-1 || j==0 || j==c-1){
                    System.out.print("* ");   
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }
    }
    
	public static void main(String[] args) {
		printSquare(4);
	}
}