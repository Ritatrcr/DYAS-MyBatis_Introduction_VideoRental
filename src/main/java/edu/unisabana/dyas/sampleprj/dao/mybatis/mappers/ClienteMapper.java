package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.unisabana.dyas.samples.entities.Cliente;

/**
 * Interfaz `ClienteMapper` utilizada para mapear las consultas SQL relacionadas con la entidad `Cliente`.
 * Se integra con MyBatis para interactuar con la base de datos.
 * 
 * @author cesarvefe
 */
public interface ClienteMapper {

    /**
     * Consulta un cliente en la base de datos dado su identificador único.
     *
     * @param idcli Identificador del cliente.
     * @return Cliente correspondiente al ID proporcionado, o null si no se encuentra.
     */
    public Cliente consultarCliente(@Param("idcli") int id);

    /**
     * Asigna un ítem rentado a un cliente específico en la base de datos.
     *
     * @param id Identificador del cliente.
     * @param idit Identificador del ítem rentado.
     * @param fechainicio Fecha de inicio de la renta.
     * @param fechafin Fecha de finalización de la renta.
     */
    public void agregarItemRentadoACliente(int id, 
            int idit, 
            Date fechainicio,
            Date fechafin);

    /**
     * Obtiene la lista de todos los clientes registrados en la base de datos.
     *
     * @return Lista de objetos `Cliente` que representan a todos los clientes.
     */
    public List<Cliente> consultarClientes();
    
}
