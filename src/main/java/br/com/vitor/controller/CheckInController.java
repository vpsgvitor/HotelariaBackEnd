package br.com.vitor.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.vitor.model.CheckIn;
import br.com.vitor.repository.CheckInRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CheckInController {

	@Autowired
	CheckInRepository checkInRepository;
	
	@GetMapping("/CheckIn")
	public List<CheckIn> listar() {
		return checkInRepository.findAll();
	}
	
	@PostMapping("/CheckIn")
	void addPessoa(@RequestBody CheckIn checkIn) {
		checkInRepository.save(checkIn);
	}
}