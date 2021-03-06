/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import excepcion.MiExcepcion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Fabricante;

/**
 *
 * @author Gonza Cozzo
 */
public class FabricanteDAO extends DAO{
    
     //GUARDAR
    public void guardarFabricante(Fabricante f) throws MiExcepcion {
        try
        {
            if (f == null)
            {
                throw new MiExcepcion("FABRICANTE INVÁLIDO");
            }
            // SENTENCIA SQL DE INSERCIÓN -- INSERT INTO `tienda`.`fabricante` (`codigo`, `nombre`) VALUES ('10', 'pHILLIPS');
            String sql = "INSERT INTO fabricante (codigo, nombre) "
                    + "VALUES('" + f.getCodigo()
                    + "', '" + f.getNombre() + "');";
            insertarModificarEliminar(sql);

        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR USUARIO");
        }

    }

    //BUSCAR
    public Fabricante buscarFabricantePorCodigo(int cod) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM fabricante WHERE codigo = '" + cod + "';";
            consultarBase(sql);
            Fabricante f = null;

            while (resultado.next())
            {
                f = new Fabricante();

                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
            }
            return f;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER FABRICANTE");
        } finally
        {
            desconectarBase();
        }

    }

    //MODIFICAR
    public void modificarFabricante(Fabricante f) throws MiExcepcion {

        try
        {
            if (f == null)
            {
                throw new MiExcepcion("FABRICANTE INVÁLIDO");
            }
            // SENTENCIA SQL DE MODIFICACIÓN
            String sql = "UPDATE fabricante SET nombre = '" + f.getNombre() + "' "
                    + "WHERE codigo = '" + f.getCodigo() + "';";
            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR FABRICANTE");
        }

    }

    //ELIMINAR
    public void eliminarFabricante(Integer cod) throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM fabricante WHERE codigo = '" + cod + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR FABRICANTE");
        }

    }

    //OBTENER
    public List<Fabricante> obtenerFabricante() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);

            List<Fabricante> fabricantes = new ArrayList<>();
            Fabricante aux = null;

            while (resultado.next())
            {
                aux = new Fabricante();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));

                fabricantes.add(aux);
            }

            return fabricantes;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER FABRICANTES");
        } finally
        {
            desconectarBase();
        }
    }
    
}
