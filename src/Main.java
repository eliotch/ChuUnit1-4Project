import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String firstName="";
        String lastName="";
        int num=0;
        String domain="";
        String extension="";
        String option="";
        int passwordLen;
        RandomEmail defaultEmail=new RandomEmail();
        System.out.println("Welcome to the email and password generator");
        System.out.println("Are you here to generate a personal email or a random email? (p for personal, r for random): ");
        String emailType=scan.nextLine();
        if(emailType.equals("p")){
            System.out.println("Email set up: ");
            System.out.println("Email example: "+defaultEmail.toString());
            System.out.println("Enter your first name: ");
            firstName=scan.nextLine();
            System.out.println("Enter your last name: ");
            lastName=scan.nextLine();
            System.out.println("Enter a number: ");
            num=Integer.parseInt(scan.nextLine());
            System.out.println("Enter the domain (i.e gmail, yahoo): ");
            domain=scan.nextLine();
            System.out.println("Enter the extension (do not include \".\" before the extension (i.e com): ");
            extension=scan.nextLine();
            RandomEmail email=new RandomEmail(firstName, lastName, num, domain, extension);
            System.out.println(email.toString());
            System.out.println("Do you also want variations of your email address?(y for yes, n for no): ");
            option=scan.nextLine();
            if(option.equals("y")){
                System.out.println(email.emailVariation());
            }
            System.out.println("Final Step:\nEnter the length of the password (between 9-16 characters): ");
            passwordLen= scan.nextInt();
            if(passwordLen>=9&&passwordLen<=16){
                System.out.println("Your generated password: \n"+email.random(passwordLen));
            }else{
                while(!(passwordLen>=9&&passwordLen<=16)){
                    System.out.println("Not between 9-6 characters. Enter the length of the password (between 9-16 characters): ");
                    passwordLen= scan.nextInt();
                }
                System.out.println("Your generated password: \n"+email.random(passwordLen));
            }
            System.out.println("Thank you for using our service");

        }else if(emailType.equals("r")){
            defaultEmail.randomEmail();
            System.out.println("Your generated password: \n"+defaultEmail.random(16));
            System.out.println("Thank you for using our service");
    }

    }
}