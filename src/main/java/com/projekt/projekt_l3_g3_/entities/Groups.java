package com.projekt.projekt_l3_g3_.entities;

import javax.persistence.*;

@Entity
@Table(name = "Groups")
public class Groups {
    @Id
    @Column(name = "Group_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupID;

}
