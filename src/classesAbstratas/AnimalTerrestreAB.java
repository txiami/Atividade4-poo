package classesAbstratas;

public abstract class AnimalTerrestreAB extends AnimalAB {
    private int quantidadePatas;

    public AnimalTerrestreAB(int idade, String nome, String tipo, String habitat, double peso, double altura, int quantidadePatas) {
        super(idade, nome, tipo, habitat, peso, altura);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public String toString() {
        return "AnimalTerrestreAB{" +
                "quantidadePatas=" + quantidadePatas +
                ", idade=" + idade +
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
