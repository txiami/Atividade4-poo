package animais;

import classesAbstratas.AnimalTerrestreAB;

public class Leão extends AnimalTerrestreAB {

    public Leão(int idade, String nome, String tipo, String habitat, double peso, double altura, int quantidadePatas) {
        super(idade, nome, tipo, habitat, peso, altura, quantidadePatas);
    }

    @Override
    public void comer(int comidaIngerida) {
        this.comidaIngerida += comidaIngerida;
        System.out.println("O leão comeu " + comidaIngerida + " gramas de comida");
    }

    @Override
    public void moverse(int distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
        System.out.println("O leão percorreu " + distanciaPercorrida + " metros");
    }

    @Override
    public void dormir(int horasDormidas) {
        this.horasDormidas += horasDormidas;
        System.out.println("O leão dormiu " + horasDormidas + " horas");
    }
}
