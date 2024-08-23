package classesAbstratas;

public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(int idade, String nome, String tipo, String habitat, double peso, double altura) {
        super(idade, nome, tipo, habitat, peso, altura);
    }

    @Override
    public String toString() {
        return "AnimalMarinhoAB{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", habitat='" + habitat + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", comidaIngerida=" + comidaIngerida +
                ", distanciaPercorrida=" + distanciaPercorrida +
                ", horasDormidas=" + horasDormidas +
                '}';
    }
}
