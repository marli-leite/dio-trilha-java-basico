

public class MinhaClasse {
      
      public static void main (String[] args){

            String nome = args [0];
            String sobrenome = args [11];
            String agencia = args [2];
            int numero = Integer.valueOf(args [3]);
            double saldo = Double.valueOf(args [4]);
    
            System.out.println("Olá, " + nome + " " + sobrenome);
            System.out.println("Obrigada por criar uma conta em nosso banco, sua agencia é: " + agencia + "Conta" + numero);
            System.out.println("E seu saldo já está disponivel para saque: Saldo" + saldo);
           
        }
    }

