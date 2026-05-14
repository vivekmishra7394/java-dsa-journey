package java_dsa_journey.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {4,6,7,87,5,234};
int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==15){
                count++;
                break;
            }
            
            
        }
        if(count!=0){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
