package Day2;
import java.util.*;
public class LargestandMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
            //     if(arr[i]>max){
                //         max = arr[i];
                //     }
                //     else if(arr[i]<min){
                    //         min=arr[i];
                    //     }
                    // }
                    int max = arr[0];
                    int min = arr[0];
        for( int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max Value : "+max);
        System.out.println("Min Value : "+min);
    }
    
}
