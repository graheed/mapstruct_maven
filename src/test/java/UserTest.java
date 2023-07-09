import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    public void testUserMapping() {

        User person1 = new User( "Rahelle", "Mozene", "rmozene@gmail.com");

        UserCommand person2 = UserMapper.INSTANCE.userToUserCommand( person1 );

        UserCommand person3 = new UserCommand( "Sammy", "Soul", "soulrush55@gmail.com");

        User person4 = UserMapper.INSTANCE.userCommandToUser( person3 );

        assertThat( person2 ).isNotNull();
        assertThat( person2.getFirstName() ).isEqualTo( person1.getFirstName() );
        assertThat( person2.getLastName() ).isEqualTo( person1.getLastName() );
        assertThat( person2.getEmail() ).isEqualTo( person1.getEmail());

        assertThat( person4 ).isNotNull();
        assertThat( person4.getFirstName() ).isEqualTo( person3.getFirstName() );
        assertThat( person4.getLastName() ).isEqualTo( person3.getLastName() );
        assertThat( person4.getEmail() ).isEqualTo( person3.getEmail());
    }
}
