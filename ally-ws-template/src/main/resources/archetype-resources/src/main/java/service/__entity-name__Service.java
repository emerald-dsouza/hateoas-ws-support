package ${groupId}.${artifactId}.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${groupId}.${artifactId}.entities.${entity-name}Entity;
import ${groupId}.${artifactId}.repositories.${entity-name}Repository;

@Service
public class ${entity-name}Service {
	
	private final ${entity-name}Repository repository;
	
	@Autowired
	public ${entity-name}Service(${entity-name}Repository repository) {
		this.repository = repository;
	}
	
	//TODO: Define addtional services here

}
