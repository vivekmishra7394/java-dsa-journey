package java_dsa_journey.Easy;
public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {3,3,45,43,4,56,6,676,7,76,6,86,8,8,9};
        for(int i=0;i<arr.length/2;i++){

           int  temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
           
        }

        for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
        }

    }
}
