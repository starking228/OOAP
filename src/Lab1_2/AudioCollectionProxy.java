package Lab1_2;

public class AudioCollectionProxy {
    private AudioCollection realCollection;
    private boolean isAdmin;

    public AudioCollectionProxy(boolean isAdmin) {
        this.realCollection = new AudioCollection();
        this.isAdmin = isAdmin;
    }

    public void addTrack(AudioTrack track) {
        if (isAdmin) {
            realCollection.addTrack(track);
        } else {
            System.out.println("You don't have permission to add tracks.");
        }
    }

    public void removeTrack(String title) {
        if (isAdmin) {
            realCollection.removeTrack(title);
        } else {
            System.out.println("You don't have permission to remove tracks.");
        }
    }

    public AudioTrack findTrack(String title) {
        return realCollection.findTrack(title);
    }

    public void displayAllTracks() {
        realCollection.displayAllTracks();
    }
}

