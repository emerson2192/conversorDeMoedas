import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    private static final String API_KEY = "f97f7b97ba367f210bebbfe2";

    public Dadosmoedas buscarCotacao(String base) {

        try {
            String url = "https://v6.exchangerate-api.com/v6/"
                    + API_KEY + "/latest/" + base;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status HTTP: " + response.statusCode());


            Gson gson = new Gson();
            return gson.fromJson(response.body(), Dadosmoedas.class);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
