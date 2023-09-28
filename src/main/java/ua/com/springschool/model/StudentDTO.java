package ua.com.springschool.model;

import lombok.Builder;
import lombok.Data;


import java.util.Set;
import java.util.UUID;

@Data
@Builder
public class StudentDTO {

    private UUID id;
    private String name;
    private UUID groupId;
    private Set<UUID> courseIds;
}
