package com.kosmosprueba.Repository;

import com.kosmosprueba.Model.CitasModel;
import com.kosmosprueba.Model.ConsultorioModel;

import java.util.List;

public interface ConsultorioRepository {
    public List<ConsultorioModel> findAll();
    public int save(ConsultorioModel consul);;
    public int update(ConsultorioModel consul);
}
