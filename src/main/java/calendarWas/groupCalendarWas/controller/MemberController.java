package calendarWas.groupCalendarWas.controller;

import calendarWas.groupCalendarWas.dto.MemberCreateDto;
import calendarWas.groupCalendarWas.dto.MemberResponseDto;
import calendarWas.groupCalendarWas.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/add")
    public MemberResponseDto addMember(@RequestBody MemberCreateDto data) {
        var id = memberService.createMember(data);
        return new MemberResponseDto(id, data.getLoginId(), data.getPassword(), data.getName());
    }
}
