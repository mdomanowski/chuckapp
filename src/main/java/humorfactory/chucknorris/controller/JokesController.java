package humorfactory.chucknorris.controller;

import humorfactory.chucknorris.model.JokeDTO;
import humorfactory.chucknorris.service.JokesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JokesController {
    private final JokesService jokesService = new JokesService();
    @CrossOrigin(origins = {"http://localhost:4200/", "https://templeofchuck.surge.sh/", "http://templeofchuck.surge.sh/"})
    @GetMapping("/joke")
    public ResponseEntity<JokeDTO> getJoke() {
        return ResponseEntity.ok(jokesService.getRandomJoke());
    }
}
