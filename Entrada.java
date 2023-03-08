import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

    int idade;
    String nome;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua idade ");
    idade=entrada.nextInt();
    System.out.println("Sua idade é: "+idade+ " Anos");
    
    System.out.println("Digite seu nome");
    nome=entrada.next();
    nome=entrada.nextLine();
    nome=entrada.next();
    System.out.println("Seu nome é: "+nome+ ".");
    
    entrada.close();
    
    }
}