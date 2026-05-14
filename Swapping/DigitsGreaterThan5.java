package java_dsa_journey.Swapping;

public class DigitsGreaterThan5 {
    public static void main(String[] args) {
        
        int num = 238364;
  
    int count =0;
        while (num>0){
   int ans = num%10;
   num = num/10;
    if(ans>5){
        count++;
    }
        }

        System.out.println(count);
    }
}
