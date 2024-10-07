// find the largest and smallest element in an array 
public class min_max {
    public static void main(String [] args){
        int arr[] = {24,423,62,35,2156};
        int max = 0;
        for(int i=0; i<arr.length ;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
        
        int min = max;
        for(int i=0; i<arr.length ;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The smallest element in the array is " + min);
        
    }

}
