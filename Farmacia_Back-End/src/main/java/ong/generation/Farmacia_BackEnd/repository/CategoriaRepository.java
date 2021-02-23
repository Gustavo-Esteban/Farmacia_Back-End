package ong.generation.Farmacia_BackEnd.repository;

import java.util.List;

import ong.generation.Farmacia_BackEnd.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByNomeContainingIgnoreCase( String nome);
}
