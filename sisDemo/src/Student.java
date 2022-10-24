public class Student {
    String name, stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int physics, int chemistry) {
        if (mat >= 0 && mat <= 100) {
            this.math.note = mat;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
    }

    public void addBulkQuizNote(int mat, int physics, int chemistry) {
        if (mat >= 0 && mat <= 100) {
            this.math.quiz = mat;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.quiz = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.quiz = chemistry;
        }
    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notes are not fully entered.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average: " + this.average);
            if (this.isPass) {
                System.out.println("Passed class.");
            } else {
                System.out.println("Failed the class.");
            }
        }
    }

    public void calcAverage() {
        this.average = ((this.physics.note * 0.8 + this.physics.quiz * 0.2) +
                (this.chemistry.note * 0.8 + this.chemistry.quiz * 0.2) +
                (this.math.note * 0.8 + this.chemistry.quiz * 0.2)) / (3);
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student: " + this.name);
        System.out.println("Maths Note : " + (this.math.note * 0.8 + this.math.quiz * 0.2));
        System.out.println("Physics Note : " + (this.physics.note * 0.8 + this.physics.quiz * 0.2));
        System.out.println("Chemistry Note : " + (this.chemistry.note * 0.8 + this.physics.quiz * 0.2));
    }
}