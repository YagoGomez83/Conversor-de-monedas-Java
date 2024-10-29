package com.alura.desafio.servicio;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ServicioAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/09eedad128c6a8ec2e75de1b/latest/";

    public double obtenerTasaDeCambio(String monedaOrigen, String monedaDestino) {
        try {
            URL url = new URL(API_URL + monedaOrigen);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(conn.getInputStream());
            JsonObject jsonResponse = JsonParser.parseReader(reader).getAsJsonObject();
            reader.close();

            return jsonResponse
                    .get("conversion_rates")
                    .getAsJsonObject()
                    .get(monedaDestino)
                    .getAsDouble();

        } catch (IOException e) {
            System.err.println("Error al conectar con la API: " + e.getMessage());
        }
        return 0;
    }
}
