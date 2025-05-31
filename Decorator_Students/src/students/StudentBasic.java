package students;

public class StudentBasic implements Student {
    private final String numerAlbumu;

    public StudentBasic(String numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
    }

    @Override
    public String getData() {
        return "Student nr " + numerAlbumu;
    }

    @Override
    public double getScolarshipAmount() {
        return 0;
    }
}
