import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       boolean igual = false;
       boolean naoigual = false;
       boolean maior = false;
       boolean menor = false;
       boolean maiorouigual = false;
       boolean menorouigual = false;
       Scanner valordigitado = new Scanner(System.in);
       System.out.println(" Digite o primeiro número inteiro ");
       int primeironumero = valordigitado.nextInt();
       System.out.println(" Digite o segundo número inteiro ");
       int segundonumero = valordigitado.nextInt();


       if (primeironumero == segundonumero)
           igual = true;
       if (primeironumero == segundonumero)
           naoigual = false;
       if (primeironumero == segundonumero)
           maior = false;
       if (primeironumero == segundonumero)
           menor = true;
       if (primeironumero == segundonumero)
           maiorouigual = true;
       if (primeironumero == segundonumero)
           menorouigual = false;


       System.out.println("Os numeros são iguais? " + igual);
       System.out.println("Os numeros não são iguais? " + naoigual);
       System.out.println("Os numeros não são iguais? " + maior);
       System.out.println("Os numeros são iguais? " + menor);
       System.out.println("Os numeros são iguais? " + maiorouigual);
       System.out.println("Os numeros não são iguais? " + menorouigual);
   }
}

