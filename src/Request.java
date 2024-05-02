import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Request {
    public static void api(String de, String a, float monto) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7248e9542ef0692a626d629b/pair/"+de+"/"+a+""))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();


        JsonParser parser = new JsonParser();

        JsonObject jsonObject = parser.parse(json).getAsJsonObject();
        float valor = jsonObject.get("conversion_rate").getAsFloat();

        float convercion = monto * valor;
        System.out.println("La convercion de "+monto+" "+de+" a "+a+" es de: "+convercion);

    }
}
