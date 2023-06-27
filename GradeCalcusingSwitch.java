import java.util.Scanner;

public class GradeCalcusingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else {
            String grade;

            switch (score / 10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                case 5:
                    grade = "E";
                    break;
                default:
                    grade = "F";
            }

            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}
