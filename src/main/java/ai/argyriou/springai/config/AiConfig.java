package ai.argyriou.springai.config;

import feign.RequestInterceptor;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@AllArgsConstructor
public class AiConfig {
  private final AiConfigProps aiConfigProps;

  @Bean
  public RequestInterceptor apiKeyInterceptor() {
    return template ->
        template.header("Authorization", String.format("Bearer %s", aiConfigProps.apiKey()));
  }

  @Bean
  public WebClient webClient() {
    return WebClient.builder().build();
  }
}
