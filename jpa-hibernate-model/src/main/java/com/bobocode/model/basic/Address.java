package com.bobocode.model.basic;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = "id")
@ToString(exclude = "user")
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String street;
    @Column(name = "street_number")
    private String streetNumber;
    @Column(name = "apartment_number")
    private String apartmentNumber;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @OneToOne
    private User user;
}
