# Spring AI Image Generation

This project is a fun exploration of Spring AI capabilities, leveraging Records as Beans and Feign Clients.

### Requirements
- Java 21

### Usage

1. **Get an API Key**: Obtain an Open AI API key [openai](https://openai.com/blog/openai-api) and replace the invalid one in the `application.properties` file. The provided key in the code is invalid and won't work.
2. Run the application: Execute `./mvnw spring-boot:run` in your terminal.

The application will run on port `9090`.

### Generating Images

To create an image using a publicly available API that utilizes SpringAI and OpenAI:

Example CURL request:
```bash
curl --location --request GET 'http://localhost:9090/api/v1/image' \
--header 'Content-Type: application/json' \
--data-raw '{
  "prompt": "create an image including Arnold Schwarzenegger wishing happy new year"
}'
```

Result 😝 :

![anie.png](images%2Fanie.png)
