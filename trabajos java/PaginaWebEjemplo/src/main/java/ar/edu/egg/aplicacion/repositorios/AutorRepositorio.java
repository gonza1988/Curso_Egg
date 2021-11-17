package ar.edu.egg.aplicacion.repositorios;

import ar.edu.egg.aplicacion.entidades.Autor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository 
public interface AutorRepositorio extends JpaRepository<Autor,String> {

       @Query ("SELECT a FROM Autor a WHERE a.nombre LIKE %?1%")
    public List<Autor> buscarPorAutor(@Param("nombre") String nombre);
}
