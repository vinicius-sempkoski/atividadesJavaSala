package com.mycompany.atividadessala;

/**
 *
 * @author Vinicius
 */
public class testeCachorro {

    public static void main(String[] args) {

        Cachorro cachorroFilho = new Cachorro();

        cachorroFilho.raca = "Pastor-Alemão";
        cachorroFilho.idade = 6;
        cachorroFilho.peso = 30;
        cachorroFilho.cor = "Capa Preta";
        cachorroFilho.porte = "Grande";

        Cachorro cachorroFilho2 = new Cachorro();

        cachorroFilho2.raca = "Pinsher";
        cachorroFilho2.idade = 3;
        cachorroFilho2.peso = 5;
        cachorroFilho2.cor = "Preto";
        cachorroFilho2.porte = "Pequeno";

        Cachorro cachorroFilho3 = new Cachorro();

        cachorroFilho3.raca = "Americano";
        cachorroFilho3.idade = 10;
        cachorroFilho3.peso = 15;
        cachorroFilho3.cor = "Preto e branco";
        cachorroFilho3.porte = "Grande";

        Cachorro cachorroFilho4 = new Cachorro();

        cachorroFilho4.raca = "Boder Colier";
        cachorroFilho4.idade = 4;
        cachorroFilho4.peso = 10;
        cachorroFilho4.cor = "Preto";
        cachorroFilho4.porte = "Medio";

        Cachorro cachorroFilho5 = new Cachorro();

        cachorroFilho5.raca = "Salsicha";
        cachorroFilho5.idade = 8;
        cachorroFilho5.peso = 4;
        cachorroFilho5.cor = "Marrom";
        cachorroFilho5.porte = "Pequeno";
    }
}
