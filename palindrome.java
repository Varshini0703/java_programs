public class palindrome {
    public static void main(String[] args){
        int num = 12321;
        int doop = num;
        int res = 0;
        while(doop!=0){
            int rem = doop%10;
            res = res * 10 + rem;
            doop = doop/10;
        }
        if(num == res){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not palindrome ");
        }
    }
}
