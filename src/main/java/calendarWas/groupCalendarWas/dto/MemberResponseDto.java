package calendarWas.groupCalendarWas.dto;

import lombok.Data;

@Data
public class MemberResponseDto {

    private Long id;
    private String loginId;
    private String password;
    private String name;

    public MemberResponseDto(Long id, String loginId, String password, String name) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
    }
}