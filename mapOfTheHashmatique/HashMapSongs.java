import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapSongs {
    private Map<String, String> songMap;

    public HashMapSongs() {
        songMap = new HashMap<>();
    }

    public void addSong(String title, String lyrics) {
        songMap.put(title, lyrics);
    }

    public Map.Entry<String, String> getRandomSong(Random random) {
        int randomIndex = random.nextInt(songMap.size());
        return (Map.Entry<String, String>) songMap.entrySet().toArray()[randomIndex];
    }

    public void printAllSongs() {
        for (Map.Entry<String, String> entry : songMap.entrySet()) {
            System.out.println("Track: " + entry.getKey());
            System.out.println("Lyrics: " + entry.getValue());
            System.out.println();
        }
    }
}