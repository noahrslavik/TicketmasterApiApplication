package co.grandcirucs.TicketmasterApiApp.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import co.grandcirucs.TicketmasterApiApp.Entities.BList;

@RestController
public class TicketMasterRestController {

	@Autowired
	private TicketMasterDao repository;

	// Aggregate root

	@GetMapping("")
	List<BList> all(@RequestParam(value = "name", required = false) String name) {

		if (name == null || name.isEmpty()) {
			return repository.findByOrderByName();
		} else {
			return repository.findByNameContainingIgnoreCaseOrderByName(name);
		}
	}

	@PostMapping("/")
	BList newBList(@RequestBody BList bList) {

		return repository.save(bList);
	}

	// Single item

//	@GetMapping("/}")
//	Blist one(@PathVariable Long id) {
//		return repository.findByField("");
//				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No such Product."));
//	}

//	@DeleteMapping("/")
//	void deleteBList(@PathVariable Long "") {
//		repository.deleteBy("");
//	}


	
	
	
	
	
	
}
