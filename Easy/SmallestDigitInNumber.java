package java_dsa_journey.Easy;
public class SmallestDigitInNumber {
    
  
        public static void main(String[] args) {
            
            int num = 596;
    int smallest =Integer.MIN_VALUE;
            while(num>0){
                int current = num%10;
                num = num/10;
    
                if(current>smallest){
                    smallest = current;
                }
            }
            System.out.println(smallest);
        }
    }
