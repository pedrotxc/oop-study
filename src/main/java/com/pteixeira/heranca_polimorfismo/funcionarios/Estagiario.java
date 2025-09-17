package com.pteixeira.heranca_polimorfismo.funcionarios;

import java.math.BigDecimal;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus(){
        System.out.println("Bonus Estagiario: " + getSalario().multiply(BigDecimal.valueOf(0.05)));
    }
}
