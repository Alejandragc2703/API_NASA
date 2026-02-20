import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        NasaService nasa = new NasaService();
        try {
            JSONObject res = nasa.getApodData();
            System.out.println("--- PRUEBA NASA OK ---");
            System.out.println("TÍTULO: " + res.getString("title"));
            System.out.println("URL: " + res.getString("url"));
            System.out.println("-----------------------");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}