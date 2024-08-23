package animais;

import classesAbstratas.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(int idade, String nome, String tipo, String habitat, double peso, double altura) {
        super(idade, nome, tipo, habitat, peso, altura);
    }

    @Override
    public void comer(int comidaIngerida) {
        this.comidaIngerida += comidaIngerida;
        System.out.println("O peixe comeu " + comidaIngerida + " gramas de comida");
    }

    @Override
    public void moverse(int distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
        System.out.println("O peixe percorreu " + distanciaPercorrida + " metros");
    }

    @Override
    public void dormir(int horasDormidas) {
        this.horasDormidas += horasDormidas;
        System.out.println("O peixe dormiu " + horasDormidas + " horas");
    }
}
