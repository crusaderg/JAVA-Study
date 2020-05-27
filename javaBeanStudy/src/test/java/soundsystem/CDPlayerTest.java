package soundsystem;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = soundSystem.CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private soundSystem.CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);

        cd.dumpPeppers();

        System.out.println( cd.getClass().getName() );
    }
}
