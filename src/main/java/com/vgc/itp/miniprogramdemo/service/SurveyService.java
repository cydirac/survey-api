package com.vgc.itp.miniprogramdemo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import com.vgc.itp.miniprogramdemo.pojo.Survey;
import com.vgc.itp.miniprogramdemo.repo.SurveyRepository;

import org.springframework.stereotype.Service;

@Service
public class SurveyService{
    @Resource
    private SurveyRepository repo;

    @Transactional
    public void save(Survey survey){
        repo.save(survey);
    }

    public Iterable<Survey> findAll(){
        return repo.findAll();
    }
}