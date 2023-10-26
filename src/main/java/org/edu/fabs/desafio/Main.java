package org.edu.fabs.desafio;

import org.edu.fabs.desafio.domain.Bootcamp;
import org.edu.fabs.desafio.domain.Course;
import org.edu.fabs.desafio.domain.Dev;
import org.edu.fabs.desafio.domain.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /**
         * POLIMORFISMO
         *
         * Content courseContent1 = new Course();
         * Content mentorshipContent1 = new Mentorship();
         *
         * posso instanciar Mentorship e/ou Course pq elas sao filhas de Content
         *
         * ex de uso do polimorfismo: List<String> palavras = new ArrayList<>();
         */

        Course course1 = new Course();
        course1.setTitle("java");
        course1.setDescription("java course description");
        course1.setHour(8);

        Course course2 = new Course();
        course2.setTitle("javaScript");
        course2.setDescription("javaScript course description");
        course2.setHour(8);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("java mentorship");
        mentorship1.setDescription("java mentorship description");
        mentorship1.setMentorshipDate(LocalDate.now());

        Mentorship mentorship2 = new Mentorship();
        mentorship2.setTitle("javaScript mentorship");
        mentorship2.setDescription("javaScript mentorship description");
        mentorship2.setMentorshipDate(LocalDate.now());

        // CRIAR bootcamps
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("bootcamp java developer");
        bootcamp1.setDescription("bootcamp java developer description");
        bootcamp1.getContents().add(course1);
        bootcamp1.getContents().add(course2);
        bootcamp1.getContents().add(mentorship1);

        // INSTACIAR devs
        Dev dev1 = new Dev();
        dev1.setName("Gonzales");
        dev1.applyBootcamp(bootcamp1);
        System.out.println("Gonzales Content applied: " + dev1.getContentApplied());
        dev1.progression();
        dev1.progression();
        System.out.println(" - ");
        System.out.println("Gonzales Content applied: " + dev1.getContentApplied());
        System.out.println("Gonzales Content finalized: " + dev1.getContentFinalized());
        System.out.println("XP: " + dev1.totalXPCalculator());

        System.out.println("-------------------------");

        Dev dev2 = new Dev();
        dev2.setName("Nero");
        dev2.applyBootcamp(bootcamp1);
        System.out.println("Nero Content applied: " + dev2.getContentApplied());
        dev2.progression();
        dev2.progression();
        dev2.progression(); // resultado: [] pq dev2 concluiu todos os cursos
        System.out.println(" - ");
        System.out.println("Nero Content applied: " + dev2.getContentApplied());
        System.out.println("Nero Content finalized: " + dev2.getContentFinalized());
        System.out.println("XP: " + dev2.totalXPCalculator());

    }

}