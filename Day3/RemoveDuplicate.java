package Day3;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user 
        int n = sc.nextInt();

        // Creating array of size n 
        int[] array = new int[n];

        // Adding elements in array 
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }


        // Using Hashset 
        // Hashset automatically ignores Duplicates 
        HashSet<Integer> set = new HashSet<>();
        for(int num : array){
            set.add(num);

        }

        // Creating new array to add elements after removing duplicates 
        // Convert HashSet back to arr  
        // creating result array of set size 
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index] = num;
            index++;
        }
        
        System.out.println(Arrays.toString(result));



        // ----------------------------------------------------------------------------------

        // Using ArrayList 
        // Creating ArrayList name ll 
        // ArrayList<Integer> ll = new ArrayList<>();
        // for(int num : array){
        //     // Checking list contains num or not if already present it will not do anything if not it will add element
        //     if(!ll.contains(num)){
        //         ll.add(num);
        //     }
        // }
        // System.out.println(ll);
        


        // ------------------------------------------------------------------------------------------


        // Using Simple for loop 


        // int[] UniqueArr = new int[n];
        // int uniqueCount = 0;

        // Arrays.sort(array); 

        // for (int i = 0; i < array.length; i++) {
        //     boolean isDuplicate = false;

           
        //     for (int j = 0; j < uniqueCount; j++) {
        //         if (array[i] == UniqueArr[j]) {
        //             isDuplicate = true;
        //             break;
        //         }
        //     }

       
        //     if (!isDuplicate) {
        //         UniqueArr[uniqueCount] = array[i];
        //         uniqueCount++;
        //     }
        // }

        
        // int[] result = Arrays.copyOf(UniqueArr, uniqueCount);

    
        // System.out.println(Arrays.toString(result));

    }
}