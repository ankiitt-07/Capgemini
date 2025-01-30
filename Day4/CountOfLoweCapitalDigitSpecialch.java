import java.util.*;
public class CountOfLoweCapitalDigitSpecialch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countCharacters(str);

    }
    public static void countCharacters(String str){
        int lowerCaseCount=0; int upperCaseCount =0; int digitCount =0; int specialCharCount=0;
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                upperCaseCount++;
            }
            else if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }
            else if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                specialCharCount++;
            }
            else if(Character.isDigit(ch)){
                digitCount++;
            }
        }
        System.out.println("Uppercase Letters: " + upperCaseCount);
        System.out.println("Lowercase Letters: " + lowerCaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
    
}
