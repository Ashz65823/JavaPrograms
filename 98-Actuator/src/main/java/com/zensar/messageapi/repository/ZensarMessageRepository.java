package com.zensar.messageapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.messageapi.dto.Message;
import com.zensar.messageapi.enity.ZensarMessages;

@Repository
public interface ZensarMessageRepository extends JpaRepository<ZensarMessages, Integer> {

	

}
