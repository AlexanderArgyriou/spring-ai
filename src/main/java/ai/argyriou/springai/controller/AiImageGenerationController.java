package ai.argyriou.springai.controller;

import ai.argyriou.springai.model.ImageRequest;
import ai.argyriou.springai.service.AiService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public record AiImageGenerationController(AiService aiService) {

  @GetMapping(value = "/image", produces = "image/jpeg")
  public ResponseEntity<InputStreamResource> getImage(@RequestBody ImageRequest imageRequest) {
    return ResponseEntity.ok().body(aiService.constructImg(imageRequest));
  }
}
