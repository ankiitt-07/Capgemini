import java.util.*;
public class FrequencyOfAlpahbets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();


        // Map<Character, Integer> frequencyMap = new HashMap<>();

        // for (char ch : str.toCharArray()) {
        //     if (Character.isLetter(ch)) { // Only countHi alphabets
        //         frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        //     }
        // }

        // // Print the frequency
        // for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }



        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(ch==' ') continue;

            int count =1 ;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]== ch){
                    count++;
                    arr[j]=0;
                }
            }
            if(arr[i]!=0){
                System.out.println(ch + " : " + count);
            }
        }
        
    }
    
}
