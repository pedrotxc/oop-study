package com.pteixeira.heranca_polimorfismo.funcionarios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Desenvolvedor("Pedro", BigDecimal.valueOf(5000)));
        funcionarios.add(new Estagiario("Bento", BigDecimal.valueOf(5000)));
        funcionarios.add(new Gerente("Ana", BigDecimal.valueOf(5000)));

        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularBonus();
        }

    }
}
