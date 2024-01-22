package com.kosmosprueba.Repository;

import com.kosmosprueba.Model.CitasModel;
import com.kosmosprueba.Model.ConsultorioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ConsulRepository implements ConsultorioRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<ConsultorioModel> findAll() {
        String SQL="SELECT * FROM Consultorios";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(ConsultorioModel.class));
    }

    @Override
    public int save(ConsultorioModel consul) {
        String SQL="INSERT INTO Consultorios VALUES (?,?)";
        return jdbcTemplate.update(SQL, new Object[]{consul.getNumeroConsultorio(),consul.getPiso()});

    }

    @Override
    public int update(ConsultorioModel consul) {
        String SQL="INSERT INTO Consultorios SET numeroConsultorio=?, Piso=? WHERE idConsultorio=?";
        return jdbcTemplate.update(SQL, new Object[]{consul.getNumeroConsultorio(),consul.getPiso(),consul.getIdConsultorio()});

    }
}
