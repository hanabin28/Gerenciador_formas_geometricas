package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Circulo implements FormaGeometrica{
    Scanner scanner = new Scanner(System.in);
    double area, perimetro, raio;
    @Override
    public void calcularArea() {
        System.out.println("Insira o raio do círculo:");
        raio = scanner.nextDouble();
        scanner.nextLine();

        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Área do círculo: %.2f",area);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * Math.pow(raio, 2);
        System.out.printf("Perímetro do círculo: %.2f",perimetro);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
    }
}
