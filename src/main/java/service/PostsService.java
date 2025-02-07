package service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import model.Post;

public class PostsService {

  public List<Post> getPosts() throws IOException, URISyntaxException, InterruptedException {

    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
        .header("Content-Type", "application/json")
        .GET()
        .build();

    HttpResponse<String> response = HttpClient.newBuilder().build().send(request, BodyHandlers.ofString());
    if (response.statusCode() == 200) {

      ObjectMapper objectMapper = new ObjectMapper();
      return objectMapper.readValue(response.body(), new TypeReference<List<Post>>() {});
    }

    return new ArrayList<>();
  }

}
