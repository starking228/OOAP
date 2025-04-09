package Lab9;

import java.util.ArrayList;
import java.util.List;

// Ведучий
class Auction implements Auctioneer {
    private List<Observer> observers = new ArrayList<>();
    private int highestBid = 0;
    private Participant highestBidder = null;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void placeBid(Participant participant, int bidAmount) {
        if (bidAmount > highestBid) {
            highestBid = bidAmount;
            highestBidder = participant;
            notifyObservers("New bid: " + bidAmount + " from " + participant.getName());
        } else {
            participant.update("Your bet must be greater than the current maximum.");
        }
    }
}
