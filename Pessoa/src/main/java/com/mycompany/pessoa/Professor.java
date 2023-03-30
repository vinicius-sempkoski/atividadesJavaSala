package com.mycompany.pessoa;

import java.util.Date;

/**
 *
 * @author aluno
 */
    public class Professor extends Pessoa {

        public Professor(String _nome, String _cpf, Date _data) {
            super(_nome, _cpf, _data);
        }
        public double salario;
        public String disciplina;
    }

