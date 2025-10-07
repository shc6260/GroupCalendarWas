package calendarWas.groupCalendarWas.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MemberCreateDto {

    private String LoginId;
    private String password;
    private String name;
}
