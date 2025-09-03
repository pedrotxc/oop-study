package com.pteixeira.funcionarios;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void calcularBonus(){
        System.out.println("Bonus: " + this.salario.multiply(BigDecimal.valueOf(0.10)));
    }
}
