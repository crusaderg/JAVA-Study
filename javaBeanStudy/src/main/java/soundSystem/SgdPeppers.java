package soundSystem;
import org.springframework.stereotype.Component;

@Component
public class SgdPeppers implements CompactDisc {

    public void play() {
        String artist = "The Beatles";
        String title = "Sgd. Pepper's Lonely Hearts Club Band";
        System.out.println( "Playing " + title + " by " + artist);
    }

    public void dumpPeppers() {}
}
