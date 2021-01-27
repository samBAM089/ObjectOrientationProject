public class HistoryStudent implements Student{

    private int id;

    public HistoryStudent(int id) {
        this.id = id;
    }

    @Override
    public String getCourse() {
        return "History";
    }

    @Override
    public int numberOfExams() {
        return 5;
    }

    @Override
    public int getId() {
        return id;
    }
}
