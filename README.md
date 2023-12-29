# Spring AI Image Fun Project 🌟

Welcome to this whimsical journey exploring Spring AI! This is all about having a blast with Records as Beans and Feign Clients.

### Requirements 🛠️
- Java 21

### Let's Dive In! 🚀

1. **Get Your API Key**: Grab an API key and swap out the placeholder in `application.properties`. The one in the code is a dud – won't work, sorry! 😄
2. Run the app: Fire up the engine with `./mvnw spring-boot:run` in your terminal.

The app's set to cruise on port `9090`.

### Image Quest 🖼️

Ready to summon an image genie with SpringAI and OpenAI? Here's the spell:

Example CURL incantation:
```bash
curl --location --request GET 'http://localhost:9090/api/v1/image' \
--header 'Content-Type: application/json' \
--data-raw '{
  "prompt": "create an image including Arnold Schwarzenegger wishing happy new year"
}'
```

Result 😝 :

![anie.png](images%2Fanie.png)
