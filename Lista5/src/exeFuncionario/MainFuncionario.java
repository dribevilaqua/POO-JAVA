package exeFuncionario;

import java.util.ArrayList;
import java.util.List;

public class MainFuncionario {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioCLT("Ana", 4000));
        funcionarios.add(new FuncionarioPJ("Carlos", 5000));
        funcionarios.add(new FuncionarioCLT("Mariana", 3500));

        for (Funcionario f : funcionarios) {
            f.exibirInfo();
        }
    }
}

