package co.grandcirucs.TicketmasterApiApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcirucs.TicketmasterApiApp.Entities.User;

public interface UserDao extends JpaRepository <User, Long> {
	
}
