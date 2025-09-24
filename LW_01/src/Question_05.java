import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float ri;
        float ro;
        float ComputeArea;
        float computeCircumference;
        float setRadius;
        System.out.println("Enter inner circle radious :");
        ri = scanner.nextFloat();
        ComputeArea = (float) (3.14*ri*ri);
        System.out.println("Enter outer circle radious :");
        ro = scanner.nextFloat();
        computeCircumference = (float) (3.14*ro*ro);
        setRadius = (computeCircumference-ComputeArea);
        System.out.println("Area of the circle :"+setRadius);





    }

}
