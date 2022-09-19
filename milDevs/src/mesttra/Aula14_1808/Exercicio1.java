package mesttra.Aula14_1808;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdeHomens, qtdeMulheres, totalAlunos;
        String nomeUsuario;

        System.out.print("Digite o seu nome: ");
                nomeUsuario = teclado.nextLine();

        System.out.print("Informe a quantidade de homens matriculados na sala de aula: ");
        qtdeHomens = teclado.nextInt();

        System.out.print("Informe a quantidade de mulheres matriculadas na sala de aula: ");
        qtdeMulheres = teclado.nextInt();
        System.out.println(nomeUsuario + qtdeHomens + qtdeMulheres);

        totalAlunos = qtdeHomens + qtdeMulheres;
        System.out.println(totalAlunos);

        System.out.print("Olá " + nomeUsuario + " a porcentagem de homens na sala de aula é igual a ");
        System.out.printf("%.2f%%\n", qtdeHomens/(float)totalAlunos * 100);

        System.out.print("Olá " + nomeUsuario + " a porcentagem de mulheres na sala de aula é igual a ");
        System.out.printf("%.2f%%", qtdeMulheres/(float)totalAlunos * 100);

    }
}
