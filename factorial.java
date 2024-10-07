import java.util.Scanner;
public class factorial {
    public static void main(String [] args){
        System.out.println("enter number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fact = 1;
        for(int i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("factorial of number " + number + " is "+ fact);
    }
}
