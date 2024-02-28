package PrjControleAlunos.example.PrjControleAlunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PrjControleAlunos.example.PrjControleAlunos.entities.AlunoEntities;
import PrjControleAlunos.example.PrjControleAlunos.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	private final AlunoService alunoService;
	
	@Autowired
	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	@PostMapping
	public AlunoEntities createAluno(@RequestBody AlunoEntities alunoEntitites) {
		return alunoService.saveAluno(alunoEntitites);
	}
	
	@GetMapping("/{id}")
	public AlunoEntities getAlunoEntities(@PathVariable Long id) {
		return alunoService.getAlunoEntitiesById(id);
	}
	
	@GetMapping
	public List<AlunoEntities> getAllAlunos(){
		return alunoService.getAllAlunos();
	}
	
	public void deleteAluno(@PathVariable Long id) {
		alunoService.deleteAlunoEntities(id);
	}
	
}