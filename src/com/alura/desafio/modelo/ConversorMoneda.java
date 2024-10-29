package com.alura.desafio.modelo;

import com.alura.desafio.servicio.ServicioAPI;

public class ConversorMoneda {
    private final ServicioAPI servicioAPI;

    public ConversorMoneda() {
        this.servicioAPI = new ServicioAPI();
    }

    public void convertir(String monedaOrigen, String monedaDestino) {
        double tasaCambio = servicioAPI.obtenerTasaDeCambio(monedaOrigen, monedaDestino);
        if (tasaCambio != 0) {
            System.out.println("1 " + monedaOrigen + " equivale a " + tasaCambio + " " + monedaDestino);
        } else {
            System.out.println("No se pudo obtener la tasa de cambio.");
        }
    }
}
