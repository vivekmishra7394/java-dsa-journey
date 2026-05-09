public class LargestNumber {
    public static void main(String[] args) {
        int arr [] = {35,56,65,6576,6,66,7,5,5778,6,6,6,6,68,68};

        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
