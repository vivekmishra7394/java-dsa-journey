package java_dsa_journey.Easy;
public class ReverseArrayy {
    public static void main(String[] args) {
        int arr [] = {32,43,45,56,65,65,67,6767};

        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
        }
    }
}
