/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author Vinicius
 */
class nomeCachorro {

    public String raca;
    public String cor;
    public String porte;
    public int idade;
    public String nome;
    private int tamanho;

    public void latir() {
        if (tamanho > 60) {
            System.out.println("Wooof, Wooof!");
        } else if (tamanho > 14) {
            System.out.println("Ruff, Ruff!");
        } else {
            System.out.println("Yipi, Yipi!");
        }
    }

    public nomeCachorro(String racas, String color, String port, String nom, int anos) {
        raca = racas;
        cor = color;
        porte = port;
        idade = anos;
        nome = nom;
    }

    public String getInfos() {
        return "\nRaça cão: " + raca + "\nCor do Cão: " + cor + "\nPorte Cão: "+ porte + "\nNome: "+nome + "\nidade: " + idade;
    }
}
