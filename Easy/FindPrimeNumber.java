package java_dsa_journey.Easy;
public class FindPrimeNumber {

    public static void main(String[] args) {
        
        int n = 83;
    
        boolean isPrime = true;
        for (int i=2;i<n;i++){
    if(n%i==0){
        isPrime = false;
        break;
    }
}
if(isPrime){

    System.out.println("yes");

    }
    else{
        System.out.println("no");
    }
}
    }

