public class SumOfDigits {
    public static void main(String[] args) {
        
        int num=1234;
int sum = 0;
        
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }

        // for(int i=num;i>0;){
        //     sum = sum + i%10;
        // }
        System.out.println(sum);
    }
}
