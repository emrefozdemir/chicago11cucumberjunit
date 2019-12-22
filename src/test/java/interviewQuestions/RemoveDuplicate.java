package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String name = "Java";
        String result = "";
//        List noDuplicate = new ArrayList<>();

        for(int i = 0; i < name.length(); i++) {
            int count = 0;
//            if(!noDuplicate.contains(name.charAt(i))){
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }
//        }
            if(count == 1){
                result += name.charAt(i);
            }
        }

        System.out.println(result);
    }
}
