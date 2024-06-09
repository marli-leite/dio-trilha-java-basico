//import java.util.concurrent.ThreadLocalRandom;

import java.util.Random;

public class ProcessoSeletivo {
      public static void main(String[] args) {
            
              // Case 4
              
              String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
              for (String candidato : candidatos) {
              entrandoEmContato(candidato);
              }
              }
              
              static void entrandoEmContato(String candidato) {
              int tentativasRealizadas = 1;
              boolean continuarTentando = true;
              boolean atendeu = false;
              do { // essas variaveis cotinuarTentando e tentativasRealizadas
              // em algum momento da aplicação elas precisarão sofrer alterações
              // se não entraremos em um loop infinito e aplicação gerara erro
              atendeu = atender();
              continuarTentando = !atendeu;
              if(continuarTentando){
              tentativasRealizadas++;
              } else
              System.out.println(" Contato realizado com sucesso ");
              
              } while (continuarTentando && tentativasRealizadas < 3);
              if(atendeu)
              System.out.println(" Conseguimos contato com " + candidato + " na " +
              tentativasRealizadas + " TENTATIVA(S) ");
              else
              System.out.println(" Não conseguimos contato com " + candidato +
              ", numero máximo de tentativas " + tentativasRealizadas + " REALIZADA(S)" );
              }
              
              // método auxiliar
              static boolean atender(){
              return (new Random().nextInt(3)==1);
              }
             

            // Case 3

            //imprimirSelecionados();}
      

      static void imprimirSelecionados() {
            String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
            System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
            for (int indice = 0; indice < candidatos.length; indice++) {
                  System.out.println(" O candidato de nº" + (indice + 1) + " é " + candidatos[indice]);
            }
            System.out.println("Forma abreviada de intereção for each ");

            for (String candidato : candidatos) {
                  System.out.println("O candidato selecionado foi " + candidato);
            }
      }
}

      // Case 2
      // selecaoCandidatos();}

//       static void selecaoCandidatos() {
//             String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
//                         "Daniela", "Jorge" };

//             int candidatosSelecionados = 0;
//             int candidatosAtual = 0;
//             double salarioBase = 2000.0;
//             while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
//                   // O while precisa estar constantemente associado a uma regra de interrupção -
//                   // && candidatosAtual < candidatos.length.
//                   String candidato = candidatos[candidatosAtual];
//                   double salarioPretendido = valorPretendido();

//                   System.out.println(
//                               " O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

//                   if (salarioBase >= salarioPretendido) {
//                         System.out.println(" O candidato " + candidato +
//                                     " foi selecionado para a vaga ");
//                         candidatosSelecionados++;
//                   }
//                   candidatosAtual++;
//             }

//       }

//       static double valorPretendido() {
//             return (ThreadLocalRandom.current().nextDouble(1800, 2200));
//       }
// }

// Case 1

/*
 * analisarCandidato(1900.0);
 * analisarCandidato(2200.0);
 * analisarCandidato(2000.0);}
 * 
 * 
 * static void analisarCandidato(double salarioPretendido) {
 * double salarioBase = 2000.0;
 * if (salarioBase > salarioPretendido) {
 * System.out.println("Ligar para o candidato");
 * 
 * } else if (salarioBase == salarioPretendido)
 * System.out.println("Ligar para candidato com contra proposta");
 * else {
 * System.out.println("Aguardando resultado dos demais candidatos");
 * }
 * 
 * }
 * 
 * }
 */
