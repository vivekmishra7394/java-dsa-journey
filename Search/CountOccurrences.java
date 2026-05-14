package java_dsa_journey.Search;

public class CountOccurrences {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,4,5,5,5};
int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                count++;
            }
        }
        System.out.println(count);
    }
}
