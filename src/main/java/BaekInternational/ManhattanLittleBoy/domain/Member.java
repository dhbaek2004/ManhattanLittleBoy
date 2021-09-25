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
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "m_seq")
    private Long memberSeq;
    private String memberId;
    private String memberPw;
    private String memberImage;
    private String memberName;
    private String memberGender;
    private String memberPhone;
    private String memberEmail;
    private String memberTeams;
    private String memberAddress1;
    private String memberAddress2;
    private String memberClass;
    private LocalDateTime memberRegistDate;
    private String memberStatus;
    private LocalDateTime memberLastLogin;

//    @OneToMany(mappedBy = "user")
//    private List<Order> orders = new ArrayList<>();
//
//    @OneToOne(mappedBy = "user") //OneToOne에선 JoinColumn을 꼭 쓰기.
//    //@JoinColumn(name = "b_seq")
//    private Basket basket;
}