package IbrahimsMentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        String name = "madam";
        String reversed = "";

        List<String> names = new ArrayList<>();

        for(int i = name.length()-1 ; i >= 0 ; i--){
            reversed += name.charAt(i);
        }

        System.out.println(name.equalsIgnoreCase(reversed));
    }
}
