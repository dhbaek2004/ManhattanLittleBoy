package BaekInternational.ManhattanLittleBoy.repository;

import BaekInternational.ManhattanLittleBoy.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    @Query("select m from Member m where email = :email and password = :password")
    public MemberRepository findMember(String email, String password) {
        return null;
    }

}
