package soundSystem;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    public void play() {
        String artist = "The Beatles";
        String title = "Sgt. Pepper's Lonely Hearts Club Band";
        System.out.println( "Playing " + title + " by " + artist);
    }

    public void dumpPeppers() {}
}
