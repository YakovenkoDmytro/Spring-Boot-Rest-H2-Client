package com.example.app.SpringBootRestH2Client.repository;


import com.example.app.SpringBootRestH2Client.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// @Repository - варіант @Component,
// який повідомляє Spring, що це компонент,
// яким має керувати контейнер IoC.
// Зокрема, репозиторії призначені визначення
// логіки для шару збереження.
//
// Розширення CrudRepository приймає клас сутності,
// а також тип даних ID, який він повинен використовувати
// для запиту.
//
// CrudRepository оголошує методи, які становлять
// базову функціональність CRUD репозиторію.
// https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.htmll
@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    // Можливо без явного оголошення методів

    List<Client> findAll();
    Optional<Client> findById(int id);

    // WARNING: Unchecked overriding: return type requires unchecked conversion.
//    Client save(Client employee);
    <S extends Client> S save(S client);

    void deleteById(int id);
}
