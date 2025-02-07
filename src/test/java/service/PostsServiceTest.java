package service;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import model.Post;
import org.junit.jupiter.api.Test;

class PostsServiceTest {

  private final PostsService undertest = new PostsService();

  @Test
  void getPosts_returns100Posts() throws IOException, URISyntaxException, InterruptedException {
    // when
    int actual = undertest.getPosts().size();

    // then
   int expected = 100;
   assertEquals(expected, actual);
  }
}