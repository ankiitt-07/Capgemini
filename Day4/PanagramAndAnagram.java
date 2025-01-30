import java.util.*;
public class PanagramAndAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
       
        // System.out.println("Is Panagram : "+ isPanagram(str));
        System.out.println("Is Anagram : "+ isAnagram(str, str1));

    }
    public static boolean isPanagram(String str){
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
          
        }
        return set.size()==26;
    }

    public static boolean isAnagram(String str , String str1){
        str = str.replaceAll("\\s","").toLowerCase();
        str1 = str1.replaceAll("\\s","").toLowerCase();
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();
        if(ch1.length!=ch2.length) return false ;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
    
}
