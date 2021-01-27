public class ComputerScienceStudent  implements Student{

    private int id;

    public ComputerScienceStudent(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getCourse() {
        return "Computer Science";
    }

    @Override
    public int numberOfExams() {
        return 7;
    }


}
