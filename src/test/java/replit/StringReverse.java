package replit;

public class StringReverse {

    public static void main(String[] args) {
        String name = "Cholpon";
        System.out.println(reverseString(name));
    }

    public static String reverseString(String string){
        StringBuffer stringBuffer = new StringBuffer(string);
        String reversedString = stringBuffer.reverse().toString();
        return reversedString;
    }
}
