import java.util.Scanner;
class calc{
                public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
                        int  choice , a, b;
                       System.out.println("1)Addition");
                       System.out.println("2)Subtraction");
                       System.out.println("3)Multiplication");
                       System.out.println("4)Division");
                       System.out.println("Enter Choice");
                      choice=sc.nextInt();
                       System.out.println("Enter value for a:-");
		      a=sc.nextInt();
			System.out.println("Enter value for b:-");
		       b=sc.nextInt();
                        switch(choice){
                                     case 1:
                                                   System.out.println("Answer is:-" + (a+b));
                                     break;
				     case 2:
                                                   System.out.println("Answer is:-" + (a-b));
                                     break;
				     case 3:
                                                   System.out.println("Answer is:-" + (a*b));
                                     break;
                                     case 4:
          					  if(b != 0 ){
                                                         System.out.println("Answer is:-" + (a/b));
						}else{
						        System.out.println("Invalid value of b");
						}
                                     break;
                                     default:
							 System.out.println("Invalid value of choice");
                                   
                        }//switch

                   }//main

}//class
