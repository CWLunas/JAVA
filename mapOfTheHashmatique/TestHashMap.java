import java.util.Map;
import java.util.Random;

public class TestHashMap {
    public static void main(String[] args) {
        HashMapSongs hashMapSongs = new HashMapSongs();

        // Adding Led Zeppelin songs
        hashMapSongs.addSong("Stairway to Heaven", "There's a lady who's sure all that glitters is gold");
        hashMapSongs.addSong("Kashmir", "Oh, let the sun beat down upon my face");
        hashMapSongs.addSong("Black Dog", "Hey, hey mama, said the way you move");
        hashMapSongs.addSong("Whole Lotta Love", "You need coolin', baby, I'm not foolin'");
        hashMapSongs.addSong("Rock and Roll", "It's been a long time since I rock and rolled");
        hashMapSongs.addSong("Dazed and Confused", "Been dazed and confused for so long, it's not true");
        hashMapSongs.addSong("Immigrant Song", "Ah, ah");
        hashMapSongs.addSong("Ramble On", "Leaves are falling all around, time I was on my way");
        hashMapSongs.addSong("Good Times Bad Times", "In the days of my youth, I was told what it means to be a man");
        hashMapSongs.addSong("When the Levee Breaks", "If it keeps on rainin', levee's goin' to break");

        // Print all track names and lyrics
        hashMapSongs.printAllSongs();
        
        // Randomly select a song
        Random random = new Random();
        Map.Entry<String, String> randomSong = hashMapSongs.getRandomSong(random);
        
        System.out.println("\nRandomly selected song: " + randomSong.getKey());
        System.out.println("Lyrics: " + randomSong.getValue());
    }
}