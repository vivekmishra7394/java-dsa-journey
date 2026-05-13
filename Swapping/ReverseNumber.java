package java_dsa_journey.Swapping;
public class ReverseNumber {

    public static void main(String[] args) {
        
        int num = 123;
    
        while(num>0){
            int ans = num%10;
            num = num/10;
            System.out.println(ans);
        }
    }
    

    
}
