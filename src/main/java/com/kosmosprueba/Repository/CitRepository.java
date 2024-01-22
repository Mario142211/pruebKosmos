package com.kosmosprueba.Repository;

import com.kosmosprueba.Model.CitasModel;
import com.kosmosprueba.Model.DoctoresModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CitRepository implements CitasRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<CitasModel> findAll() {
        String SQL="SELECT * FROM Citas";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(CitasModel.class));
    }

    @Override
    public int save(CitasModel cita) {
        String SQL="INSERT INTO Doctores VALUES (?,?,?,?)";
        return jdbcTemplate.update(SQL, new Object[]{cita.getIdDoctor(),cita.getIdConsultorio(),cita.getHorarioConsulta(),cita.getNombrePaciente()});
    }

    @Override
    public int update(CitasModel cita) {
        String SQL="INSERT INTO Citas SET idDoctor=?, idConsultorio=?, horarioConsulta=?, nombrePaciente=? WHERE idCita=?";
        return jdbcTemplate.update(SQL, new Object[]{cita.getIdDoctor(),cita.getIdCita(),cita.getHorarioConsulta(),cita.getNombrePaciente(), cita.getIdCita()});
    }
}
