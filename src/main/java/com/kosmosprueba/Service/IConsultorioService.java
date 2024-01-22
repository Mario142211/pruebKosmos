package com.kosmosprueba.Service;

import com.kosmosprueba.Model.ConsultorioModel;

import java.util.List;

public interface IConsultorioService {
    public List<ConsultorioModel> findAll();
    public int save(ConsultorioModel consul);;
    public int update(ConsultorioModel consul);
}
