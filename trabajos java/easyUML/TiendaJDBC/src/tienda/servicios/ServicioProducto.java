/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import excepcion.MiExcepcion;
import java.util.List;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioProducto {

    private ProductoDAO pDAO;

    public ServicioProducto() {
        this.pDAO = new ProductoDAO();
    }

//CREA NUEVO    
    public void crearProducto(Integer codigo, String nombre, Double precio, Integer cod_fab) throws MiExcepcion {
        try
        {
            // VALIDACIÓN
            if (codigo == null | codigo < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN CODIGO");
            }

            if (nombre == null | nombre.trim().isEmpty())
            {
                throw new MiExcepcion("DEBE INGRESAR UN NOMBRE");
            }

            if (precio == null | precio < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN PRECIO");
            }

            if (cod_fab == null | cod_fab < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN CODIGO DE FABRICANTE");
            }
            
            if (!pDAO.buscarProductoPorFab(cod_fab))
            {
                throw new MiExcepcion("NO EXISTE EL FABRICANTE");
            }
            
            Producto p = new Producto();

            p.setCodigo(codigo);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigoFabricante(cod_fab);
            pDAO.guardarProducto(p);

        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

//MODIFICA
    public void modificarProducto(Integer codigo, String nombre, Double precio, Integer cod_fab) throws MiExcepcion {
        try
        {   // VALIDACIÓN
            if (codigo == null | codigo < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN CODIGO");
            }
            if (nombre == null | nombre.trim().isEmpty())
            {
                throw new MiExcepcion("DEBE INGRESAR UN NOMBRE");
            }   
            if (precio == null | precio < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN PRECIO");
            }  
            if (cod_fab == null | cod_fab < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN CODIGO DE FABRICANTE");
            }  
            Producto p = pDAO.buscarProductoPorCodigo(codigo);

            if (p == null)
            {
                throw new MiExcepcion("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN PRODUCTO");
            }
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigoFabricante(cod_fab);

            pDAO.modificarProducto(p);
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

//ELIMINA
    public void eliminarProducto(Integer cod) throws MiExcepcion {
        try
        {
            if (cod == null || cod < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN CODIGO");
            }

            Producto p = pDAO.buscarProductoPorCodigo(cod);

            if (p == null)
            {
                throw new MiExcepcion("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN USUARIO");
            }

            pDAO.eliminarProducto(cod);
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

//MUESTRA    
    public void muestraProducto() throws MiExcepcion {
        try
        {
            List<Producto> productos = pDAO.obtenerProducto();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-10s%-35s%-12s%-20s\n", "CODIGO", "NOMBRE", "PRECIO $", "COD.FABRICANTE" ); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.println(aux);
                }
                System.out.println();
            }
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }
    
    public void muestraProductoNombre() throws MiExcepcion {
        try
        {
            List<Producto> productos = pDAO.obtenerProductoNombre();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-8s","NOMBRE" ); // FORMATO DE IMPRESIÓN
                System.out.println();
                for (Producto aux : productos)
                {
                    System.out.println(aux.getNombre());
                }
                System.out.println();
            }
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

     public void muestraProductoEntreRango() throws MiExcepcion {
        try
        {
            List<Producto> productos = pDAO.obtenerProductoEntreRango();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-10s%-35s%-12s%-20s\n", "CODIGO", "NOMBRE", "PRECIO $", "COD.FABRICANTE" ); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.println(aux);
                }
                System.out.println();
            }
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }
     
     public void muestraProductoPortatil() throws MiExcepcion {
        try
        {
            List<Producto> productos = pDAO.obtenerProductoPortatil();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-10s%-35s%-12s%-20s\n", "CODIGO", "NOMBRE", "PRECIO $", "COD.FABRICANTE" ); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.println(aux);
                }
                System.out.println();
            }
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }
     
     public void muestraProductoMasBarato() throws MiExcepcion {
        try
        {
            List<Producto> productos = pDAO.obtenerProductoMasBarato();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-30s%-12s\n","NOMBRE", "PRECIO $" ); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.println(aux.getNombre()+ "\t"+aux.getPrecio());
                }
                System.out.println();
            }
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }
}

