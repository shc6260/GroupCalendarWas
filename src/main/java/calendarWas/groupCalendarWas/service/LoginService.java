package calendarWas.groupCalendarWas.service;

import calendarWas.groupCalendarWas.domain.Member;
import calendarWas.groupCalendarWas.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    /**
     * @return null 로그인 실패
     */
    public Member login(String loginId, String password) {
        return memberRepository.findOneByLoginId(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
