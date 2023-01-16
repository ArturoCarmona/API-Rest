package com.example.apirest.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apirest.Models.UsuarioModel;
import com.example.apirest.Repositories.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsers(){
        //Casteo para regresarlo como JSON
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel saveUsers(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> getById(Long id){
        return usuarioRepository.findById(id);
    }
    
    public boolean deleteUser(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public ArrayList<UsuarioModel> findAllByAge(Integer age) throws Exception {
        ArrayList<UsuarioModel> usuario = findAllByAge(age);
        return usuario;
    }
}
