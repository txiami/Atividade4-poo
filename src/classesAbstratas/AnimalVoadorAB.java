package classesAbstratas;

public abstract class AnimalVoadorAB extends AnimalAB {
    double quantidadeAsas;
    double envergaduraAsa;

    public AnimalVoadorAB(int idade, String nome, String tipo, String habitat, double peso, double altura, double quantidadeAsas, double envergaduraAsa) {
        super(idade, nome, tipo, habitat, peso, altura);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    public double getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public void setQuantidadeAsas(double quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public String toString() {
        return "AnimalVoadorAB{" +
                "quantidadeAsas=" + quantidadeAsas +
                ", envergaduraAsa=" + envergaduraAsa +
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
