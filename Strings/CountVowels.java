package java_dsa_journey.Strings;

public class CountVowels {
    public static void main(String[] args) {
        String vowels = "education";
int count =0;
        for(int i=0;i<vowels.length();i++){
            if(vowels.charAt(i)=='a'||vowels.charAt(i)=='e'||vowels.charAt(i)=='i'||vowels.charAt(i)=='o'||vowels.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
