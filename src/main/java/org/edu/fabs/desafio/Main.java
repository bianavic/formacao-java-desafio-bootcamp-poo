package org.edu.fabs.desafio;

import org.edu.fabs.desafio.domain.Course;
import org.edu.fabs.desafio.domain.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("java");
        course1.setDescription("descricao do curso java");
        course1.setHour(8);

        Course course2 = new Course();
        course2.setTitle("javaScript");
        course2.setDescription("descricao do curso javaScript");
        course2.setHour(8);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("mentoria de java");
        mentorship1.setDescription("descricao da mentoria java");
        mentorship1.setMentorshipDate(LocalDate.now());

        Mentorship mentorship2 = new Mentorship();
        mentorship2.setTitle("mentoria de javaScript");
        mentorship2.setDescription("descricao da mentoria javaScript");
        mentorship2.setMentorshipDate(LocalDate.now());



        System.out.println(mentorship2);
    }

}