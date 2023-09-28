package ua.com.springschool.mapper;

import org.mapstruct.Mapper;
import ua.com.springschool.entity.Group;
import ua.com.springschool.entity.Student;
import ua.com.springschool.model.GroupDTO;
import ua.com.springschool.model.StudentDTO;

@Mapper
public interface GroupMapper {

    Group groupDtoToGroup(GroupDTO groupDTO);
    GroupDTO groupToGroupDto(Group group);
}
