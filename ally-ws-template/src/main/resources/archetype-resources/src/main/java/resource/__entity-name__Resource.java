package ${groupId}.${artifactId}.resource;

import org.springframework.hateoas.ResourceSupport;

import ${groupId}.${artifactId}.entities.${entity-name}Entity;

public class ${entity-name}Resource extends ResourceSupport{
	
	${entity-name}Entity entity;
	
	public ${entity-name}Resource(${entity-name}Entity entity) {
		this.entity = entity;
	}

	public ${entity-name}Entity getEntity() {
		return entity;
	}



		

}
