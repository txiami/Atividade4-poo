package animais;

import classesAbstratas.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {


    public Gato(int idade, String nome, String tipo, String habitat, double peso, double altura, int quantidadePatas) {
        super(idade, nome, tipo, habitat, peso, altura, quantidadePatas);
    }

    @Override
    public void comer(int comidaIngerida) {
        this.comidaIngerida += comidaIngerida;
        System.out.println("O gato comeu " + comidaIngerida + " gramas de comida");
    }

    @Override
    public void moverse(int distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
        System.out.println("O gato percorreu " + distanciaPercorrida + " metros");
    }

    @Override
    public void dormir(int horasDormidas) {
        this.horasDormidas += horasDormidas;
        System.out.println("O gato dormiu " + horasDormidas + " horas");
    }
}
