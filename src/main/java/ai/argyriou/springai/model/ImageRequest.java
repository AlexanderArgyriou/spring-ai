package ai.argyriou.springai.model;

import lombok.Data;

@Data
public class ImageRequest {
  private String prompt;
  private String size = "256x256";
}
