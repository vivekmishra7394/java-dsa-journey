package java_dsa_journey.Search;

public class FindIndex {
    public static void main(String[] args) {
        int arr []={324,4,56,56,5,57,6,5,324234};
int target =4;
        for(int i=0;i<arr.length;i++){
            while(arr[i]==target){
                System.out.println("Found at index: "+i);
                break;
            }
            
            
        }

    }
}
