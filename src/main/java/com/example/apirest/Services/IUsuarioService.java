package com.example.apirest.Services;

import java.util.ArrayList;
import com.example.apirest.Models.UsuarioModel;

public interface IUsuarioService {
    public ArrayList<UsuarioModel> findAllByAge(Integer age) throws Exception;
}
