import java.util.Arrays;

public class interview2 {
    public void printName(){
        System.out.println("Method overriding");
    }

    public static void main(String[] args) {
        String name1 = "abc:def:ghi";
        String [] eachName = name1.split(":",3);
        System.out.println(Arrays.toString(eachName));
    }
}
