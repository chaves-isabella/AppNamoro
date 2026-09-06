package appnamoro.appnamoro.controller;


import appnamoro.appnamoro.Interesse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/{interesse}")
public class InteresseController {

    //array list que guarda os interesses
    private List<Interesse> listaInteresse = new ArrayList<>();

    private Long proximoId = 1L;

    //salvar interesse
    @PostMapping
    public Interesse salvarInterrese (@RequestBody Interesse novoInteresse){
        novoInteresse.setIdUsuario(proximoId++);
        listaInteresse.add(novoInteresse);
        return novoInteresse;
    }

    //mostrar interesse
    @GetMapping
    public List<Interesse> mostrarInteresse (){
        return listaInteresse;
    }

    @GetMapping("/{id}")
    public Interesse buscarPorId (@PathVariable Long id) {
        for (Interesse pessoa : listaInteresse) {
            if (pessoa.getIdUsuario().equals(id)) {
                return pessoa;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String removerInteresse (@PathVariable Long id){
        boolean removido = listaInteresse.removeIf(pessoa -> pessoa.getIdUsuario().equals(id));

        if (removido) {
            IO.println("Usuário removido com sucesso");
        }
        return "Usuário não encontrado";
    }


}
