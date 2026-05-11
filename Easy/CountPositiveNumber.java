public class CountPositiveNumber {
    public static void main(String[] args) {
        int arr [] = {-1,4,5,-6,2,54,-23};
int countPositive = 0;
int countNegitive = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
countPositive++;
            }
            else{
                countNegitive++;
            }
        }
        System.out.println("Positive: "+countPositive + "\nNegitive: "+ countNegitive);
    }
}
