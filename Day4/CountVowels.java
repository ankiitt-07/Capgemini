import java.util.*;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        str=str.toLowerCase();
        // System.out.println("Vowel Count : " + countVowelsUsingArr(str));
        System.out.println(" Vowel Count : "+ countVowelsUsingStr(str));
    }


    // here we are using string to find count 
    public static int countVowelsUsingStr(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
                // checking if this is present or not if yes increase count 
                if(ch=='a' || ch=='e' || ch == 'i' || ch=='o' || ch=='u'){ //if its finds any one of them then count will increasse by 1
                    count++;
                }
            }
            return count;

        }
    



        // Vowel Count Using Char Array
        public static int countVowelsUsingArr(String str){

        // Converting String into char Array to traverse 
        char[] arr = str.toCharArray();
        // Declaring initial count as 0 
        int count =0;
        // Iterating on each character 
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i] == 'i' || arr[i]=='o' || arr[i]=='u'){ //if its finds any one of them then count will increasse by 1
                count++;
            }
        }
        return count;
    }

    
    
}
