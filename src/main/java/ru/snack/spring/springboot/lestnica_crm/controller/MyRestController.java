package ru.snack.spring.springboot.lestnica_crm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.snack.spring.springboot.lestnica_crm.entity.ResponsiblePerson;
import ru.snack.spring.springboot.lestnica_crm.service.ResponsiblePersonService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private ResponsiblePersonService responsiblePersonService;

    @GetMapping("/allPersons")
    public List<ResponsiblePerson> getAllPersons() {return responsiblePersonService.findAll();}
}
