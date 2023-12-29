package ai.argyriou.springai.model;

import java.util.List;
import lombok.Data;

@Data
public class ImageResponse {
  private long created;
  private List<Data> data;

  @lombok.Data
  public static class Data {
    private String url;
  }
}
