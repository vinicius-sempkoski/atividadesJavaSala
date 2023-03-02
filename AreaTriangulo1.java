/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.areatriangulo1;

/**
 *
 * @author Vinicius
 */

import java.util.Scanner;

public class AreaTriangulo1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float altura, base, areaCm;
        float areaM;
        
        System.out.println("Qual é a altura do triangulo?");
        
        altura = scan.nextFloat();
                
        System.out.println("Qual é a base do triangulo?");
        
        base = scan.nextFloat();
        
        areaCm = (base * altura) / 2;
        areaM = (areaCm / 100);
        System.out.println("A area do triangulo em centimetros é "+areaCm+"cm \n "
                + "A area do triangulo em metros é "+areaM+"metros");
    }
}
