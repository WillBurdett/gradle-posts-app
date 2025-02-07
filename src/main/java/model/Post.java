package model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import deserializer.BodyDeserializer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
  public int id;
  public int userId;
  public String title;

  @JsonDeserialize(using = BodyDeserializer.class)  // Apply custom deserialization
  public String body;

  @Override
  public String toString() {
    return "Post{" +
        "id=" + id +
        ", userId=" + userId +
        ", title='" + title + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
