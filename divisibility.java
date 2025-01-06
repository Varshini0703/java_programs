// 1328A - Divisibility Problem - codeforces
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Bz myObj = new Bz();
        for(int i=0;i<T;i++){
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            System.out.println("The count is: ");
            System.out.println(myObj.divisible(a,b,0));
        }
    }
}

class Bz{
    public int divisible(int a,int b, int count){
        if(a%b==0){
            return count;
        }
        else{
            a = a+1;
            count++;
            return divisible(a,b,count);
        }
    }
}
        
