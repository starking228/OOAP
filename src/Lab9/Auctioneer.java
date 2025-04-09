package Lab9;

// Інтерфейс ведучого
interface Auctioneer {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);

    void placeBid(Participant participant, int bidAmount);
}
