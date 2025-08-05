package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import entity.Curso;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    @Query("SELECT c FROM Curso c WHERE c.nombre LIKE %:nombre%")
    List<Curso> buscarPorNombreParcial(@Param("nombre") String nombre);
    @Query("SELECT c FROM Curso c WHERE c.nombre LIKE %:nombre%")
    Page<Curso> buscarPorNombreParcialPaginado(@Param("nombre") String nombre, Pageable pageable);


}