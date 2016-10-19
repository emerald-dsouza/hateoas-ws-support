package ${groupId}.${artifactId}.assembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import ${groupId}.${artifactId}.controller.${entity-name}Controller;
import ${groupId}.${artifactId}.entities.${entity-name}Entity;
import ${groupId}.${artifactId}.resource.${entity-name}Resource;

@Component
public class ${entity-name}ResourceAssembler implements ResourceAssembler<${entity-name}Entity, ${entity-name}Resource> {

	@Override
	public ${entity-name}Resource toResource(${entity-name}Entity e) {
		${entity-name}Resource rs = new ${entity-name}Resource(e);
		//TODO: add operational links here
		//rs.add(linkTo(${entity-name}Controller.class).slash(e).withRel("${entity-name}"));
		//rs.add(linkTo(methodOn(${entity-name}Controller.class).logout(e.getId())).withRel("logout"));
		return rs;
	}

}
