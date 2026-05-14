package java_dsa_journey.Strings;

public class CountUppercase {
    public static void main(String[] args) {
        String str = "hEellO";
int count = 0;
        for(int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
count++;
            }


        }
        System.out.println(count);
    }
}
