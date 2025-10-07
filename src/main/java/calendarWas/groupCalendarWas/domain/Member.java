package calendarWas.groupCalendarWas.domain;

import calendarWas.groupCalendarWas.dto.MemberCreateDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false)
    private String loginId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;



    public static Member createMemberByCreate(MemberCreateDto data){
        var member = new Member();
        member.setLoginId(data.getLoginId());
        member.setPassword(data.getPassword());
        member.setName(data.getName());

        return member;
    }
}
