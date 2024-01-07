import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = input.nextInt();
        isEven(number);
    }

    static void isEven(int a){
        if (a % 2 == 0)
            System.out.println("Even.");
        else
            System.out.println("Odd.");
    }
}
