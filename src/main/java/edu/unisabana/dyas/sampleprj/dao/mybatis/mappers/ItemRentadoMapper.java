package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.unisabana.dyas.samples.entities.ItemRentado;

public interface ItemRentadoMapper {
    /**
     * Inserta un nuevo registro de item rentado asociado a un cliente.
     * @param idcli       documento o identificador del cliente.
     * @param idit        identificador del item.
     * @param fechainicio fecha de inicio de la renta.
     * @param fechafin    fecha de fin de la renta.
     */
    public void insertarItemRentado(@Param("idcli") int idcli,
                                    @Param("idit") int idit,
                                    @Param("fechainicio") String fechainicio,
                                    @Param("fechafin") String fechafin);

    public List<ItemRentado> consultarItemsRentados();

}
