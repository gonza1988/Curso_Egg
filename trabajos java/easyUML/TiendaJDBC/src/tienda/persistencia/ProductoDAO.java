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
import tienda.entidades.Producto;

/**
 *
 * @author Gonza Cozzo
 */
public class ProductoDAO extends DAO {

    //GUARDAR
    public void guardarProducto(Producto p) throws MiExcepcion {
        try
        {
            if (p == null)
            {
                throw new MiExcepcion("PRODUCTO INVÁLIDO");
            }
            // SENTENCIA SQL DE INSERCIÓN -- INSERT INTO `tienda`.`fabricante` (`codigo`, `nombre`) VALUES ('10', 'pHILLIPS');
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES('" + p.getCodigo()
                    + "', '" + p.getNombre() + "', '" + p.getPrecio() + "', '" + p.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);

        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR PRODUCTO");
        }

    }

    //BUSCAR
    public Producto buscarProductoPorCodigo(int cod) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto WHERE codigo = '" + cod + "';";
            consultarBase(sql);
            Producto p = null;

            while (resultado.next())
            {
                p = new Producto();

                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
            }
            return p;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally
        {
            desconectarBase();
        }

    }
    
    public boolean buscarProductoPorFab(int cod_fab) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM fabricante WHERE codigo = '" + cod_fab + "';";
            consultarBase(sql);
            return resultado.next();
            
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally
        {
            desconectarBase();
        }

    }

    //MODIFICAR
    public void modificarProducto(Producto p) throws MiExcepcion {

        try
        {
            if (p == null)
            {
                throw new MiExcepcion("PRODUCTO INVÁLIDO");
            }
            // SENTENCIA SQL DE MODIFICACIÓN
           String sql = "UPDATE producto SET nombre = '" + p.getNombre (  ) + "', "
                    + "precio = '" + p.getPrecio (  ) + "', "
                    + "codigo_fabricante = '" + p.getCodigoFabricante (  ) + "' "
                    + "WHERE codigo= '" + p.getCodigo  (  ) + "';";
            
            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR PRODUCTO");
        }

    }

    //ELIMINAR
    public void eliminarProducto(Integer cod) throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM producto WHERE codigo = '" + cod + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR PRODUCTO");
        }

    }

    //OBTENER
    public List<Producto> obtenerProducto() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto";
            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto aux = null;

            while (resultado.next())
            {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigoFabricante(resultado.getInt(4));

                productos.add(aux);
            }

            return productos;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally
        {
            desconectarBase();
        }
    }
    
     public List<Producto> obtenerProductoNombre() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT NOMBRE FROM producto";
            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto aux = null;

            while (resultado.next())
            {
                aux = new Producto();
                aux.setNombre(resultado.getString(1));
                
                productos.add(aux);
            }

            return productos;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally
        {
            desconectarBase();
        }
    }

     public List<Producto> obtenerProductoEntreRango() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto WHERE PRECIO BETWEEN 120 AND 202; ";
            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto aux = null;

            while (resultado.next())
            {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigoFabricante(resultado.getInt(4));

                productos.add(aux);
            }

            return productos;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally
        {
            desconectarBase();
        }
    }
     
     public List<Producto> obtenerProductoPortatil() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM PRODUCTO WHERE NOMBRE LIKE 'Portatil%'; ";
            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto aux = null;

            while (resultado.next())
            {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigoFabricante(resultado.getInt(4));

                productos.add(aux);
            }

            return productos;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally
        {
            desconectarBase();
        }
    }
     
      public List<Producto> obtenerProductoMasBarato() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT NOMBRE,PRECIO FROM PRODUCTO ORDER BY PRECIO ASC LIMIT 1;";
            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto aux = null;

            while (resultado.next())
            {
                aux = new Producto();
                aux.setNombre(resultado.getString(1));
                aux.setPrecio(resultado.getDouble(2));
                
                productos.add(aux);
            }

            return productos;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally
        {
            desconectarBase();
        }
    }

}