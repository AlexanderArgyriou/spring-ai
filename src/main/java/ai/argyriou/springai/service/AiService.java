package ai.argyriou.springai.service;

import ai.argyriou.springai.model.ImageRequest;
import ai.argyriou.springai.service.client.ImageGeneratorClient;
import java.io.ByteArrayInputStream;
import java.net.URI;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.springframework.ai.client.AiClient;
import org.springframework.core.io.InputStreamResource;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public record AiService(AiClient aiClient, ImageGeneratorClient imageGeneratorClient,
                        WebClient webClient) {

  @SneakyThrows
  public InputStreamResource constructImg(@NotNull final ImageRequest imageRequest) {
    String imageUrl = imageGeneratorClient.generateImage(imageRequest).getData().getFirst().getUrl();

    return new InputStreamResource(
        new ByteArrayInputStream(webClient.get()
            .uri(new URI(imageUrl))
            .retrieve()
            .bodyToMono(byte[].class)
            .block()
        ));
  }
}