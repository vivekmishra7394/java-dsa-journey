public class CountDigitsinNUmber {
    public static void main(String[] args) {
        int n = 190809;
        int count =0;

        for (int i=n;i>0;){
            i = i/10;
            count++;
        }

        System.out.println(count);
    }
}
