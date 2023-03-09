package com.projekt.projekt_l3_g3_.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tasks")
public class Tasks {
    @Id
    @Column(name = "Task_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;

    @Column(name = "Task_Name", length = 50)
    private String groupName;

    @Column(name = "Task_Description", length = 254)
    private String taskDescription;

    @Column(name = "Task_Status", length = 50)
    private String taskStatus;

    @Column(name = "Task_Priority", length = 50)
    private String taskPriority;

    @Column(name = "Due_Date")
    private LocalDate dueDate;

//    @ManyToOne(targetEntity = Users.class)
//    @JoinColumn(name = "")
//    private Users user;

}
