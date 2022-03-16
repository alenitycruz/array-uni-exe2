package revisao.arrays.segundo;

/*
Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];
        int count = 0;
        System.out.println("Escolha 10 números ");
        while (vetor.length>count){
            int numero = scan.nextInt();
            count=count+1;
        }

        System.out.print("Vetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }


    }
}
