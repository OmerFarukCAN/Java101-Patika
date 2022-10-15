import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mathGrade, physicsGrade, chemistryGrade, turkishGrade, historyGrade, musicGrade;
        Scanner inp = new Scanner(System.in);

        System.out.print("Your math grade: ");
        mathGrade = inp.nextInt();

        System.out.print("Your physics grade: ");
        physicsGrade = inp.nextInt();

        System.out.print("Your chemistry grade: ");
        chemistryGrade = inp.nextInt();

        System.out.print("Your turkish grade: ");
        turkishGrade = inp.nextInt();

        System.out.print("Your history grade : ");
        historyGrade = inp.nextInt();

        System.out.print("Your music grade : ");
        musicGrade = inp.nextInt();

        int total = mathGrade + physicsGrade + chemistryGrade + turkishGrade + historyGrade + musicGrade;
        double gradeAverage = total / 6.0;
        System.out.println("Your Grade Average: " + gradeAverage);

        boolean passCondition = gradeAverage >= 50;
        String passTheClass = passCondition ? "You passed the class." : "You failed the class.";
        System.out.println(passTheClass);

    }
}