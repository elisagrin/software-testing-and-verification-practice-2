import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.AllFunc;
import ru.Post;
import ru.Service;
import ru.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



    @ExtendWith(MockitoExtension.class)
    public class ServiceTest {
        @Captor
        ArgumentCaptor<Post> captor;
        @Captor
        ArgumentCaptor<User> captor1;
        @Mock
        Service s;
        @Test
        void createpost(){
            Post post = new Post("Weather", LocalDate.now());
            s.createpost(post);
            Mockito.verify(s).createpost(captor.capture());
            Post captured = captor.getValue();
            assertEquals("Weather", captured.getText());
        }

        @Test
        void createuser(){
            User user = new User("Elizaveta", "Grinenko", "Andreevna", "21.09.2001") ;
            s.createuser(user);
            Mockito.verify(s).createuser(captor1.capture());
            User captured = captor1.getValue();
            assertEquals("Elizaveta", captured.getFirstName());
        }


        @Test
        void out(){
            User user = new User("Elizaveta", "Grinenko", "Andreevna", "21.09.2001");
            Post post = new Post ("Weather", LocalDate.now());
            s.createuser(user);
            s.createpost(post);
            Mockito.when(s.out()).thenReturn(List.of((user), post));
            assertEquals(2, s.out().size());
        }

        @Test
        void del(){
            List<AllFunc> list = new ArrayList<AllFunc>();
            User user = new User("Elizaveta", "Grinenko", "Andreevna", "21.09.2001");
            s.createuser(user);
            s.del();
            assertEquals(list, s.out());
        }
    }


