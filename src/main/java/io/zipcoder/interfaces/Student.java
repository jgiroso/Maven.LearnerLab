package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private double totalStudyTime = 0.0;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {

        totalStudyTime = getTotalStudyTime() + numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
