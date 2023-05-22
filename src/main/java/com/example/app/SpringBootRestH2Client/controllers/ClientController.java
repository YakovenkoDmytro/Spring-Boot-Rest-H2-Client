package com.example.app.SpringBootRestH2Client.controllers;


import com.example.app.SpringBootRestH2Client.entity.Client;
import com.example.app.SpringBootRestH2Client.services.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController - комбінація @Controller і @ResponseBody,
// що означає, що замість рендерингу сторінок він просто відповідає
// даними, які ми йому надали.
// Це природно для REST API, повертати інформацію після
// потрапляння в кінцеву точку API.
@RestController
@RequestMapping(path = "/api/clients")
public class ClientController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ClientController.class);

    @Autowired
    ClientService service;

    // @GetMapping, @DeleteMapping, @PostMapping
    // зазначають типи HTTP-запитів, які оброблюють методи.
    // Це похідні варіанти анотації @RequestMapping з методом
    // RequestMethod.METHOD, встановленим для відповідних типів.
    // @RequestMapping зіставляє REST-запити з контролером або
    // методами оброблювача.

    @GetMapping
    public List<Client> getAllClients() {
        LOGGER.info("MY_LOG: ClientController.getAllClients()");
        return service.getAllClients();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") int id) {
        LOGGER.info("MY_LOG: ClientController.getClient(int id). ID: " + id);
        return service.getEmployeeById(id);
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        LOGGER.info("MY_LOG: ClientController.addClient(Client client). Add " +
               client.getFirstName() + ", " + client.getLastName() + ", " + client.getPhone());
        return service.saveOrUpdate(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        LOGGER.info("MY_LOG: ClientController.updateClient(Client client). Update " +
                client.getFirstName() + ", "+ client.getLastName());
        return service.saveOrUpdate(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable("id") int id) {
        LOGGER.info("MY_LOG: ClientController.deleteClient(int id). ID: " + id);
        service.deleteClientById(id);
    }
}
