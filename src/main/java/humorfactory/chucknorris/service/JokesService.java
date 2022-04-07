package humorfactory.chucknorris.service;

import humorfactory.chucknorris.model.JokeDTO;
import humorfactory.chucknorris.webclient.ChuckNorrisAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JokesService {
    private final ChuckNorrisAPIClient chuckNorrisAPIClient = new ChuckNorrisAPIClient();

    public JokeDTO getRandomJoke() {
        return chuckNorrisAPIClient.getRandomJoke();
    }
}
