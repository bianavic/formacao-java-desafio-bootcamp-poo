package org.edu.fabs.desafio.domain;

import java.time.LocalDate;

public class Mentorship {

    private String title;
    private String description;
    private LocalDate mentorshipDate;

    public Mentorship() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", mentorshipDate=" + mentorshipDate +
                '}';
    }

    //    private void xpCalculator() {};

}
