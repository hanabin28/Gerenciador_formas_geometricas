package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Circulo;
import br.senai.sp.jandira.model.Retangulo;

import java.util.Scanner;

public class GerenciadorFormas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean executar = true;
        do{
            System.out.println("O que deseja fazer? \n[1 - Criar círculo] \n[2 - Criar retângulo] \n[3 - Sair]");
            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser){
                case 1:
                    Circulo circulo = new Circulo();
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    break;

                case 2:
                    Retangulo retangulo = new Retangulo();
                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();
                    break;

                case 3:
                    executar = false;
                    break;
            }

        }while (executar);
    }
}
