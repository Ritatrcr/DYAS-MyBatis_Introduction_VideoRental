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

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.ItemRentadoMapper;
import edu.unisabana.dyas.sampleprj.dao.mybatis.mappers.TipoItemMapper;

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

        
        //Crear el mapper y usarlo: 
        //ClienteMapper cm=sqlss.getMapper(ClienteMapper.class)
        //cm...

        System.out.println("");
        System.out.println("");
        System.out.println("Consultando cliente por id...");
        System.out.println("");
        ClienteMapper cm=sqlss.getMapper(ClienteMapper.class);
        System.out.println(cm.consultarCliente(123456789));


        System.out.println("");
        System.out.println("");
        System.out.println("Insertando items rentados..");
        System.out.println("");
        ItemRentadoMapper irm = sqlss.getMapper(ItemRentadoMapper.class);
        irm.insertarItemRentado(123456789, 1, new String(), new String());



        System.out.println("");
        System.out.println("");
        System.out.println("Consultando cliente por id...");
        System.out.println("");
        ClienteMapper cm1=sqlss.getMapper(ClienteMapper.class);
        System.out.println(cm1.consultarClientes());

        System.out.println("");
        System.out.println("");
        System.out.println("Consultando ItemsMapper");
        System.out.println("");
        ItemMapper cmItemMapper=sqlss.getMapper(ItemMapper.class);
        System.out.println(cmItemMapper.consultarItems());



       
        System.out.println("");
        System.out.println("");
        System.out.println("Consultando TipoItemsMapper");
        System.out.println("");
        TipoItemMapper cmTipoItemMapper = sqlss.getMapper(TipoItemMapper.class);
        System.out.println(cmTipoItemMapper.getTiposItems());

        
        
        
        sqlss.commit();
        
        
        sqlss.close();

        
        
    }


}
