import java.util.ArrayList;
import java.util.List;

public class MockSongs {

    public static List<SongV2> getSongStrings(){

        List<SongV2> songs = new ArrayList<SongV2>();

        songs.add(new SongV2("somersualt", "zero 7", 147));
        songs.add(new SongV2("cassidyt", " grateful dead", 158));
        songs.add(new SongV2("$10", "hitchhiker", 140));

        songs.add(new SongV2("havana", "cabello", 105));
        songs.add(new SongV2("cassidy", "grateful dead", 158));
        songs.add(new SongV2("50 ways", "simon", 102));

        return songs;
    }
}