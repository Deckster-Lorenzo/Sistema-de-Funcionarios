package SistemaFuncionarios.Main;

import SistemaFuncionarios.Dominio.Funcionario;

public class Programa {
    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[4];

        funcionario[0] = new Funcionario();
        funcionario[0].nome = "Deckster";
        funcionario[0].idade = 20;
        funcionario[0].salario = 1900;
        funcionario[0].ativo = true;

        funcionario[1] = new Funcionario();
        funcionario[1].nome = "Felipe";
        funcionario[1].idade = 41;
        funcionario[1].salario = 3500;
        funcionario[1].ativo = true;

        funcionario[2] = new Funcionario();
        funcionario[2].nome = "Ivonete";
        funcionario[2].idade = 65;
        funcionario[2].salario = 7000;
        funcionario[2].ativo = true;

        funcionario[3] = new Funcionario();
        funcionario[3].nome = "Renata";
        funcionario[3].idade = 46;
        funcionario[3].salario = 1500;
        funcionario[3].ativo = true;

        System.out.println("\n--------SISTEMA DE FUNCIONÁRIOS-------\n\n");

        for (Funcionario f : funcionario) {
            f.imprimeDados();
        }

        System.out.println("Funcionários ativos: " +Funcionario.imprimeQuantosFuncionariosAtivos(funcionario));
        System.out.println("Média Salarial: R$" +Funcionario.imprimeMediaSalarial(funcionario));

    }
}
