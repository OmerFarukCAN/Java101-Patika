public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Math", "MAT101", "MAT");
        Course physics = new Course("Physics", "FZK101", "FZK");
        Course chemistry = new Course("Chemistry", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Devran", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Inek Saban", 4, "140144015", mat, physics, chemistry);
        s1.addBulkExamNote(50, 20, 40);
        s1.addBulkQuizNote(60, 50, 60);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", 4, "2211133", mat, physics, chemistry);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkQuizNote(80, 70, 50);
        s2.isPass();

        Student s3 = new Student("Hayta Ismail", 4, "221121312", mat, physics, chemistry);
        s3.addBulkExamNote(50, 20, 40);
        s3.addBulkQuizNote(40, 30, 50);
        s3.isPass();
    }
}