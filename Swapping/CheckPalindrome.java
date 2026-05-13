package java_dsa_journey.Swapping;

public class CheckPalindrome {

    public static void main(String[] args) {
        int num = 121;

        int reverse = 0;
        int original = num;

        while(num>0){
int r = num%10;
             reverse = reverse*10 + r;
            num=num/10;
        }

        if(original==reverse){
            System.out.print("NUmber is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    
}
