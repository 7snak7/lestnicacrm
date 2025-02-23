package ru.snack.spring.springboot.lestnica_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import ru.snack.spring.springboot.lestnica_crm.entity.ResponsiblePerson;

@CrossOrigin
public interface ResponsiblePersonRepository extends JpaRepository<ResponsiblePerson, Integer> {
}