package java_dsa_journey.Easy;
public class SmallestNumber {
    public static void main(String[] args) {
        int arr [] = {10,22,3,4,1,5,6,7};
int min = arr[0];
        for(int i=0;i<arr.length;i++){
if(min>arr[i]){
    min = arr[i];
}
        }
        System.out.println(min);
    }
}
