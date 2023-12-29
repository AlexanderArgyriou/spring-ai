package ai.argyriou.springai.service.client;

import ai.argyriou.springai.config.AiConfig;
import ai.argyriou.springai.model.ImageRequest;
import ai.argyriou.springai.model.ImageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "imageGenerator",
    url = "${spring.ai.openai.image-url}",
    configuration = AiConfig.class)
public interface ImageGeneratorClient {

  @PostMapping(value = "/v1/images/generations")
  ImageResponse generateImage(@RequestBody final ImageRequest request);

}
