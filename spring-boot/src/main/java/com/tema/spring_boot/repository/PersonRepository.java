package com.tema.spring_boot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tema.spring_boot.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>
{

	
}
