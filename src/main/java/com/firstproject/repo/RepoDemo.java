/**
 * 
 */
package com.firstproject.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.firstproject.pojo.Alien;

/**
 * @author USER
 *
 */
@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface RepoDemo extends CrudRepository<Alien, Integer> {

}
