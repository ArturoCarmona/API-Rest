package com.example.apirest.Repositories;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.apirest.Models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    
    public abstract ArrayList<UsuarioModel> findByStatus(Integer status);
    public UsuarioModel findByFirstName(String firstName);


}
