package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import edu.unisabana.dyas.samples.entities.Item;

/**
 * Interfaz `ItemMapper` utilizada para mapear las consultas SQL relacionadas con la entidad `Item`.
 * Se integra con MyBatis para interactuar con la base de datos y realizar operaciones CRUD sobre los ítems.
 * 
 * @author cesarvefe
 */
public interface ItemMapper {

    /**
     * Consulta y obtiene la lista de todos los ítems disponibles en la base de datos.
     * @return Lista de objetos `Item` que representan los ítems registrados.
     */
    List<Item> consultarItems();

    /**
     * Consulta un ítem específico en la base de datos según su identificador único.
     * @param id Identificador del ítem.
     * @return Objeto `Item` correspondiente al ID proporcionado, o `null` si no se encuentra.
     */
    Item consultarItem(@Param("id") int id);

    /**
     * Inserta un nuevo ítem en la base de datos.
     *
     * @param item Objeto `Item` que contiene los datos del ítem a registrar.
     */
    void insertarItem(@Param("item") Item item);
}
