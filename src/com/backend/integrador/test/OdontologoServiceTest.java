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


}