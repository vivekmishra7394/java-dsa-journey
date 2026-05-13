package java_dsa_journey.Easy;
public class CountEvenNumbers {
    
    public static void main(String[] args) {
        
        int arr [] = {234,3,5,54,556,56,57,57,6,54,56,43,423,234,324};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                 count++;
            }
            

        }
        System.out.println(count);
    }
}
