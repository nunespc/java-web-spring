package com.example.userdept.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userdept.UsuarioRepositorio;
import com.example.userdept.entidades.Usuario;

@RestController
@RequestMapping(value = "/usuarios" )
public class UsuarioControle {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	/*Endpoints para buscar todos os usuarios do 
	banco de dados.*/
	
	@GetMapping
	public List<Usuario> findAll(){
		List<Usuario> resultado = repositorio.findAll();
		return resultado;
	}	
	
	/*Endpoints para buscar o usuatrio do banco de dados 
	 	infomado pelo codigo(id).*/
	
	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id){
		Usuario resultado = repositorio.findById(id).get();
		return resultado;
	}
	
	/*Endpoints para inserio o usuario do banco de dados 
	 	atraves do postman .*/
	
	@PostMapping
	public Usuario insert(@RequestBody Usuario usuario){
		Usuario resultado = repositorio.save(usuario);
		return resultado;
	}	

}
