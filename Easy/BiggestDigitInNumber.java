
package java_dsa_journey.Easy;
public class BiggestDigitInNumber{
    public static void main(String[] args) {
        
        int num = 596;
int largest =0;
        while(num>0){
            int current = num%10;
            num = num/10;

            if(current>largest){
                largest = current;
            }
        }
        System.out.println(largest);
    }
}