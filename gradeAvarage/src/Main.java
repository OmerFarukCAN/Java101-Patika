import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mathGrade, physicsGrade, chemistryGrade, turkishGrade, historyGrade, musicGrade, total;
        double gradeAverage;
        boolean passCondition;
        String passTheClass;
        Scanner sc = new Scanner(System.in);

        System.out.print("Your math grade: ");
        mathGrade = sc.nextInt();
        System.out.print("Your physics grade: ");
        physicsGrade = sc.nextInt();
        System.out.print("Your chemistry grade: ");
        chemistryGrade = sc.nextInt();
        System.out.print("Your turkish grade: ");
        turkishGrade = sc.nextInt();
        System.out.print("Your history grade: ");
        historyGrade = sc.nextInt();
        System.out.print("Your music grade: ");
        musicGrade = sc.nextInt();

        total = mathGrade + physicsGrade + chemistryGrade + turkishGrade + historyGrade + musicGrade;
        gradeAverage = total / 6.0;
        System.out.println("Your Grade Average: " + gradeAverage);

        passCondition = gradeAverage >= 50;
        passTheClass = passCondition ? "You passed the class." : "You failed the class.";
        System.out.println(passTheClass);
    }
}