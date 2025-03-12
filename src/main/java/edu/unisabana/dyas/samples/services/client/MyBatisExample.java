/*
 * Copyright (C) 2015 cesarvefe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.unisabana.dyas.samples.services.client;



import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ItemRentadoMapper;
import edu.unisabana.dyas.samples.entities.Cliente;
import edu.unisabana.dyas.samples.entities.Item;
import edu.unisabana.dyas.samples.entities.TipoItem;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author cesarvefe
 */
public class MyBatisExample {

    /**
     * Método que construye una fábrica de sesiones de MyBatis a partir del
     * archivo de configuración ubicado en src/main/resources
     *
     * @return instancia de SQLSessionFactory
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return sqlSessionFactory;
    }

    /**
     * Programa principal de ejempo de uso de MyBATIS
     * @param args
     * @throws SQLException 
     */
    public static void main(String args[]) throws SQLException {
        SqlSessionFactory sessionfact = getSqlSessionFactory();

        SqlSession sqlss = sessionfact.openSession();
        ClienteMapper cm=sqlss.getMapper(ClienteMapper.class);
        ItemRentadoMapper irm=sqlss.getMapper(ItemRentadoMapper.class);
        ItemMapper im=sqlss.getMapper(ItemMapper.class);


        System.out.println("");


        System.out.println("______________________________________________________");


        //Consultar todos los clientes
        System.out.println("CONSULTANDO TODOS LOS CLIENTES");
        List<Cliente> clientes = cm.consultarClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            System.out.println("");
        }

        System.out.println("");

        System.out.println("______________________________________________________");

 
        // Insertar Item
        System.out.println("INSERTANDO ITEM NUEVO EN LA BASE DE DATOS (Libro)");
        Item nuevoItem = new Item(new TipoItem(1, "Libro"), 15, "El principito", "Fábula filosófica",
                "1943-04-06", 3000, "Digital", "Ficción");
        im.insertarItem(nuevoItem);

       System.out.println("");

       System.out.println("______________________________________________________");


        // Agregar Item rentado a Cliente 
        System.out.println("AGREGANDO ITEM 1 RENTADO A CLIENTE CON ID 987654321");
        irm.agregarItemRentadoACliente(4,987654321, 1, "2024-03-08", "2024-03-15");
 
        System.out.println("");
 

        System.out.println("______________________________________________________");


        //Consultar 1 cliente por ID
        System.out.println("CONSULTANDO CLIENTE CON ID 987654321");
        System.out.println(cm.consultarCliente(987654321));

        System.out.println("");


        System.out.println("______________________________________________________");

        // Consultar item por ID
        System.out.println("CONSULTANDO ITEM CON ID 1");
        Item item = im.consultarItem(1);
        System.out.println("Item consultado: " + item);

        System.out.println("");

        System.out.println("______________________________________________________");



        // Consultando todos los items
        System.out.println("CONSULTANDO TODOS LOS ITEMS");
        List<Item> items = im.consultarItems();
        for (Item it : items) {
            System.out.println(it);
        }

        System.out.println("");


      



        sqlss.commit();
        
        
        sqlss.close();

        
        
    }


}
