package interviewQuestions;

public class ChristmastTree {
    public static void main(String[] args) {

        // to create 10 lines of Christmast Tree
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
