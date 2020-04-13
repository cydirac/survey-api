package com.vgc.itp.miniprogramdemo.repo;

import java.util.List;

import com.vgc.itp.miniprogramdemo.pojo.Survey;

import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<Survey, Long>{
    List<Survey> findByGender(String gender);
    Survey findByuid(String uid);
}