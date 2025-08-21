package school.sptech.sprint1_nota1.ex;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioAquecimentoController {

    @GetMapping("/ex-00/{numero}")
    public Boolean exercicioAquecimento(@PathVariable int numero) {

        boolean resposta = false;

        if(numero % 2 == 0){
            resposta = true;
        }

        return resposta;
    }
}
