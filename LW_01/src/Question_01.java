import java.util.Scanner;
public class Question_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter odd length word :");
        String x = scanner.next();
        int count = x.length();
        System.out.println("count of the letters in the word : "+count);
        int mid = count / 2;
        System.out.print("Middle Letter of the word : " + x.substring(mid, (mid + 1)));
    }
}

