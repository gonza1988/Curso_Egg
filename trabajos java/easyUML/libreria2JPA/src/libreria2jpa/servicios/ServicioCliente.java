/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2jpa.servicios;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import libreria2jpa.entidades.Cliente;
import libreria2jpa.persistencia.ClienteDAO;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioCliente {

    private final ClienteDAO daoCliente;

    public ServicioCliente() {
        this.daoCliente = new ClienteDAO();

    }

    public Cliente crearCliente(String dni, String nombre, String apellido, String telefono) throws Exception {

        try {
            //Validamos
            if (dni == null || dni.trim().isEmpty()) {
                throw new Exception("Debe indicar el dni");
            }
            if (dni.length() < 7) {
                throw new Exception("El dni no puede contener menos de 7 numeros");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (apellido == null || apellido.trim().isEmpty()) {
                throw new Exception("Debe indicar el apellido");
            }
            if (telefono == null || telefono.trim().isEmpty()) {
                throw new Exception("Debe indicar el telefono");
            }
            if (telefono.length() < 7) {
                throw new Exception("El telefono puede contener menos de 7 numeros");
            }

            //Creamos el Cliente
            Cliente cliente = new Cliente();

            cliente.setDni(dni);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(telefono);
            // cliente.setId(UUID.randomUUID().toString());//CADENA DE CARACTERES

            //Dejo independiente el SET de cargar mascotas, no obligo q cuando se log cargue su mascota
            daoCliente.guardarCliente(cliente);
            return cliente;
        } catch (Exception e) {
            System.out.println("No se creeo el cliente" + e.getMessage());
            return null;
        }
    }

    public void modificarCliente(String dni, String nombre, String apellido, String telefono) throws Exception {

        try {
            //Validamos
            if (dni == null || dni.trim().isEmpty()) {
                throw new Exception("Debe indicar el dni del cliente");
            }
            //Buscamos
            Cliente cliente = buscarClientePorDni(dni);
            if (cliente == null) {
                throw new Exception("No se encontro el cliente en la Base de Datos");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (apellido == null || apellido.trim().isEmpty()) {
                throw new Exception("Debe indicar el apellido");
            }
            if (telefono == null || telefono.trim().isEmpty()) {
                throw new Exception("Debe indicar el telefono");
            }
            if (telefono.length() < 7) {
                throw new Exception("El telefono puede contener menos de 7 numeros");
            }
            //Modificamos
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(telefono);
            daoCliente.modificarCliente(cliente);
            System.out.println("¡Cliente modificado con exito!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarCliente(String dni) throws Exception {

        try {
            //Validamos 
            if (dni == null || dni.trim().isEmpty()) {
                throw new Exception("Debe indicar el dni");
            }
            daoCliente.eliminarClientePorDni(dni);
            System.out.println("CLIENTE ELIMINADO CON EXITO");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Cliente buscarClientePorDni(String dni) throws Exception {
        try {

            //Validamos
            if (dni == null || dni.trim().isEmpty()) {
                throw new Exception("Debe indicar el dni");
            }

            Cliente cliente = daoCliente.buscarClientePorDni(dni);
            if (cliente == null){
                throw new Exception("No se encontro el Cliente en la Base de Datos");
            }
            return cliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            
        }
    }

    public Cliente buscarClientePorId(Integer id) throws Exception {

        try {
            //Validamos
            if (id == null) {
                throw new Exception("Debe indicar el id del usuario");
            }
            Cliente cliente = daoCliente.buscarClienteId(id);
            if (cliente == null){
                throw new Exception("No se encontro el Cliente en la Base de Datos");
            }
            return cliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Collection<Cliente> listaClientes() throws Exception {

        try {
            Collection<Cliente> clientes = daoCliente.listarClientes();
            return clientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void imprimirClientes() throws Exception {
        try {
            //Listamos los usuarios
            Collection<Cliente> clientes = listaClientes();

            //Imprimimos los usuarios - Solo algunos atributos....
            if (clientes.isEmpty()) {
                throw new Exception("No existen clientes para imprimir");
            } else {
                for (Cliente c : clientes) {
                    System.out.println("*****************************************");
                    System.out.println(" Id:" + c.getId()
                            + "\n DNI:" + c.getDni()
                            + "\n Nombre:" + c.getNombre()
                            + "\n Apellido:" + c.getApellido()
                            + "\n Telefono:" + c.getTelefono());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void imprimirUnClienteDni(String dni) throws Exception {
        System.out.println(daoCliente.buscarClientePorDni(dni));
    }

     public void imprimirUnClienteId(Integer id) throws Exception {
        System.out.println(daoCliente.buscarClienteId(id));
    }
}
