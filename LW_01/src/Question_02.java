import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fName;
        String mName;
        String lName;
        System.out.print("First Name :");
        fName = scanner.next();
        System.out.print("middle Name :");
        mName = scanner.next();
        System.out.print("Last Name :");
        lName = scanner.next();
        System.out.print("Name with initials :");
        System.out.print(lName+","+fName+" "+mName.substring(0,1));


    }
}
