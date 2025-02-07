import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import model.Post;
import service.PostsService;
import utils.PrintUtils;

public class PostsApplication {
  public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

    PostsService postsService = new PostsService();

    List<Post> posts = postsService.getPosts();

    PrintUtils.printObjectList(posts);

  }
}
