package com.backend.integrador.test;

import com.backend.integrador.dao.impl.OdontologoDaoH2;
import com.backend.integrador.entity.Odontologo;
import com.backend.integrador.service.OdontologoService;
import org.junit.jupiter.api.Test;

import java.sql.SQLData;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    void listarOdontologos() {
        List<Odontologo> odontologoTest = odontologoService.listarOdontologos();
        assertFalse(odontologoTest.isEmpty());
        assertTrue(odontologoTest.size() >= 1);
    }

    @Test
    void registrarOdontologo() {
        Odontologo odontologo1 = new Odontologo("MN112226", "Camilo", "Galindo");
        Odontologo odontologo2 = new Odontologo("MN115027", "Angela", "Bozzetti");

        Odontologo odontologoRegistrado1 = odontologoService.registrarOdontologo(odontologo1);
        Odontologo odontologoRegistrado2 = odontologoService.registrarOdontologo(odontologo2);

        assertNotNull(odontologoRegistrado1.getId());
        assertNotNull(odontologoRegistrado2.getId());


    }
}