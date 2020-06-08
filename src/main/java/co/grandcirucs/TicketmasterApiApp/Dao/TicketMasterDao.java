package co.grandcirucs.TicketmasterApiApp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcirucs.TicketmasterApiApp.Entities.BList;

public interface TicketMasterDao extends JpaRepository<BList,Long> {
		
//		List<BList> findByNameContainingIgnoreCaseOrderByName(String name);
//		
		List<BList> findAll();
		

	}

