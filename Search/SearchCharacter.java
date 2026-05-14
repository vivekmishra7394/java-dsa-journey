package java_dsa_journey.Search;

public class SearchCharacter {
    public static void main(String[] args) {
        String str = "hello";
int count = 0;
        for(int i=0;i<str.length();i++){
if(str.charAt(i)=='e'){
    count ++;
}
        }
if(count!=0){

    System.out.println("found");
}
    }
}
