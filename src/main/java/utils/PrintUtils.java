package utils;

import java.util.List;

public class PrintUtils {
  public static <T> void printObjectList(List<T> objects) {
    for (T obj : objects) {
      System.out.println(obj.toString());
    }
  }
}
