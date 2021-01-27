public class StudentAppMain {

    public static void main(String[] args) {
        Student computerScienceStudent = new ComputerScienceStudent(42);
        String info = printStudentCourse(computerScienceStudent);
        System.out.println(info);


        Student historyStudent = new HistoryStudent(52);
        String info2 = printStudentCourse(historyStudent);
        System.out.println(info2);
    };

    static String printStudentCourse(Student student){
        return "Course " + student.getCourse();
    }

}
