package com.intellect.serverstatuschecker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intellect.serverstatuschecker.domain.ServerDetails;

/**
 * Spring Data JPA repository for the Region entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ServerDetailsRepository extends JpaRepository<ServerDetails, Long> {

	List<ServerDetails> findByServerStatus(Boolean status);

	ServerDetails findByServerIpAddressAndServerPortAndServerStatus(String serverIpAddress, String serverPort, Boolean true1);
	
}
