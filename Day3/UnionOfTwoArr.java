package Day3;
import java.util.*;

public class UnionOfTwoArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n = sc.nextInt();
        // Creating first arr and taking input of n size 
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }


        System.out.print("Enter the size of Second array: ");
        int k = sc.nextInt();
        // Creating Second arr and taking input of k size 
        int[] arr2 = new int[k];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }



        // Using ArrayList 

        ArrayList<Integer> ll = new ArrayList<>();
        for(int num : arr1){
            if(!ll.contains(num)){
                ll.add(num);
            }
        }
        for(int num2 : arr2){
            if(!ll.contains(num2)){
                ll.add(num2);
            }
        }
        System.out.println(ll);

        // --------------------------------------------------------------------------------------------
        
        // Using HashSet 
        // Creating HashSet for adding unique elements 
        // HashSet<Integer> union = new HashSet<>();
        // for(int num : arr1){
        //     union.add(num);
        // }
        // for(int num2 : arr2){
        //     union.add(num2);
        // }
        // System.out.println(union);


        // -------------------------------------------------------------------------------------------------


    }
    
}
