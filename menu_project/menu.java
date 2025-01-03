import java.util.Scanner;

class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int total=0;
        boolean key = false;
        // form continue Start;
        while(!key){
            System.out.println("1) Soups");
            System.out.println("2) South Indian");
            System.out.println("3) Subji");
            System.out.println("4) Rice");
            System.out.println("5) Desserts");
            System.out.println("6) Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("You selected option " + choice);
            switch (choice) {
                case 1: // Soups
                    while (true) {
                        System.out.println("You selected Soups");
                        System.out.println("1) Tomato Soup ......................... Rs.100");
                        System.out.println("2) Sweet Corn Soup ......................... Rs.120");
                        System.out.println("3) Hot and Sour Soup ......................... Rs.130");
                        System.out.println("4) Manchow Soup ......................... Rs.140");
                        System.out.println("5) Back");
                        System.out.print("Enter your choice: ");
                        int soupChoice = sc.nextInt();
                        if (soupChoice == 5) break;
                        System.out.print("Enter Quantity: ");
                        int quantity=sc.nextInt();
                        
                        switch (soupChoice) {
                            case 1: total += 100*quantity; break;
                            case 2: total += 120*quantity; break;
                            case 3: total += 130*quantity; break;
                            case 4: total += 140*quantity; break;
                            default: System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break;

                case 2: // South Indian
                    while (true) {
                        System.out.println("You selected South Indian");
                        System.out.println("1) Dosa ......................... Rs.50");
                        System.out.println("2) Idli ......................... Rs.40");
                        System.out.println("3) Vada ......................... Rs.45");
                        System.out.println("4) Uttapam ......................... Rs.60");
                        System.out.println("5) Pongal ......................... Rs.70");
                        System.out.println("6) Back");
                        System.out.print("Enter your choice: ");
                        int southIndianChoice = sc.nextInt();
                        
                        if (southIndianChoice == 6) break;
                        System.out.print("Enter Quantity: ");
                        int quantity=sc.nextInt();
                        
                        switch (southIndianChoice) {
                            case 1: total += 50*quantity; break;
                            case 2: total += 40*quantity; break;
                            case 3: total += 45*quantity; break;
                            case 4: total += 60*quantity; break;
                            case 5: total += 70*quantity; break;
                            default: System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break;

                case 3: // Subji
                    while (true) {
                        System.out.println("You selected Subji");
                        System.out.println("1) Aloo Gobi ......................... Rs.80");
                        System.out.println("2) Bhindi Masala ......................... Rs.90");
                        System.out.println("3) Paneer Butter Masala ......................... Rs.150");
                        System.out.println("4) Chole Masala ......................... Rs.100");
                        System.out.println("5) Malai Kofta ......................... Rs.120");
                        System.out.println("6) Back");
                        System.out.print("Enter your choice: ");
                        int subjiChoice = sc.nextInt();
                        
                        if (subjiChoice == 6) break;
                        System.out.print("Enter Quantity: ");
                        int quantity=sc.nextInt();
                        
                        switch (subjiChoice) {
                            case 1: total += 80*quantity; break;
                            case 2: total += 90*quantity; break;
                            case 3: total += 150*quantity; break;
                            case 4: total += 100*quantity; break;
                            case 5: total += 120*quantity; break;
                            default: System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break;

                case 4: // Rice
                    while (true) {
                        System.out.println("You selected Rice");
                        System.out.println("1) Biryani ......................... Rs.200");
                        System.out.println("2) Pulao ......................... Rs.150");
                        System.out.println("3) Curd Rice ......................... Rs.80");
                        System.out.println("4) Lemon Rice ......................... Rs.90");
                        System.out.println("5) Tamarind Rice ......................... Rs.100");
                        System.out.println("6) Back");
                        System.out.print("Enter your choice: ");
                        int riceChoice = sc.nextInt();
                        
                        if (riceChoice == 6) break;
                        System.out.print("Enter Quantity: ");
                        int quantity=sc.nextInt();
                        
                        switch (riceChoice) {
                            case 1: total += 200*quantity; break;
                            case 2: total += 150*quantity; break;
                            case 3: total += 80*quantity; break;
                            case 4: total += 90*quantity; break;
                            case 5: total += 100*quantity; break;
                            default: System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break;

                case 5: // Desserts
                    while (true) {
                        System.out.println("You selected Desserts");
                        System.out.println("1) Gulab Jamun ......................... Rs.50");
                        System.out.println("2) Rasgulla ......................... Rs.60");
                        System.out.println("3) Jalebi ......................... Rs.75");
                        System.out.println("4) Kheer ......................... Rs.80");
                        System.out.println("5) Halwa ......................... Rs.90");
                        System.out.println("6) Back");
                        System.out.print("Enter your choice: ");
                        int dessertChoice = sc.nextInt();
                        
                        if (dessertChoice == 6) break;
                        System.out.print("Enter Quantity: ");
                        int quantity=sc.nextInt();
                        
                        switch (dessertChoice) {
                            case 1: total += 50*quantity; break;
                            case 2: total += 60*quantity; break;
                            case 3: total += 75*quantity; break;
                            case 4: total += 80*quantity; break;
                            case 5: total += 90*quantity; break;
                            default: System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break;

                case 6: // Exit
                    key= true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Amount to pay :- " + total);
        // sc.close();
    }
}