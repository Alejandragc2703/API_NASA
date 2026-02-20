import org.json.JSONObject;
import org.json.JSONException;
import java.io.*;
import java.net.*;

public class NasaService {
    private static final String NASA_URL = "https://api.nasa.gov/planetary/apod";
    private static final String API_KEY = "DEMO_KEY"; 

    public JSONObject getApodData() throws IOException, JSONException {
        String randomDate = getRandomDate();
        // RA1.g: Modificación de la URL
        String urlWithParams = NASA_URL + "?api_key=" + API_KEY + "&date=" + randomDate;

        URL url = new URL(urlWithParams);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new IOException("Error en la solicitud: " + responseCode);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Convertimos la respuesta a JSON
        return new JSONObject(response.toString());
    }

    private String getRandomDate() {
        // Generamos fecha aleatoria entre 2015 y 2024
        int anio = (int)(Math.random() * (2024 - 2015 + 1)) + 2015;
        int mes = (int)(Math.random() * 12) + 1;
        int dia = (int)(Math.random() * 28) + 1;
        return String.format("%04d-%02d-%02d", anio, mes, dia);
    }
}