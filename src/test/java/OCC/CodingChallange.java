package OCC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CodingChallange {
    public static void main(String[] args) throws IOException {
//        String [] path = {"C:\\Users\\em_re\\Desktop\\OCC\\OCC coding challange\\OCC coding challenge(emre)\\OCC Take Home Coding names.txt"};
//        System.out.println(scoreOfallNames(path));
        System.out.println('a' - 'b');

    }

    // This reusable method is used to calculate scores of the list of names based on the letters in the names and positions of the names in the list
    public static int scoreOfallNames(String[] pathOfFile) throws IOException {
        // the first element of pathOfFile is the path of text file stored in String
        String path = pathOfFile[0];

        // readAllLines method takes the path of text file and return List of String
        List<String> lines = Files.readAllLines(Paths.get(path));

        // to manipulate the List of String I converted lines to String format
        // because all the names stored as a first element of lines so
        // I need to first convert to String then Array of String

        String names = lines.toString();

        // to remove [ from the String
        names = names.replace("[", "");

        // to remove ] from the String
        names = names.replace("]", "");

        // to remove "(quotation mark) from the String
        names = names.replace("\"", "");

        // to convert String to Array of String I used split method
        // which takes comma to get each name as a element of Array
        String[] listOfNames = names.split(",");

        // this is a int variable to store total score of names
        int totalScore = 0;
        int count = 0;

        // looping all the names in the list
//        for (int i = 0; i < listOfNames.length; i++) {
            for(String name: listOfNames){
            // this is a int variable to store every single name in the list after each iteration
            // it should be zero because it should calculate from the beginning every time
            int scoreOfEachName = 0;

            // this nested loop is used to calculate the value of every name
            for (int j = 0; j < name.length(); j++) {

                // ASSUMPTION
                // in case of having first name and last name they should be comma seperated
                // and we need to skip space, the decimal number of space is 32
                if (name.charAt(j) != 32) {

                    // every character has their own decimal number value. I used decimal
                    // number of characters in the ascii table. By subtracting the ascii value of letter 'a' because it is the first letter
                    // in the alphabet and adding 1 not to lose the value of 'a'.
                    scoreOfEachName += name.toLowerCase().charAt(j) - 'a' + 1;
                }
            }
            // adding every single value of name multiplied by the position of the name by adding 1 because index of array starts from zero
            totalScore += scoreOfEachName * (count + 1);
            count++;

        }

        return totalScore;
    }

}

