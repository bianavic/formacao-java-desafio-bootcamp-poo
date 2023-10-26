package org.edu.fabs.desafio.domain;

public abstract class Content {

    /**
     * HERANCA
     *
     * ABSTRACT => nao consigo instanciar, nao consigo criar o objeto Conteudo
     * -> ela é criada para evitar repeticao de codigo, para implementar atributos e metodos que ela possui nas classes filhas
     * protected => apenas classes filhas possuem acesso
     *  STATIC => porque poderei acessar fora da classe Content
     *  FINAL => representando como uma constante
     */
    protected static final double XP_DEFAULT = 10;

    private String title;
    private String description;

    public abstract double xpCalculator();

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

}
