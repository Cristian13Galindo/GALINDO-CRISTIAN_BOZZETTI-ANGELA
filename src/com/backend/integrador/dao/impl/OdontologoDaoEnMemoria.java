package com.backend.integrador.dao.impl;

import com.backend.integrador.dao.IDao;
import com.backend.integrador.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoEnMemoria implements IDao<Odontologo> {

    private static final Logger LOGGER = Logger.getLogger(OdontologoDaoEnMemoria.class);

    private List<Odontologo> odontologoList;

    //constructor
    public OdontologoDaoEnMemoria(List<Odontologo> odontologoList) {
        this.odontologoList = odontologoList;
    }

    //metodos
    @Override
    public Odontologo registrar(Odontologo odontologo) {
        odontologoList.add(odontologo);
        LOGGER.info("Odontologo registrado: " + odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        LOGGER.info("Listado de los odontologos: \n" + odontologoList);
        return odontologoList;
    }
}
