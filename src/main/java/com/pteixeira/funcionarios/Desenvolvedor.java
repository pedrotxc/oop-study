package com.pteixeira.funcionarios;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus(){
        System.out.println("Bonus Dev: " + getSalario().multiply(BigDecimal.valueOf(0.15)));
    }
}
