package java_dsa_journey.Strings;

public class PrintCharacters {
    public static void main(String[] args) {
        String greet = "hello";

        for(int i=0;i<greet.length();i++){
            System.out.print(greet.charAt(i));
        }
        System.out.println();
        System.out.println(greet.length());  //for checking string length
    }
}
