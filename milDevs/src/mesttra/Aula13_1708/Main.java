package mesttra.Aula13_1708;
import java.util.Scanner; //sempre aqui em cima

public class Main {

    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner teclado = new Scanner(System.in); //sempre abaixo do main

        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine(); //Ler do teclado um texto ou palavra

        System.out.print("Digite a sua idade: ");
        idade = teclado.nextInt(); //Ler do teclado o número inteiro

        System.out.print("Digite o seu peso: ");
        float peso = teclado.nextFloat(); //Ler do teclado número fracionado

        System.out.print("\n\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);



    }
}
