package org.edu.fabs.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    /**
     * HERANCA
     * usando Content, a classe filha Dev consegue usar cursos e mentorias
     *
     * POLIMORFISMO
     * implementando LinkedHashSet atraves da classe mae Set
     * LinkedHashSet => para salvar na ORDEM no momento q me inscrever nos cursos
     * q só permite que seja adicionado 1 unica vez, nao tem como estar inscrito 2x num mesmo curso
     */

    private String name;
    private Set<Content> contentApplied = new LinkedHashSet<>();
    private Set<Content> contentFinalized = new LinkedHashSet<>();

    public void applyBootcamp(Bootcamp bootcamp) {
        this.contentApplied.addAll(bootcamp.getContents());
        bootcamp.getTotalDevsApplications().add(this); // adicionou este dev no grupo geral dos devs inscritos no bootcamp
    }

    public void progression() {
        Optional<Content> content = this.contentApplied.stream()
                .findFirst();
        if (content.isPresent()) {
            this.contentFinalized.add(content.get());
            // removo dos conteudos incritos
            this.contentApplied.remove(content.get());
        } else {
            System.err.println("You did not applied to any content");
        }
    }

    public double totalXPCalculator() {
        return this.contentFinalized.stream()
                .mapToDouble(Content::xpCalculator)
                .sum();
    }

    public Dev() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentApplied() {
        return contentApplied;
    }

    public void setContentApplied(Set<Content> contentApplied) {
        this.contentApplied = contentApplied;
    }

    public Set<Content> getContentFinalized() {
        return contentFinalized;
    }

    public void setContentFinalized(Set<Content> contentFinalized) {
        this.contentFinalized = contentFinalized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentApplied, dev.contentApplied) && Objects.equals(contentFinalized, dev.contentFinalized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentApplied, contentFinalized);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", contentApplied=" + contentApplied +
                ", contentFinalized=" + contentFinalized +
                '}';
    }

}
