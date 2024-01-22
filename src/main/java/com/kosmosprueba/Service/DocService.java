package com.kosmosprueba.Service;

import com.kosmosprueba.Model.DoctoresModel;
import com.kosmosprueba.Repository.DoctoresRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DocService implements IDoctoresService{

    @Autowired
    private DoctoresRepository doctoresRepository;
    @Override
    public List<DoctoresModel> findAll() {
        List<DoctoresModel> list;
        try {
            list=doctoresRepository.findAll();

        }catch (Exception ex){
            throw ex;
        }
        return list;
    }

    @Override
    public int save(DoctoresModel doctores) {
      int row;
        try {
            row=doctoresRepository.save(doctores);

        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int update(DoctoresModel doctores) {
        int row;
        try {
            row=doctoresRepository.update(doctores);

        }catch (Exception ex){
            throw ex;
        }
        return row;
    }
}
