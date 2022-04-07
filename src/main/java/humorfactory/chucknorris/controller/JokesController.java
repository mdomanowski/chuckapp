package humorfactory.chucknorris.controller;

import humorfactory.chucknorris.model.JokeDTO;
import humorfactory.chucknorris.service.JokesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JokesController {
    private final JokesService jokesService = new JokesService();

    @GetMapping("/joke")
    public ResponseEntity<JokeDTO> getJoke() {
        return ResponseEntity.ok(jokesService.getRandomJoke());
    }
}
