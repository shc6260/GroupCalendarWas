package calendarWas.groupCalendarWas.service;

import calendarWas.groupCalendarWas.domain.Member;
import calendarWas.groupCalendarWas.dto.MemberCreateDto;
import calendarWas.groupCalendarWas.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long createMember(MemberCreateDto member) {
        validateCreateMember(member);
        return memberRepository.save(Member.createMemberByCreate(member)).getId();
    }

    private void validateCreateMember(MemberCreateDto member) {
        var findMember = memberRepository.findOneByLoginId(member.getLoginId());
        if (findMember.isEmpty())
            return;

        throw new IllegalStateException("이미 존재하는 회원입니다.");
    }
}
