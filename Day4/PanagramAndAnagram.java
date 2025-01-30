import java.util.*;
public class PanagramAndAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str = sc.nextLine();
        System.out.print("Enter the Second String : ");
        String str1 = sc.nextLine();
       
        // System.out.println("Is Panagram : "+ isPanagram(str));

        System.out.println("Is Anagram : "+ isAnagram(str, str1));

    }
    public static boolean isPanagram(String str){
        str = str.toLowerCase();
        // Creating Hashset 
        HashSet<Character> set = new HashSet<>();
        // Iterating over all the char 
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){ // checking all the charcters from a to z is present or not if yes then it is PAnagram
                set.add(ch); //adding character to set 
            }
          
        }
        return set.size()==26; // checking the length of set is 26 or bcz english alphabet has 26 letters
    }

    public static boolean isAnagram(String str , String str1){

        // Here remove all the spaces and converting into lower case 
        str = str.replaceAll("\\s","").toLowerCase();
        str1 = str1.replaceAll("\\s","").toLowerCase();

        // Here converting string to char array 
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();

        // if the length of both is not equal then its already false 
        if(ch1.length!=ch2.length) return false ;

        // Sorting both 
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        // Here checking both has same char or not 
        return Arrays.equals(ch1, ch2);
    }
    
}
