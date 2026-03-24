package SistemaFuncionarios.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;
    public boolean ativo;

    public void imprimeDados() {
        System.out.println("Nome do Funcionário: " + this.nome);

        System.out.println("Idade do Funcionário: " + this.idade);

        if (this.salario < 2000) {
            double aumento = (this.salario * 10) / 100;
            this.salario += aumento;
        }

        System.out.println("Salário do Funcionário: R$" + this.salario);

        if (this.idade > 60) {
            this.ativo = false;
        }
        String status = this.ativo ? "Funcionario ativo" : "Funcionario inativo";
        System.out.println("Está ativo: " + status);
        System.out.println("\n\n");
    }


}
