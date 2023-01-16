package com.example.apirest.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirest.Models.UsuarioModel;
import com.example.apirest.Services.UsuarioService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> getUsers(){
        return usuarioService.getUsers();
    }
    
    @PostMapping()
    public UsuarioModel saveUsers(@RequestBody UsuarioModel usuario){
        return this.usuarioService.saveUsers(usuario);
    }

    @GetMapping(path="/{id}")
    public Optional<UsuarioModel> getUserById(@PathVariable("id") Long id){
        return this.usuarioService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.deleteUser(id);
        if(ok){
            return "It has been deleted the ID "+id;
        } else{
            return "It couldn't be deleted the ID "+id;
        }
    }

    @GetMapping(path="/{age}")
    public ArrayList<UsuarioModel> getAllByAge(@PathVariable("age") Integer id) throws Exception{
        return this.usuarioService.findAllByAge(id);
    }
}
