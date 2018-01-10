package com.algar.demo.service;

import java.util.List;

import com.algar.demo.model.User;

public interface UserService {

	/**
	 * Guardar usuario
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

	/**
	 * Recupera la lisa de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();

	/**
	 * Elimina el usuario por id
	 * @param id
	 */
	void delete(Long id);

}
