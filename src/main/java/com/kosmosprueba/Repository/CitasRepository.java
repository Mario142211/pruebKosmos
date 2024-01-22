package com.kosmosprueba.Repository;

import com.kosmosprueba.Model.CitasModel;
import com.kosmosprueba.Model.DoctoresModel;

import java.util.List;

public interface CitasRepository {
    public List<CitasModel> findAll();
    public int save(CitasModel cita);;
    public int update(CitasModel cita);
}
