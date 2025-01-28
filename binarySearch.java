import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
      for(int i=0; i<5; i++){
        arr[i] = sc.nextInt();
      }
      int low = 0;
      int high = 4;
      int target = 3;
      System.out.print(binarySearch(arr,target,low,high));
  }
    public static int binarySearch(int[] arr,int target,int low,int high){
      int mid = (low + high)/2;
      if(arr[mid]==target){
        return mid;
      }
      else if(arr[mid]>target){
        return binarySearch(arr,target,low,mid-1);
      }
      else{
        return binarySearch(arr,target,mid+1,high);
      }
    }
}
