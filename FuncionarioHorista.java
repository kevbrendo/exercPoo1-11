package SegundoSemestre.Exerc111;

public class FuncionarioHorista extends Funcionario{

    int qtdeHoras;
    double valorHoras;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdeHoras, double valorHoras) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHoras = valorHoras;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHoras = valorHora;
    }

    @Override
    public double calcularSalario() {
        return qtdeHoras * valorHoras;
    }

    @Override
    public String toString() {
        return "\nFuncionarioHorista{" +
                "\nnumeroCracha=" + getNumeroCracha() +
                ", \nnome='" + getNome() + '\'' +
                ", \nsetor='" + getSetor() + '\'' +
                ", \nfuncao='" + getFuncao() + '\'' +
                ", \nqtdeHoras=" + qtdeHoras +
                ", \nvalorHoras=" + valorHoras +
                ", \nCalculo Salario=" +calcularSalario() +
                "\n}";
    }
}
