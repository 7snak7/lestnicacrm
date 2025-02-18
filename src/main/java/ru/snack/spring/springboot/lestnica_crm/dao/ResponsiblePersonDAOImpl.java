package ru.snack.spring.springboot.lestnica_crm.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.snack.spring.springboot.lestnica_crm.entity.ResponsiblePerson;

import java.util.List;

@Repository
public class ResponsiblePersonDAOImpl implements ResponsiblePersonDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<ResponsiblePerson> findAll() {
        return entityManager.createQuery("FROM ResponsiblePerson ORDER BY id", ResponsiblePerson.class).getResultList();
    }

    @Override
    public ResponsiblePerson findById(Long id) {
        return entityManager.find(ResponsiblePerson.class, id);
    }

    @Override
    public void save(ResponsiblePerson responsiblePerson) {
        ResponsiblePerson newResponsiblePerson = entityManager.merge(responsiblePerson);
        responsiblePerson.setId(newResponsiblePerson.getId());
    }

    @Override
    public void delete(ResponsiblePerson responsiblePerson) {
        entityManager.remove(responsiblePerson);
    }
}
