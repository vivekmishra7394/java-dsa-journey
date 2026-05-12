public class CountVowels2 {
    public static void main(String[] args) {
        String fruit = "apple";
int count =0;
        for(int i=0;i<fruit.length();i++){

            char ch = fruit.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
                count ++;
            }
        }
        System.out.println(count);

    }
}
