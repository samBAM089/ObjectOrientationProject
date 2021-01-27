import java.util.Arrays;

public interface StudentDB {


    public Student[] getStudentList();

    public void setStudentList(Student[] studentList);


    public Student randomStudent() ;

    public void addStudent(Student newStudent) ;




}

