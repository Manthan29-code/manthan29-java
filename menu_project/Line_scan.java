import java.util.Scanner;
class Line_scan{
                       public static void main(String[] args)
			{
				// String ---class
				//      sc.next(); // single word
				//      sc.nextLine();//Single line---Multiple Words

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter word......");
				String  word=sc.next();
 				 // Consumes the leftover newline character
				sc.nextLine();
				System.out.println("Enter Line......");
				String  line=sc.nextLine();
      				System.out.println("Word :- " + word);
      				System.out.println("Line :- " + line);
				sc.close();


			}// main
}// class