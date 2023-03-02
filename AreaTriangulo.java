/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areatriangulo;

/**
 *
 * @author Vinicius
 */

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int altura, base, total;
        
        System.out.println("Qual é a altura do triâgulo?");
        altura = scan.nextInt();
        
        System.out.println("Qual é a base do triângulo?");
        base = scan.nextInt();
        
        total = (base * altura) / 2;
        
        System.out.println("A área do triângulo é: "+total+" centímetros");
    }
}
