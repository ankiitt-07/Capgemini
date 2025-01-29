package Day3;
import java.util.*;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the size of array 
        int n = sc.nextInt();
        
        // Creating an array of n size 
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        // creating boolean arr to check its visited the element or not 
        boolean[] Counted =  new boolean[n];

        // here its check it already counted or not 
        for(int i=0;i<n;i++){
            if(Counted[i]){
                continue;
            }
            // here checking how many times elements present 
            int count =1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    Counted[j]=true;
                }
            }

            System.out.println(" "+arr[i]+" | "+count);
        }
        

        
    }
    
}
