package student_decorators;

import students.Student;

public class StypendiumSocjalne extends StudentDecorator {

    public StypendiumSocjalne(Student student) {
        super(student);
    }

    @Override
    public String getData() {
        return student.getData() + " + stypendium socjalne";
    }

    @Override
    public double getScolarshipAmount() {
        double amountOfScolarship = 500;
        return student.getScolarshipAmount() + amountOfScolarship;
    }
}
