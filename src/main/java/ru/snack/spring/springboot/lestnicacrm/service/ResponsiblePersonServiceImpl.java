package ru.snack.spring.springboot.lestnicacrm.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.snack.spring.springboot.lestnicacrm.dao.ResponsiblePersonDAO;
import ru.snack.spring.springboot.lestnicacrm.entity.ResponsiblePerson;

import java.util.List;

@Service
public class ResponsiblePersonServiceImpl implements ResponsiblePersonService {

    @Autowired
    private ResponsiblePersonDAO responsiblePersonDAO;

    @Override
    @Transactional
    public List<ResponsiblePerson> findAll() {
        return responsiblePersonDAO.findAll();
    }

    @Override
    @Transactional
    public ResponsiblePerson findById(Long id) {
        return responsiblePersonDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(ResponsiblePerson responsiblePerson) {
        responsiblePersonDAO.save(responsiblePerson);
    }

    @Override
    @Transactional
    public void delete(ResponsiblePerson responsiblePerson) {
        responsiblePersonDAO.delete(responsiblePerson);
    }
}
