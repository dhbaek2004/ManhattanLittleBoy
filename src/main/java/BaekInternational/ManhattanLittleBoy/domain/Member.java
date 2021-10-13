package BaekInternational.ManhattanLittleBoy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name= "m_sequence")
    private Long memberSequence;
    @NotEmpty
    private String memberId;
    @NotEmpty
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
    private LocalDateTime memberRegisterDate;
    private String memberStatus;
    private LocalDateTime memberLastLogin;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    @OneToOne(mappedBy = "member")
    private Basket basket;

    public Member(@NotEmpty String memberId, @NotEmpty String memberPw, String memberName) {
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.memberLastLogin = LocalDateTime.now();
    }

}