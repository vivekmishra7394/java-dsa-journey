public class ReverseNumber{
    public static void main(String[] args) {
        int n = 143;

        while(n>0){
          int remainder = n%10;
          n=n/10;
          System.out.print(remainder);
        }

    
    }
}