package replit;

import java.util.Arrays;

public class Employees {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Sarah Clark", "Harsh Patel", "Philip Brown", "Mike Clark"};
        Employees employees = new Employees();
        System.out.println(Arrays.toString(employees.orderByLastName(names)));
    }

    public String[] orderByLastName(String[] names) {
        String[] reversed = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversed[i] = names[i].trim().split(" ")[1] + " " + names[i].trim().split(" ")[0];
        }
        Arrays.sort(reversed);

        System.out.println(Arrays.toString(reversed));

        for (int i = 0; i < names.length; i++) {
            reversed[i] = reversed[i].trim().split(" ")[1] + " " + reversed[i].trim().split(" ")[0];
        }
        return reversed;
    }
}
