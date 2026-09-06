package appnamoro.appnamoro.controller;

import appnamoro.appnamoro.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

//atributo da array list que irá guardar os usuarios
    private List<Usuario> listaUsuario = new ArrayList<>();

    private Long proximoId = 1L;

//metodos para salvar usuarios na array list
    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario novoUsuario){
        novoUsuario.setIdUsuario(proximoId++);
        listaUsuario.add(novoUsuario);
        return novoUsuario;
    }

    @GetMapping
    public List<Usuario> mostrarUsuario(){
        return listaUsuario;
    }

//metodo para buscar usuario por id
    @GetMapping("/{id}")
    public Usuario buscaPorId(@PathVariable Long id){
        for (Usuario pessoa : listaUsuario){
            if (pessoa.getIdUsuario().equals(id)){
                return pessoa;
            }
        }
        return null;
    }

//deletar usuario
    @DeleteMapping("/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        boolean removido = listaUsuario.removeIf(pessoa -> pessoa.getIdUsuario().equals(id));

        if (removido) {
            IO.println("Usuário removido com sucesso!");
        }
        return "Usuário não encontrado";
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario (@PathVariable Long id, @RequestBody Usuario dadosNovos){
        for (Usuario pessoa : listaUsuario){
            if (pessoa.getIdUsuario().equals(id)){
                pessoa.setNomeCompleto(dadosNovos.getNomeCompleto());
                pessoa.setDtNascimento(dadosNovos.getDtNascimento());
                pessoa.setEmail(dadosNovos.getEmail());
                pessoa.setBiografia(dadosNovos.getBiografia());
            }
            return pessoa;
        }
        return null;
    }

}
