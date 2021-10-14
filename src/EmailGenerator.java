import java.util.Scanner;

public class EmailGenerator {
    public static void userName(String first, String last){

    }
    public static void makeEmail(String username, String provider){

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Name Lowercase:");
        String firstName = scan.nextLine();
        System.out.println("Please Enter Last Name Lowercase:");
        String lastName = scan.nextLine();
        int fir = firstName.length();
        int first = fir/fir -1;
        int var = (int) (Math.random()*90+10);
        System.out.println("Please Enter Email Provider Lowercase:");
        String provider = scan.nextLine();
        System.out.print(firstName.charAt(first));
        System.out.print(lastName);
        System.out.print(var);
        System.out.println(provider);
        System.out.println("This is your randomly generated email.");

    }
}

