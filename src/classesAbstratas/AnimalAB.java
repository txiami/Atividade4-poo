package classesAbstratas;

import interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    private int idade;
    private String nome;
    protected String tipo;
    protected String habitat;
    protected double peso;
    protected double altura;
    protected double comidaIngerida = 0;
    protected double distanciaPercorrida = 0;
    protected double horasDormidas = 0;

    public AnimalAB(int idade, String nome, String tipo, String habitat, double peso, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.tipo = tipo;
        this.habitat = habitat;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public abstract void comer(int comidaIngerida);

    @Override
    public abstract void moverse(int distanciaPercorrida);

    @Override
    public abstract void dormir(int horasDormidas);
}
