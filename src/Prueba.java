import org.json.JSONObject;
public class Prueba {
    public static void main(String[] args) {
        JSONObject test = new JSONObject("{\"hola\":\"mundo\"}");
        System.out.println(test.toString());
    }
}