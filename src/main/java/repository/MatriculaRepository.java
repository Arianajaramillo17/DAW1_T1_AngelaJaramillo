package repository;

import entity.Matricula;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import entity.Curso;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    @Query("SELECT m FROM Matricula m WHERE m.alumno.email = :email")
    List<Matricula> buscarPorEmailAlumno(@Param("email") String email);
}
