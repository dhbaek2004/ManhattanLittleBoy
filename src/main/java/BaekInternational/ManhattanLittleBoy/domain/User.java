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
    private int userSeq;
    private String userId;
    private String userPw;
    private String userImage;
    private String userName;
    private String userGender;
    private String userPhone;
    private String userEmail;
    private String userTeams;
    private String userAddress1;
    private String userAddress2;
    private String userClass;
    private LocalDateTime userRegistDate;
    private String userStatus;
    private LocalDateTime userLastLogin;

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    private Basket basket;
}
