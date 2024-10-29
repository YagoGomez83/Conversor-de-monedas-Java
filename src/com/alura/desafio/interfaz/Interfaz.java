package com.alura.desafio.interfaz;

import com.alura.desafio.modelo.ConversorMoneda;
import java.util.Scanner;

public class Interfaz {
    private final ConversorMoneda conversor;

    public Interfaz() {
        this.conversor = new ConversorMoneda();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("***********************");
            System.out.println("""
                    1) Dólar => Peso Argentino
                    2) Peso Argentino => Dólar
                    3) Dólar => Real Brasileño
                    4) Real Brasileño => Dólar
                    5) Dólar => Peso Colombiano
                    6) Peso Colombiano => Dólar
                    7) Salir
                    """);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> conversor.convertir("USD", "ARS");
                case 2 -> conversor.convertir("ARS", "USD");
                case 3 -> conversor.convertir("USD", "BRL");
                case 4 -> conversor.convertir("BRL", "USD");
                case 5 -> conversor.convertir("USD", "COP");
                case 6 -> conversor.convertir("COP", "USD");
                case 7 -> salir = true;
                default -> System.out.println("Opción inválida, intente de nuevo.");
            }
        }
        scanner.close();
    }
}
