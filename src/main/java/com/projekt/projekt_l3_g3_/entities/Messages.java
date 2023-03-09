package com.projekt.projekt_l3_g3_.entities;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "Messages")
public class Messages {
    @Id
    @Column(name = "Message_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;

    //    @ManyToOne(targetEntity = Users.class)
    //    @JoinColumn(name = "")
    //    private Users user;

    //    @ManyToOne(targetEntity = Users.class)
    //    @JoinColumn(name = "")
    //    private Users user;

    @Column(name = "Message_Content", length = 50)
    private String groupName;

    @Column(name = "Timestaps")
    private Timestamp timestamp;
}
