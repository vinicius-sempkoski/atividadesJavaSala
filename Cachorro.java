/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadessala;

/**
 *
 * @author Vinicius
 */
public class Cachorro {
    
        public String raca;
        public String cor;
        public String porte;
        public int idade;
        public int peso;
        public int tamanho;
        
        public void latir(){
            if(tamanho > 60){
                System.out.println("Wooof, Wooof!");
            }
            else if (tamanho > 14){
                System.out.println("Ruff, Ruff!");
            }
            else{
                System.out.println("Yipi, Yipi!");
            }
        }
        
}
