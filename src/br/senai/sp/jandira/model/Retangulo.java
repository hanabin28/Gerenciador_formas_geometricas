package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Retangulo implements FormaGeometrica{
    Scanner scanner = new Scanner(System.in);
    double lado1, lado2, area, perimetro;
    @Override
    public void calcularArea() {
        System.out.println("Insira o comprimento do retângulo: ");
        lado1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira a altura do retângulo: ");
        lado2 = scanner.nextDouble();
        scanner.nextLine();

        area = lado1 * lado2;
        System.out.printf("Área do retângulo: %.2f",area);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
    }

    @Override
    public void calcularPerimetro() {
        perimetro = (lado1*2)+(lado2*2);
        System.out.printf("Perímetro do retângulo: %.2f",perimetro);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
    }
}
