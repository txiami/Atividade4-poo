package animais;

import classesAbstratas.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    public Pombo(int idade, String nome, String tipo, String habitat, double peso, double altura, double quantidadeAsas, double envergaduraAsa) {
        super(idade, nome, tipo, habitat, peso, altura, quantidadeAsas, envergaduraAsa);
    }

    @Override
    public void comer(int comidaIngerida) {
        this.comidaIngerida += comidaIngerida;
        System.out.println("O pombo comeu " + comidaIngerida + " gramas de comida");
    }

    @Override
    public void moverse(int distanciaPercorrida) {
        this.distanciaPercorrida += distanciaPercorrida;
        System.out.println("O pombo percorreu " + distanciaPercorrida + " metros");
    }

    @Override
    public void dormir(int horasDormidas) {
        this.horasDormidas += horasDormidas;
        System.out.println("O pombo dormiu " + horasDormidas + " horas");

    }
}
