/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areatriangulo1;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class dadosAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");

        String nome = scan.nextLine();

        System.out.println("Informe seu sexo:");

        char sexo = scan.next().charAt(0);

        sexo = Character.toLowerCase(sexo);
        
        System.out.println("Seu nome é "+nome);
        switch (sexo) {
            case 'm' -> System.out.println("Seu sexo é masculino");
            case 'f' -> System.out.println("Seu sexo é feminino");
            case 'g' -> System.out.println("Você é beta");
            case 'l' -> System.out.println("Você é sigma");
            default -> System.out.println("Programador");
        }
    }
}
