package PrjControleAlunos.example.PrjControleAlunos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import PrjControleAlunos.example.PrjControleAlunos.entities.AlunoEntities;

public interface AlunoRepositories extends JpaRepository<AlunoEntities, Long>{
	
}
