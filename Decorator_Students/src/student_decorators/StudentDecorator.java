package student_decorators;

import students.Student;

public abstract class StudentDecorator implements Student {

    protected final Student student;

    public StudentDecorator(Student student) {
        this.student = student;
    }

    public String getData() {
        return student.getData();
    }


    public double getScolarshipAmount() {
        return student.getScolarshipAmount();
    }


}
