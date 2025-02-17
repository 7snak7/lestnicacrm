package ru.snack.spring.springboot.lestnicacrm.service;

import ru.snack.spring.springboot.lestnicacrm.entity.ResponsiblePerson;

import java.util.List;

public interface ResponsiblePersonService {

    public List<ResponsiblePerson> findAll();

    public ResponsiblePerson findById(Long id);

    public void save(ResponsiblePerson responsiblePerson);

    public void delete(ResponsiblePerson responsiblePerson);
}
