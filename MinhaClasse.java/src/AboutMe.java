import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

      public static void main(String[] args) {
           try{
            // criando o objeto scanner

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu primeiro nome ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade ");
            int idade = scanner.nextInt();

            System.out.println("Digite sus Altura ");
            double altura = scanner.nextDouble();

          System.out.println("Olá, me chamo " + nome + " " + sobrenome);  
          System.out.println("Tenho " + idade + " anos ");  
          System.out.println("Minha altura é " + altura + "cm");  
           }
           catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser númericos e conforme padrão americano");
           }
           
      }
}