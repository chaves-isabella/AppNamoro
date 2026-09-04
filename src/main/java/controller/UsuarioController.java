package controller;

import appnamoro.appnamoro.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

//atributo da array list que irá guardar os usuarios
    private List<Usuario> listaUsuario = new ArrayList<>();

//metodos para salvar usuarios na array list
    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario novoUsuario){
        listaUsuario.add(novoUsuario);
        return novoUsuario;
    }

    @GetMapping
    public List<Usuario> mostrarUsuario(){
    return listaUsuario;
    }

    @GetMapping("/{id}")
    public Usuario buscaPorId(@PathVariable Long id){
        for (Usuario pessoa : listaUsuario){
            if (pessoa.getIdUsuario().equals(id)){
                return pessoa;
            }
        }
        return null;
    }
}
