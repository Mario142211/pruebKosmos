package com.kosmosprueba.Repository;

import com.kosmosprueba.Model.DoctoresModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DocRepository implements DoctoresRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<DoctoresModel> findAll() {
        String SQL="SELECT * FROM Doctores";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(DoctoresModel.class));
    }

    @Override
    public int save(DoctoresModel doctores) {
        String SQL="INSERT INTO Doctores VALUES (?,?,?,?)";
        return jdbcTemplate.update(SQL, new Object[]{doctores.getNombre(),doctores.getApellidoPaterno(),doctores.getApellidoMaterno(),doctores.getEspecialidad()});
    }

    @Override
    public int update(DoctoresModel doctores) {
        String SQL="INSERT INTO Doctores SET Nombre=?, apellidoPaterno=?, apellidoMaterno=?, especialidad=? WHERE idDoctor=?";
        return jdbcTemplate.update(SQL, new Object[]{doctores.getNombre(),doctores.getApellidoPaterno(),doctores.getApellidoMaterno(),doctores.getEspecialidad(), doctores.getIdDoctor()});
    }
}
