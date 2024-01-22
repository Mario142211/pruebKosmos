package com.kosmosprueba.Repository;

import com.kosmosprueba.Model.DoctoresModel;

import java.util.List;

public interface DoctoresRepository {

    public List<DoctoresModel> findAll();
    public int save(DoctoresModel doctores);;
     public int update(DoctoresModel doctores);
}
