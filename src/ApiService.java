import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    private static final String API_KEY = "f97f7b97ba367f210bebbfe2";

    public Dadosmoedas buscarCotacao(String base, String target) {

        try {

            String url = "https://v6.exchangerate-api.com/v6/"
                    + API_KEY + "/pair/" + base + "/" + target;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            return gson.fromJson(response.body(), Dadosmoedas.class);

        } catch (Exception e) {
            System.out.println("Erro ao buscar cotação: " + e.getMessage());
            return null;
        }
    }
}