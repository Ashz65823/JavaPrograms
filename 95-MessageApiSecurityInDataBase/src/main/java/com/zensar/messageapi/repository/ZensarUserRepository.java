package com.zensar.messageapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.messageapi.enity.ZensarUser;

@Repository
public interface ZensarUserRepository extends JpaRepository<ZensarUser, Integer> {

	ZensarUser findByUsername(String username);// no implementation is need only if we follow naming convention -->in
												// getter our variable by default change to camel case we have to follow
												// the same in findBy(variable name)findByUsername

}
