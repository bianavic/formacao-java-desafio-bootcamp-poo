package org.edu.fabs.desafio.domain;

public class Course extends Content {

    private int hour;

    public Course() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", hour=" + hour +
                '}';
    }

    @Override
    public double xpCalculator() {
        return XP_DEFAULT * hour;
    }

}
