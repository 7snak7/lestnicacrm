package ru.snack.spring.springboot.lestnicacrm.dao;

import org.springframework.stereotype.Repository;
import ru.snack.spring.springboot.lestnicacrm.entity.ResponsiblePerson;

import java.util.List;

public interface ResponsiblePersonDAO {

    public List<ResponsiblePerson> findAll();

    public ResponsiblePerson findById(Long id);

    public void save(ResponsiblePerson responsiblePerson);

    public void delete(ResponsiblePerson responsiblePerson);
}
