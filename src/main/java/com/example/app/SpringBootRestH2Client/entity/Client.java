package com.example.app.SpringBootRestH2Client.entity;


import jakarta.persistence.*;
import lombok.*;

// Модель об'єкту.
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String phone;


    // Використовуємо Lombok.
    // Зазначати явно конструктор(и),
    // getters, setters НЕ потрібно.
}
