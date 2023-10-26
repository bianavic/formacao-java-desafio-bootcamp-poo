package org.edu.fabs.desafio.domain;

import java.time.LocalDate;

public class Mentorship extends Content {

    private LocalDate mentorshipDate;

    public Mentorship() {
    }

    public LocalDate getMentorshipDate() {
        return mentorshipDate;
    }

    public void setMentorshipDate(LocalDate mentorshipDate) {
        this.mentorshipDate = mentorshipDate;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", mentorshipDate=" + mentorshipDate +
                '}';
    }

    @Override
    public double xpCalculator() {
        return XP_DEFAULT + 20;
    }

}
