package Day3;
import java.util.*;

public class CommonBwTwoArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking first input from user 
        int n = sc.nextInt();

        // Creating first array of size 
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }


        // Taking Second input from user  
        int k = sc.nextInt();

        // Creating Second array of size K 
        int[] arr2 = new int[k];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }



        // Using HashSet 
        // Creating Hashset name set 
        HashSet<Integer> set = new HashSet<>();

        // Adding arr1 in set 
        for(int num : arr1){
            set.add(num);

        }

        // Here we are traversing in arr2 
        for(int num1 : arr2){
            if(set.contains(num1)){    //here checking the elements is present in set or not if present then print 
                System.out.print(num1 + " ");
            }
        }

        // -------------------------------------------------------------------------------- 


        // // Creating ArrayList to Add one array in Arraylist 
        // ArrayList<Integer> ll = new ArrayList<>();

        // // To print output in List we are making this list 
        // ArrayList<Integer> ll1 = new ArrayList<>();

        // // Adding first arr in list 
        // for(int num : arr1){
        //     ll.add(num);
        // }

        // // Here we are checking that no is present in first arr or not if present print that number 
        // for(int num1 : arr2){
        //     if(ll.contains(num1)){
        //         ll1.add(num1);
        //     }
        // }
        // System.out.println(ll1);


        // -----------------------------------------------------------------------------------------------


        // Alternative Approach 
        // Making List to add common element 
        // ArrayList<Integer> ll = new ArrayList<>();

        // // Here we are using two loops for both array 
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr2.length;j++){

        //         if(arr1[i]==arr2[j]){   //checking if it is equal or not if equal then add element in list 
        //             ll.add(arr1[i]);
        //         }
        //     }
        // }
        // System.out.println(ll);



    }
    
}
