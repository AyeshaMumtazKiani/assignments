class Student {

    int id;
    String name;
    String email;
    int semester;
    int age;

    void enrollCourse() {
        System.out.println(name + " enrolled in a course.");}

    void dropCourse() {
        System.out.println(name + " dropped a course.");}

    void changeSection() {
        System.out.println(name + " changed the section.");
    }

    void viewCourses() {
        System.out.println(name + " is viewing courses.");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 27;
        s1.name = "Ayesha";
        s1.email = "ayesha@gmail.com";
        s1.semester = 2;
        s1.age = 19;

        System.out.println("Student ID: " + s1.id
                + "/nName: " + s1.name
                + "/nEmail: " + s1.email
                + "/nSemester: " + s1.semester
                + "/nAge:" + s1.age );
        s1.enrollCourse();
        s1.dropCourse();
        s1.changeSection();
        s1.viewCourses();
    }
}