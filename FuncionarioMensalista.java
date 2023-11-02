package SegundoSemestre.Exerc111;

public class FuncionarioMensalista extends Funcionario{

    double Salario;
    double Desconto;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario, double desconto) {
        super(numeroCracha, nome, setor, funcao);
        Salario = salario;
        Desconto = desconto;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getDesconto() {
        return Desconto;
    }

    public void setDesconto(double desconto) {
        Desconto = desconto;
    }

    @Override
    public double calcularSalario() {
        return Salario - Desconto;
    }

    @Override
    public String toString() {
        return "\nFuncionarioMensalista{" +
                "\nnumeroCracha=" + getNumeroCracha() +
                ", \nnome='" + getNome() +
                ", \nsetor='" + getSetor() +
                ", \nfuncao='" + getFuncao() +
                ", \nSalario=" + Salario +
                ", \nDesconto=" + Desconto +
                ", \nCalculoSalario=" + calcularSalario()+
                "\n}";
    }
}
