package com.dhb.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by mtime on 2018/9/11.
 */

@Entity
@Data
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name = "";

    private String telephone = "";

    private String email = "";

    private Date create_time = new Date();

    private String password = "";

    private String extra = "";

}
