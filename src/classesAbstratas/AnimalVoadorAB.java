package classesAbstratas;

public abstract class AnimalVoadorAB extends AnimalAB {
    int quantidadeAsas;
    double envergaduraAsa;


    public AnimalVoadorAB(int idade, String nome, String tipo, String habitat, double peso, double altura, int quantidadeAsas, double envergaduraAsa) {
        super(idade, nome, tipo, habitat, peso, altura);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

  public abstract void voar(int distanciaPercorrida);

}
