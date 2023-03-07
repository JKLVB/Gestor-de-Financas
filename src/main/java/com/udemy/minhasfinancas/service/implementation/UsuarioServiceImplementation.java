package com.udemy.minhasfinancas.service.implementation;

import org.springframework.stereotype.Service;

import com.udemy.minhasfinancas.exception.RegraNegocioException;
import com.udemy.minhasfinancas.model.entity.Usuario;
import com.udemy.minhasfinancas.model.repository.UsuarioRepository;
import com.udemy.minhasfinancas.service.UsuarioService;

@Service
public class UsuarioServiceImplementation implements UsuarioService {
	
	private UsuarioRepository repository;

	public UsuarioServiceImplementation(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean validation = repository.existsByEmail(email);
		if(validation) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com este email.");
		}
		
	}

}
