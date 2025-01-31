import java.util.*;
public class FrequencyOfAlpahbets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        // str = str.toLowerCase();

        // Using HAshmap 

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


        // COnverting string to char Array 
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(ch==' ') continue; // if found space 

            int count =1 ;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]== ch){
                    count++;
                    arr[j]=0;  // Mark the character as counted
                }
            }
            if(arr[i]!=0){
                System.out.println(ch + " : " + count);
            }
        }




            //                 Step-by-Step Execution:
            // i	ch	j	arr[j] == ch	count	Updated arr
            // 0	'h'	1	❌	1	['h', 'e', 'l', 'l', 'o']
            // 0	'h'	2	❌	1	['h', 'e', 'l', 'l', 'o']
            // 0	'h'	3	❌	1	['h', 'e', 'l', 'l', 'o']
            // 0	'h'	4	❌	1	['h', 'e', 'l', 'l', 'o']
            // 1	'e'	2	❌	1	['h', 'e', 'l', 'l', 'o']
            // 1	'e'	3	❌	1	['h', 'e', 'l', 'l', 'o']
            // 1	'e'	4	❌	1	['h', 'e', 'l', 'l', 'o']
            // 2	'l'	3	✅	2	['h', 'e', 'l', 0, 'o']
            // 2	'l'	4	❌	2	['h', 'e', 'l', 0, 'o']
            // 3	0	-	Skipped	-	Skipped
            // 4	'o'	-	-	1	['h', 'e', 'l', 0, 'o']
            // Final Output:
            // h : 1
            // e : 1
            // l : 2
            // o : 1

           
        
    }
    
}
