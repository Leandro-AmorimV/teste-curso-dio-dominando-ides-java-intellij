package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor : ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor : ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int mutiplicar = mutiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subtra: " + subtrair);
        System.out.println("mutiplica: " + mutiplicar);
        System.out.println("divisa: " + dividir);

    }
    public static  int somar(int a, int b) {
        return a + b;
    }
    public static  int subtrair(int a, int b) {
        return a - b;
    }
    public static  int mutiplicar(int a, int b) {
        return a * b;
    }
    public static  int dividir(int a, int b) {
        return a / b;
    }
}
