package ru.snack.spring.springboot.lestnica_crm.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.snack.spring.springboot.lestnica_crm.entity.ShopAnix;

import java.util.List;

@Repository
public class ShopAnixDAOImpl implements ShopAnixDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public ShopAnix findById(int id) {
        return entityManager.find(ShopAnix.class, id);
    }

    @Override
    public List<ShopAnix> findAll() {
        return entityManager.createQuery("FROM ShopAnix ORDER BY id", ShopAnix.class).getResultList();
    }

    @Override
    public void save(ShopAnix shopAnix) { entityManager.merge(shopAnix); }

    @Override
    public void delete(ShopAnix shopAnix) { entityManager.remove(shopAnix); }
}
