package Lab1_2;

import java.util.ArrayList;

public class AudioCollection {
    private ArrayList<AudioTrack> tracks = new ArrayList<>();

    public void addTrack(AudioTrack track) {
        tracks.add(track);
        System.out.println("Track added: " + track);
    }

    public boolean isEmpty() { return tracks.isEmpty(); }

    public void removeTrack(String title) {
        for (int index = tracks.size() - 1; index >= 0; index--) {
            if (tracks.get(index).getTitle().equalsIgnoreCase(title)) {
                tracks.remove(index);
            }
        }
        System.out.println("Track removed: " + title);
    }

    public AudioTrack findTrack(String title) {
        for (AudioTrack track : tracks) {
            if (track.getTitle().equalsIgnoreCase(title)) {
                return track;
            }
        }
        return null;
    }

    public void displayAllTracks() {
        if (tracks.isEmpty()) {
            System.out.println("No tracks in the collection.");
        } else {
            for (AudioTrack track : tracks) {
                System.out.println(track);
            }
        }
    }
}

