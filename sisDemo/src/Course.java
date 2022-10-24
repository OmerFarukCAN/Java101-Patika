public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;
    double quiz;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("The operation is successful.");
        } else {
            System.out.println(t.name + " academician cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(courseTeacher.name + " teacher, academician of " + this.name + " course");
        } else {
            System.out.println("No academician has been assigned to the " + this.name + " course.");
        }
    }
}