package animais;

import classesAbstratas.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(int idade, String nome, String tipo, String habitat, double peso, double altura, int quantidadePatas) {
        super(idade, nome, tipo, habitat, peso, altura, quantidadePatas);
    }

    @Override
    public void comer(int comidaIngerida) {
        this.comidaIngerida += comidaIngerida;
        System.out.println("O elefante comeu " + comidaIngerida + " gramas de comida");
    }

    @Override
    public void moverse(int distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
        System.out.println("O elefante percorreu " + distanciaPercorrida + " metros");
    }

    @Override
    public void dormir(int horasDormidas) {
        this.horasDormidas += horasDormidas;
        System.out.println("O elefante dormiu " + horasDormidas + " horas");
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "tipo='" + tipo + '\'' +
                ", habitat='" + habitat + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", comidaIngerida=" + comidaIngerida +
                ", distanciaPercorrida=" + distanciaPercorrida +
                ", horasDormidas=" + horasDormidas +
                '}';
    }
}
