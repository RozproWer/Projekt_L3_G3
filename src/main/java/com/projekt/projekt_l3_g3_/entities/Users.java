package com.projekt.projekt_l3_g3_.entities;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @Column(name = "User_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "Username", length = 50)
    private String username;

    @Column(name = "Password", length = 50)
    private String password;

    @Column(name = "Email_Address", length = 50)
    private String emailAddress;

    @Column(name = "First_Name", length = 50)
    private String firstName;

    @Column(name = "Last_Name", length = 50)
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "Role")
    private String role;

    @ManyToOne(targetEntity = Groups.class)
    @JoinColumn(name = "Group_ID")
    private Groups group;

//
//    @ManyToOne(targetEntity = Oddzial.class)
//    @JoinColumn(name = "id_oddzialu")
//    private Oddzial oddzial;
//
//    @Column(name = "nr_telefonu", length = 9)
//    private String lekarzNrTelefonu;
}
