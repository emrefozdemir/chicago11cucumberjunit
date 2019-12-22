package interviewQuestions;
import java.util.ArrayList;

public class SecretNapolean {
    public static void main(String[] args) {
        int numberOfPlayers=6;
        int [] ages = {18,18,18,18,18,18};
        int minutes = 60;

        System.out.println(secretNapolean(numberOfPlayers, ages, minutes));
    }

    public static ArrayList<Integer> secretNapolean(int numberOfPlayers, int[] ages, int minutes ) {
        ArrayList<Integer> values = new ArrayList<>();

        if (numberOfPlayers>=4&&numberOfPlayers<=27) {

            int countOfBonapartists = numberOfPlayers/2;
            int countOfRoyalists;
            int temp = numberOfPlayers-countOfBonapartists;

            if(temp%3==0) {
                countOfRoyalists=temp/3;
            }
            else {
                countOfRoyalists = (temp/3)+1;
            }

            int countOfCoalitionists=numberOfPlayers-countOfBonapartists-countOfRoyalists;
            int valueForNapolean;

            int countForOlderThan18=0;
            for (int h=0; h<ages.length; h++) {
                if (ages[h]>=18) {
                    countForOlderThan18++;
                }
            }

            double difference = Math.abs(countOfRoyalists-countOfBonapartists);
            if(countForOlderThan18==0) {
                valueForNapolean=0;
            }
            else if(difference<=3) {
                valueForNapolean=4;
            }
            else {
                valueForNapolean=5;
            }

            if(countOfCoalitionists%countOfRoyalists==0) {
                valueForNapolean=valueForNapolean-1;
            }

            if(numberOfPlayers%2==1) {
                valueForNapolean=valueForNapolean+1;
            }

            if(minutes<120) {
                valueForNapolean=3;
            }


            values.add(countOfBonapartists);
            values.add(countOfRoyalists);
            values.add(countOfCoalitionists);
            values.add(valueForNapolean);


        }
        else {
           values.add(-1);
        }


        return values;
    }
    /*
     *                Test Cases:
     *                #Test Happy Path-1 (6 players which is in the range of 4-27 players)
     *                secret_napoleon(6,[18,18,18,18,18,18],60).expects([3,1,2,3])
     *
     *                #Test Happy Path-2 (4 players which is at the bottom edge for the range of 4-27 players)
     *                secret_napoleon(4,[18,18,18,18,18,18],60).expects([2,1,1,3])
     *
     *                #Test Happy Path-3 (27 players which is at the top edge for the range of 4-27 players)
     *                secret_napoleon(27,[18,18,18,18,18,18],60).expects([13,5,9,3])
     *
     *                #Test Happy Path-4 (Number of players is in the range and the remaining time
     *
     *
     *
     *
     *
     *                #Test Negative Path-1 (3 players which is one less than the bottom edge for the range of 4-27 players)
     *                secret_napoleon(3,[18,18,18,18,18,18],60).expects([-1])
     *
     *                #Test Negative Path-2 (28 players which is one more than the top edge for the range of 4-27 players)
     *                secret_napoleon(28,[18,18,18,18,18,18],60).expects([-1])
     *
     *
     *
     */
}
