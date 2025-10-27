import java.util.Scanner;
public class Montoya {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //  mag himog array
    String[][] accounts = new String[2][2];
    int UserandPasscount = 0;

    while (true) { 
          //the options for the user
        System.out.println("=================== LOGIN SYSTEM ==================");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        int menus = scan.nextInt();
        scan.nextLine();

        //mag himog system para sa options
        switch (menus) {
             
            case 1: 
            // create the log in system
            System.out.println("You have choosen Log in Option!");
            System.out.print("Enter Username: ");
            String userName1 = scan.nextLine();

            System.out.print("Enter Password: ");
            String password1 = scan.nextLine();

                boolean loggedIN = false;
            for (int i = 0; i < UserandPasscount; i++) {
                if (accounts[i][0].equals(userName1) && accounts[i][1].equals(password1)) {
                    System.out.println("HELLO "+ userName1 + "!");
                    loggedIN = true;
                    break;
                }
            }
            if (!loggedIN) {
                System.out.println("INVALID USERNAME OR PASSWORD. PLEASE TRY AGAIN");
            }
            break;

            case 2: 
            //create a regiter system 
            System.out.println("YOU HAVE CHOOSEN REGISTER OPTION");
                
    // if the account is full this will print
        boolean registered = false;
        
        if (UserandPasscount>= accounts.length) {
            System.out.println("Account limit reached, cannot register new account.");
            registered = true;
            break;
        }
            System.out.print("Enter Username: ");
            String userName2 = scan.nextLine();
            
            System.out.print("Enter Password: ");
            String password2 = scan.nextLine();
            
            System.out.println("Confirm Passoword: ");
            String confirmpass = scan.nextLine();

            //mag himog ug another system para sa confim passoword
             while (!password2.equals(confirmpass)){ 
                System.out.println("Passwords do not match, please try again.");
                System.out.println("Enter your password: ");
                password2 = scan.nextLine();
                System.out.println("Confirm your password:");
                confirmpass = scan.nextLine(); 
        }
        System.out.println("SUCCESSFULLY REGISTERED!");

        // dria nimo ibutang ang username ug passowrd na imong gihimo
        accounts[UserandPasscount][0] = userName2;
        accounts[UserandPasscount][1] = password2;
        UserandPasscount++;
        break;
    
        case 3: // mag himog system aron sa exit
        System.out.println("Goodbye!");
        scan.close();
        return;
    }
}

}
}
