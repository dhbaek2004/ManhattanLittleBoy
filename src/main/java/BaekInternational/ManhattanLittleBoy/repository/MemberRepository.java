package BaekInternational.ManhattanLittleBoy.repository;

import BaekInternational.ManhattanLittleBoy.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    @Query("select m from Member m where memberId = :memberId and memberPw = :memberPw")
    public Member findMember(String memberId, String memberPw) {
        return null;
    }

}
