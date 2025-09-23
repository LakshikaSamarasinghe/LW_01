import java.util.Scanner;

public class Question_03 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Length in centimeters : ");
        float length = scanner.nextFloat();
        int feet = (int) length/30;
        float inch = (float) ((length%30)/2.54);
        System.out.println("Feet : "+feet);
        System.out.println("inch : "+inch);

    }
}
