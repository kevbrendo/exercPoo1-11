package SegundoSemestre.Exerc111;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFuncionario {

    public static void main(String[] args) {
        int opt;
        int optFunc;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        FuncionarioHorista funcHorista;
        FuncionarioMensalista funcMensalista;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1- Cadastrar Funcionario\n2- Mostrar\n3- Sair");
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("Qual tipo de Funcionario: \n1-Horista \n2-Mensalista");
                    optFunc = sc.nextInt();
                    if (optFunc == 1) {
                        funcHorista = new FuncionarioHorista();
                        System.out.println("numeroCracha: \n");
                        funcHorista.setNumeroCracha(sc.nextInt());

                        System.out.println("nome: \n");
                        funcHorista.setNome(sc.next());

                        System.out.println("setor: \n");
                        funcHorista.setSetor(sc.next());

                        System.out.println("funcao: \n");
                        funcHorista.setFuncao(sc.next());

                        System.out.println("qtdeHoras: \n");
                        funcHorista.setQtdeHoras(sc.nextInt());

                        System.out.println("valorHora: \n");
                        funcHorista.setValorHora(sc.nextDouble());
                        funcionarios.add(funcHorista);
                        opt = 0;
                    } else if (optFunc == 2) {
                        funcMensalista = new FuncionarioMensalista();
                        System.out.println("numeroCracha: \n");
                        funcMensalista.setNumeroCracha(sc.nextInt());

                        System.out.println("nome: \n");
                        funcMensalista.setNome(sc.next());

                        System.out.println("setor: \n");
                        funcMensalista.setSetor(sc.next());

                        System.out.println("funcao: \n");
                        funcMensalista.setFuncao(sc.next());

                        System.out.println("salario: \n");
                        funcMensalista.setSalario(sc.nextDouble());

                        System.out.println("desconto: \n");
                        funcMensalista.setDesconto(sc.nextDouble());

                        funcionarios.add(funcMensalista);
                        opt = 0;
                    }
                }
                case 2 -> {
                    for (Funcionario funcs : funcionarios) {
                        System.out.println(funcs.toString());
                    }
                    opt = 0;
                }
            }
        } while (opt != 3);

    }
}
