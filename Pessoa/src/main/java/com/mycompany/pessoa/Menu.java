package com.mycompany.pessoa;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Menu {

    public static void main(String[] args) {
        Aluno i = new Aluno("Fernanda Gabriela", "132.547.587-08", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("data de nascimento: " + i.data_nascimento.toGMTString());

        Funcionario func = new Funcionario("Fernando", "123.365.545-55", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + func.nome);
        System.out.println("CPF: " + func.cpf);
        System.out.println("data de nascimento: " + func.data_nascimento.toGMTString());

        Professor prof = new Professor("Carlos", "123.365.545-55", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + prof.nome);
        System.out.println("CPF: " + prof.cpf);
        System.out.println("data de nascimento: " + prof.data_nascimento.toGMTString());
    }

}
