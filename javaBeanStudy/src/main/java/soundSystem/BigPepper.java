package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Component
@Primary
public class BigPepper implements soundSystem.CompactDisc {
    private List<soundSystem.CompactDisc> peppers;

    @Autowired
    public BigPepper(List<soundSystem.CompactDisc> peppers) {
        this.peppers = peppers;
    }

    public void dumpPeppers() {
        for (soundSystem.CompactDisc pepper : peppers) {
            pepper.play();
        }
    }

    @Override
    public void play() {

    }
}
