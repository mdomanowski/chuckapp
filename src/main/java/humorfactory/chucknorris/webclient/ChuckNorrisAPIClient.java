package humorfactory.chucknorris.webclient;


import humorfactory.chucknorris.model.Joke;
import humorfactory.chucknorris.model.JokeDTO;
import org.springframework.web.client.RestTemplate;

/**
 *     private String createdAt;
 *     private String iconUrl;
 *     private String id;
 *     private String updatedAt;
 *     private String url;
 *     private String value;
 */
public class ChuckNorrisAPIClient {
    private RestTemplate restTemplate = new RestTemplate();
    public static final String JOKE_URL = "https://api.chucknorris.io/jokes/";

    public JokeDTO getRandomJoke() {
        Joke joke = restTemplate.getForObject(JOKE_URL + "random", Joke.class);
        assert joke != null;
        return JokeDTO.builder()
                .value(joke.getValue())
                .build();
    }

}
