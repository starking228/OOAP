package Lab1_2;

public class Main {
    public static void main(String[] args) {
        AudioCollectionProxy adminProxy = new AudioCollectionProxy(true);

        adminProxy.addTrack(new AudioTrack("Nature", "The imagine dragons", 158));
        adminProxy.addTrack(new AudioTrack("Sweater weather", "The neighbourhood", 240));

        adminProxy.displayAllTracks();

        AudioTrack foundTrack = adminProxy.findTrack("Nature");
        if (foundTrack != null) {
            System.out.println("Found track: " + foundTrack);
        } else {
            System.out.println("Track not found.");
        }

        adminProxy.removeTrack("Nature");
        adminProxy.displayAllTracks();

        AudioCollectionProxy userProxy = new AudioCollectionProxy(false);

        userProxy.addTrack(new AudioTrack("Nature", "The imagine dragons", 158));

        AudioTrack userFoundTrack = userProxy.findTrack("Nature");
        if (userFoundTrack != null) {
            System.out.println("User found track: " + userFoundTrack);
        }

        userProxy.displayAllTracks();
    }
}

