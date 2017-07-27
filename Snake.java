import java.util.Scanner;
public class Snake{
	public static void main(String[] args) {
		helper();
	}
	public static String helper(){
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();

		for( int i = 0; i < a ; i++){

		int b = input.nextInt();
		input.nextLine();
		String report = input.nextLine();

		if ((report.charAt(0)=='T' )||(report.charAt(b-1)=='H')||(occurance(report,"T")!=(occurance(report,"H")))){
			System.out.println( "Ivalid");
		} 
		else{
			System.out.println( "Valid");
		}
	}
	return "";
  }
 }
 public static int occurance(String a, String b){
 	int c =  a.length() - a.replaceAll(b,"").length();
 	return c;
 }
}