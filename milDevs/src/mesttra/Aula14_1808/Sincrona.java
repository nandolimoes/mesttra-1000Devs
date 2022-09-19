package mesttra.Aula14_1808;
import java.util.Scanner; //permite a leitura dos dados

public class Sincrona {

    public static void main(String[] args) {
        String nomeAluno;
        float valor = 8.9f;
        float valor2 = (float) 7/9;
        float x, y; //número inteiro teclado.nextInt();
        float peso; //número quebrado teclado.nextFloat();

        Scanner teclado = new Scanner(System.in);

        System.out.print("Texto \n\n\nquebrado sem ln\n");

        System.out.print("Favor Digite o seu nome: ");
        nomeAluno = teclado.nextLine();
        System.out.println("Nome lido: " + nomeAluno);
        //concatenar

        System.out.println("valor: " + (valor + 1));
        System.out.println(valor2);

        x = 47.8888f;
        y = 77.8988985f;
        System.out.printf("X: %.2f \nY: %.4f", x,y); //%vou formatar o conteúdo

        



    }
}
