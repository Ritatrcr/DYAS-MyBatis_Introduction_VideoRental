package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import java.util.List;
import edu.unisabana.dyas.samples.entities.TipoItem;

/**
 * Interfaz `TipoItemMapper` utilizada para mapear las consultas SQL relacionadas con la entidad `TipoItem`.
 * Se integra con MyBatis para interactuar con la base de datos y gestionar los tipos de ítems.
 */
public interface TipoItemMapper {
    
    /**
     * Obtiene la lista de todos los tipos de ítems registrados en la base de datos.
     *
     * @return Lista de objetos `TipoItem` que representan los diferentes tipos de ítems.
     */
    public List<TipoItem> getTiposItems();
    
    /**
     * Consulta un tipo de ítem específico en la base de datos según su identificador único.
     *
     * @param id Identificador del tipo de ítem.
     * @return Objeto `TipoItem` correspondiente al ID proporcionado, o `null` si no se encuentra.
     */
    public TipoItem getTipoItem(int id);
    
    /**
     * Agrega un nuevo tipo de ítem en la base de datos.
     *
     * @param des Descripción del tipo de ítem a registrar.
     */
    public void addTipoItem(String des);
}

