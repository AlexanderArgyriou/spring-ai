package ai.argyriou.springai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.ai.openai")
public record AiConfigProps(String apiKey, String imageUrl) {
}
