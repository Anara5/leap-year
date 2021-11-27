import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (true) {
            System.out.println("Enter the year and its days in format: yyyy days");
            int year = scanner.nextInt();
            int days = scanner.nextInt();

            if (leapYear(year) && days == 366) {
                score++;
            } else if (!leapYear(year) && days == 365) {
                score++;
            } else {
                System.out.println("Wrong! In this year is " + daysYear(year) + " days!");
                System.out.println("Your score: " + score);
                break;
            }
        }
    }

    private static boolean leapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 4 == 0) && (year % 400 == 0);
    }

    private static int daysYear(int days) {
        if (leapYear(days)) {
            return 366;
        } else {
            return 365;
        }
    }
}