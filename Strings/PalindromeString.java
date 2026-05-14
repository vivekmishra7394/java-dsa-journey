package java_dsa_journey.Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String original = "madam";
        String reverse = "";

    for(int i=original.length()-1;i>=0;i--){
reverse = reverse + original.charAt(i);

    }
    System.out.println(reverse);
  

    if(original.equals(reverse)){
        System.out.println("yes this is palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
    }
}
