package PrjControleAlunos.example.PrjControleAlunos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PrjControleAlunos.example.PrjControleAlunos.entities.AlunoEntities;
import PrjControleAlunos.example.PrjControleAlunos.repositories.AlunoRepositories;


@Service
public class AlunoService {
	private final AlunoRepositories alunoRepository;
	
	@Autowired
	public AlunoService(AlunoRepositories alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	public AlunoEntities saveAluno(AlunoEntities alunoEntitites) {
		return alunoRepository.save(alunoEntitites);
	}
	
	public AlunoEntities getAlunoEntitiesById(Long id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public List<AlunoEntities> getAllAlunos(){
		return alunoRepository.findAll();
	}
	
	public void deleteAlunoEntities(Long id) {
		alunoRepository.deleteById(id);
	}

}