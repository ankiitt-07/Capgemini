import java.util.*;
public class CountOfLoweCapitalDigitSpecialch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        countCharacters(str);

    }
    public static void countCharacters(String str){
        // Here initialising all count as 0 
        int lowerCaseCount=0; int upperCaseCount =0; int digitCount =0; int specialCharCount=0;
        // Converting String to char  array and traversing 
        for(char ch : str.toCharArray()){
            // Here checking if the char is upper case if yes then increase count of uppercase 
            if(Character.isUpperCase(ch)){
                upperCaseCount++;
            }
            // here checking the char is lower case if yes then increase the count of lowe count 
            else if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }
            // Here checking the char is digit or not if yes then increase the count of digit count 
            else if(Character.isDigit(ch)){
                digitCount++;
            }
            // here checking the char is Special charcter or not if yes then increase the count of specialchar count 
            // else if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
            else if(ch != ' '){
                specialCharCount++;
            }
            
        }
        System.out.println("Uppercase Letters: " + upperCaseCount);
        System.out.println("Lowercase Letters: " + lowerCaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
    
}
