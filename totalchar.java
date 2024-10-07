import java.util.Scanner;
public class totalchar {
    public static void main(String[] args){
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(word.length());
    }
}
