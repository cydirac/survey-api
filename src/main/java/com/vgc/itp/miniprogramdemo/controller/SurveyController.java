package com.vgc.itp.miniprogramdemo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.vgc.itp.miniprogramdemo.pojo.Survey;
import com.vgc.itp.miniprogramdemo.service.SurveyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/survey")
public class SurveyController{
    @Autowired
    private SurveyService service;

    @RequestMapping(method = RequestMethod.POST)
    public String save(@RequestBody Survey survey, HttpServletRequest request){
        survey.setSourceIp(request.getRemoteAddr());
        service.save(survey);
        return "Success save survey into database";
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Survey> findAll(){
        return service.findAll();
    }
        
}