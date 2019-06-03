package com.challenge.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.challenge.algorithm.Cifrado;
import com.challenge.services.exceptions.IncorrectFormatException;
import com.challenge.services.exceptions.ResourceNotFoundException;
import com.challenge.services.model.Mensaje;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class ApiRest {


	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})

	@ApiOperation(value = "Get a String of decrypted message")
	@GetMapping(path="/messages/{id}",produces = "application/json") 
	public ResponseEntity<Mensaje> getMsgById(  @ApiParam(value = "encrypted message will be received in hexadecimal format. Example: 6f9c15fa-ef51-4415-afab-36218d76c2df ", required = true) @PathVariable(value = "id") String id)
			throws ResourceNotFoundException {
		/*Mensaje employee = msgRepository.findById(employeeId)*/

		try{
			Mensaje msg2=new Mensaje(id);//.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + ));
			return ResponseEntity.ok().body(msg2);
		}
		catch(Exception e) {throw new ResourceNotFoundException(e.getMessage());}

	}

	//consumes = "application/json",
	/*@PostMapping(path="/messages" ,consumes = "application/json", produces = "application/json")
	//@ApiOperation(value = "create a decrypted message")
	public ResponseEntity<Mensaje> createMensaje( @Valid @RequestBody Mensaje msg) throws ResourceNotFoundException {
		try{
			Mensaje msg2=new Mensaje(cifrado);//.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
			//return messageRepository.save(msg2);
			return ResponseEntity.ok().body(msg);
		}
		catch(Exception e) {throw new ResourceNotFoundException(e.getMessage());}

	}*/

}