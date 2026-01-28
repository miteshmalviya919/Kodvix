import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Welocome to console Bank");
            System.out.println("            ");
            System.out.println("""
                    1)openaccount
                    2)Deposite
                    3)Withdraw
                    4)Transfer
                    5)Account_Statement
                    6)ListAccount
                    7)Serch Account by Customer Name
                    0) Exit
                     """);

            System.out.print("Choice:  ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1" -> openAccount(sc);
                case "2" -> Deposite(sc);
                case "3" -> Withdraw(sc);
                case "4" -> Transfer(sc);
                case "5" -> statement(sc);
                case "6" -> listAccount(sc);
                case "7" -> searchAccount(sc);
                case "0" -> running = false;
            }
        }
    }

     public static void openAccount(Scanner sc){
        System.out.println("Customer name: ");
        String name = sc.nextLine().trim();
         System.out.println("Customer email: ");
         String email = sc.nextLine().trim();
         System.out.println("Account Type (SAVING/CURRENT): ");
         String type = sc.nextLine().trim();
         System.out.println("INITIAL deposit (optional , blank for 0): ");
         String amountStr = sc.nextLine().trim();
         Double intitial = Double.valueOf(amountStr);
        }

        public static void Deposite(Scanner sc ){

        }
        public static void Withdraw(Scanner sc ){

        }
        public static void Transfer(Scanner sc ){

        }

        public static void statement(Scanner sc ){

        }

        public static void listAccount(Scanner sc ){

        }

        public static void searchAccount(Scanner sc ){

        }


    }
}