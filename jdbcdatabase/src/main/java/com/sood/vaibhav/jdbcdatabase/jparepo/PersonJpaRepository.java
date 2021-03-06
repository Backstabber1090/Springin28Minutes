package com.sood.vaibhav.jdbcdatabase.jparepo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.sood.vaibhav.jdbcdatabase.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id){
		return entityManager.find(Person.class, id);
				
	}
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	public void remove(int id) {
		 entityManager.remove(findById(id));
		
	}
	public List<Person> findAllPerson(){
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons",Person.class);
		return namedQuery.getResultList();
				
	}
	
}
