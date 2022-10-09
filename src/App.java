import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Requisito 1: Peça o raio de um circulo
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o raio do circulo: ");
        double raio = sc.nextDouble();
        sc.close();
        //Requisito 2: Calcular a área do circulo
        //PI() * POTÊNCIA(C3;2)
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do circulo de raio " + raio + " é igual a " + area);
    }
}
