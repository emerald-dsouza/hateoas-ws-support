package ${groupId}.${artifactId}.repositories;

import org.springframework.data.repository.CrudRepository;

import ${groupId}.${artifactId}.entities.${entity-name}Entity;

public interface ${entity-name}Repository extends CrudRepository<${entity-name}Entity, Long> {

}
