package com.tradiZone.web.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tradiZone.web.app.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
