package AtividadeRevisao1;

import java.util.Scanner;

public class ExemplosRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // Criar um projeto para ler 2 notas e a Frequencia
        System.out.println("Informe a Primeira Nota do Aluno.");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Segunda Nota do Aluno.");
        int nota2 = sc.nextInt();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média do Aluno foi de " + media + " .");
        System.out.println("Informe o Número Total de Aulas Dadas.");
        int aulasDadas = sc.nextInt();
        System.out.println("Indique o Número de Faltas do Aluno.");
        int nFaltas = sc.nextInt();
        // calcular a porcentagem de frequência
        double frequencia = ((aulasDadas - nFaltas) * 100) / aulasDadas;
        System.out.println("A Frequência do Aluno foi de " + frequencia + " %.");

        if (media >= 50 && frequencia >= 75) {
            System.err.println("O Aluno está Aprovado!!");
        } else if (media < 50 && frequencia >= 75) {
            System.out.println("O Aluno está de Recuperação!!");
        } else {
            System.out.println("O Aluno está Reprovado!!");
        }

    }
}
