import org.mapstruct.*;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);
}

