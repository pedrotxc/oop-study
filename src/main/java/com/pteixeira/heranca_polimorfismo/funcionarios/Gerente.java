package com.pteixeira.heranca_polimorfismo.funcionarios;

import java.math.BigDecimal;

public class Gerente extends Funcionario {
    public Gerente(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus(){
        System.out.println("Bonus Gerente: " + getSalario().multiply(BigDecimal.valueOf(0.20)));
    }
}
