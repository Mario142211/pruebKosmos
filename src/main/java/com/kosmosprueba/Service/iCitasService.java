package com.kosmosprueba.Service;

import com.kosmosprueba.Model.CitasModel;

import java.util.List;

public interface iCitasService {
    public List<CitasModel> findAll();
    public int save(CitasModel cita);;
    public int update(CitasModel cita);
}
