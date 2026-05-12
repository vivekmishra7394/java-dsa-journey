public class RepeatedNumbersInArray {
    public static void main(String[] args) {
        int arr [] = {234,3,243,5656,7,67,7,6};

int target = 7;
int count = 0;

        for(int i=0;i<arr.length;i++){
          if(target == arr[i]){
            count ++;
          }
        }
        System.out.println(target +" number comes " +count+ " times.");
    }
}
