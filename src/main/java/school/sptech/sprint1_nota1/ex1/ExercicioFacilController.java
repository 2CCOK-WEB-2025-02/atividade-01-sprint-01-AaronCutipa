package school.sptech.sprint1_nota1.ex1;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil( @PathVariable String palavra) {

        String palavraLower = palavra.toLowerCase();
        int tamanho = palavra.length();

        for(int i = 0; i < tamanho / 2; i++) {

            if (palavraLower.charAt(i) != palavraLower.charAt(tamanho - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
