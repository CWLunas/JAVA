import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Museum {
    public static void main(String[] args) {
        List<Art> museum = new ArrayList<>();

        Painting painting1 = new Painting("The Last Supper", "Leonardo da Vinci", "A depiction of Jesus and his disciples", "Tempera");
        Painting painting2 = new Painting("The Birth of Venus", "Sandro Botticelli", "A depiction of the goddess Venus emerging from the sea", "Tempera");
        Painting painting3 = new Painting("The Creation of Adam", "Michelangelo", "A fresco painting depicting the Biblical creation of Adam", "Fresco");

        Sculpture sculpture1 = new Sculpture("The Burghers of Calais", "Auguste Rodin", "A sculpture representing the six burghers of Calais", "Bronze");
        Sculpture sculpture2 = new Sculpture("The Kiss", "Auguste Rodin", "A marble sculpture of a couple embracing", "Marble");

        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);

        Collections.shuffle(museum);

        for (Art artwork : museum) {
            artwork.viewArt();
        }
    }
}