package student_decorators;

import students.Student;

public class StypendiumRektora extends StudentDecorator {

    public StypendiumRektora(Student student) {
        super(student);
    }

    @Override
    public String getData() {
        return student.getData() + " + stypendium rektora";
    }

    @Override
    public double getScolarshipAmount() {
        double stypendiumRektora = 1500;
        return super.getScolarshipAmount() + stypendiumRektora;
    }
}
