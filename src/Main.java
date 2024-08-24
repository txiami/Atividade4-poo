import animais.*;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(10, "MAX", "Terrestre", "RUA", 0.8, 5, 4);
        Gato gato = new Gato(30, "GATA", "Terrestre", "Casa", 0.3, 3, 4);
        Elefante elefante = new Elefante(40, "CHUMBO", "Terrestre", "Savana", 3, 3000, 4);
        Peixe peixe = new Peixe(50, "NEMO", "Marinho", "Mar", 0.1, 0.1);
        Leao leao = new Leao(60, "SIMBA", "Terrestre", "Savana", 1.5, 150, 4);
        Pombo pombo = new Pombo(7, "JOSE", "Voador", "Cidade", 0.7, 0.2, 2, 0.5, 2);

        cachorro.comer(2);
        cachorro.moverse(10);
        cachorro.dormir(8);

        System.out.println("\n\n");

        gato.comer(1);
        gato.moverse(5);
        gato.dormir(10);

        System.out.println("\n\n");


        elefante.comer(50);
        elefante.moverse(20);
        elefante.dormir(12);

        System.out.println("\n\n");


        peixe.comer(1);
        peixe.moverse(2);
        peixe.dormir(2);

        System.out.println("\n\n");


        leao.comer(10);
        leao.moverse(15);
        leao.dormir(10);

        System.out.println("\n\n");


        pombo.comer(1);
        pombo.moverse(5);
        pombo.dormir(8);

        System.out.println("\n\n");


        System.out.println(cachorro.toString());
        System.out.println(gato.toString());
        System.out.println(elefante.toString());
        System.out.println(leao.toString());
        System.out.println(peixe.toString());
        System.out.println(pombo.toString());

    }
}