public class AverageofArray {
    public static void main(String[] args) {
        int arr[] = {5,56,56,6465,7768,87,65,546,45,32324,324,324,235,34,54,4};
int sum =0;
        for(int i=0;i<arr.length;i++){
sum = sum+arr[i];
        }

        int avg = sum/arr.length;

        System.out.println(avg);
    }
}
