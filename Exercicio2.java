/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author Vinicius
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        nomeCachorro cao = new nomeCachorro ("Pastor", "Preto", "Grande", "Brutos",65);
        System.out.println(cao.getInfos());
        cao.latir();
    }
}