package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name= "u_seq")
    private int u_seq;
    private String u_id;
    private String u_pw;
    private String u_image;
    private String u_name;
    private String u_gender;
    private String u_phone;
    private String u_email;
    private String u_teams;
    private String u_address1;
    private String u_address2;
    private String u_class;
    private LocalDateTime u_registDate;
    private String u_status;
    private LocalDateTime u_lastLogin;

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();
}
