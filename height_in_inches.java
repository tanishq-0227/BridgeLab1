package problem_02;

import java.util.Scanner;
public class height_in_inches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
