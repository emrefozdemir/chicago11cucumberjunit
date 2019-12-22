package interviewQuestions;

public class timeInWords {
    public static void main(String[] args) {
        System.out.println(timeInWords(23, 31));
    }

    public static String timeInWords(int hour, int minute) {
        String result = "";
        String nums[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
        if (minute == 0) {
            if(hour > 12){
                if(hour == 24){
                    result = "twelve o'clock";
                }
                else {
                    result = nums[(hour
                            % 12)] + " o'clock";
                }
            } else {
                result = nums[hour] + " o'clock ";
            }
        }
        else if (minute == 1){
            if(hour > 12){
                if(hour == 24){
                    result = "one minute past twelve";
                }else {
                    result = "one minute past " + nums[(hour % 12)];
                }
            }
            else{
                result = "one minute past " + nums[hour];
            }
        }
        else if (minute == 15){
            if(hour > 12){
                if(hour == 24){
                    result = "quarter past twelve";
                }else {
                    result = "quarter past " + nums[(hour % 12)];
                }
            }else {
                result = "quarter past " + nums[hour];
            }
        }
        else if (minute == 59){
            result = "one minute to " + nums[(hour % 12) + 1];
        }
        else if (minute == 30) {
            if(hour == 24) {
                result = "half past twelve";
            }else{
                result = "half past " + nums[(hour % 12)];
            }
        }
        else if (minute == 45){
            result = "quarter to " + nums[(hour % 12) + 1];
        }

        else if (minute <= 30){
            if(hour > 12){
                if(hour == 24) {
                    result = nums[minute] + " minutes past twelve";

                }else{
                    result = nums[minute] + " minutes past " + nums[(hour % 12)];
                }
            }else {
                result = nums[minute] + " minutes past " + nums[hour];
            }
        }
        else if (minute > 30) {
            result = nums[60 - minute] + " minutes to " + nums[(hour % 12) + 1];
        }
        return result;
    }
}
