package mesttra.Aula14_1808;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float velocidade, consumo;
        System.out.print("Informe a velocidade do carro: ");
        velocidade = teclado.nextFloat();

        System.out.print("Informe o consumo médio do carro: ");
        consumo = teclado.nextFloat();

        System.out.println("A distância percorrida em 5 horas será de " + velocidade*5 + " km/h e gastará " + (velocidade*5)/consumo + " litros");
        System.out.println("A distância percorrida em 8 horas será de " + velocidade*8 + " km/h e gastará " + (velocidade*8)/consumo + " litros");
        System.out.println("A distância percorrida em 12 horas será de " + velocidade*12 + " km/h e gastará " + (velocidade*12)/consumo + " litros");

    }
}
