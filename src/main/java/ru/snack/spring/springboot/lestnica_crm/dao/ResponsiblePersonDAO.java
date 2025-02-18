package ru.snack.spring.springboot.lestnica_crm.dao;

import ru.snack.spring.springboot.lestnica_crm.entity.ResponsiblePerson;

import java.util.List;

public interface ResponsiblePersonDAO {

    public List<ResponsiblePerson> findAll();

    public ResponsiblePerson findById(Long id);

    public void save(ResponsiblePerson responsiblePerson);

    public void delete(ResponsiblePerson responsiblePerson);
}
