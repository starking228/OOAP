package Lab9;

// Аукціон
public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();

        Participant p1 = new Participant("Antonio");
        Participant p2 = new Participant("Kate");
        Participant p3 = new Participant("Ihor");

        auction.addObserver(p1);
        auction.addObserver(p2);
        auction.addObserver(p3);

        auction.placeBid(p1, 100);
        auction.placeBid(p2, 200);
        auction.placeBid(p3, 150);
        auction.placeBid(p1, 250);
    }
}
