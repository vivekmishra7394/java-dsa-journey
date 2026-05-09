public class SumOfArray {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = {43,56,65,67,67,7,8,86,869,98,978,78};

        for (int i=0;i<arr.length;i++){
            sum = arr[i] + sum ;
        }
        System.out.println(sum);
    }
}
