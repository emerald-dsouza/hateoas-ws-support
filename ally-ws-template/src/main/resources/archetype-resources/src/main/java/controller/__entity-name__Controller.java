package ${groupId}.${artifactId}.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ${groupId}.${artifactId}.assembler.ComponentResourceAssembler;
import ${groupId}.${artifactId}.service.ComponentService;

@RestController
@RequestMapping("${entity-name}")
public class ${entity-name}Controller {
	
	private final ${entity-name}Service service;
	private final ${entity-name}ResourceAssembler assembler;
	
	@Autowired
	public ${entity-name}Controller(${entity-name}Service service, ${entity-name}ResourceAssembler assembler){
		this.service = service;
		this.assembler = assembler;
	}
	
}