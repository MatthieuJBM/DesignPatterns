package student_decorators;

import students.Student;

public class StypendiumNaukowe extends StudentDecorator {
    public StypendiumNaukowe(Student student) {
        super(student);
    }

    @Override
    public String getData() {
        return student.getData() + " + stypendium naukowe";
    }

    @Override
    public double getScolarshipAmount() {
        double stypendiumNaukowe = 1000;
        return student.getScolarshipAmount() + stypendiumNaukowe;
    }
}
