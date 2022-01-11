
package Strings;

/**
 *
 * @author Aanam
 */
public class ReverseString {
    public static void main(String[] args) {
        String name="Anam";
        
       // System.out.println(reverse(name));
        System.out.println(reverseString(name));
    }
    //method 1
public static String reverse(String Name){
        Name=Name.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for(int i=Name.length()-1;i>=0;i--){
            char ch =Name.charAt(i);
            builder.append(ch);
            
        }
        return builder.toString();
    }
//method 2
public static String reverseString(String str){  
    char ch[]=str.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }  
    return rev;  
}  
} 
