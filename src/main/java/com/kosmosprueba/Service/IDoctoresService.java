package com.kosmosprueba.Service;

import com.kosmosprueba.Model.DoctoresModel;
import com.kosmosprueba.Repository.DocRepository;
import com.kosmosprueba.Repository.DoctoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IDoctoresService  {
    public List<DoctoresModel> findAll();
    public int save(DoctoresModel doctores);;
    public int update(DoctoresModel doctores);
}
