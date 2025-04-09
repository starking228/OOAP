package Lab10;

// === Інтерфейс стратегії ===
interface TraversalStrategy {
    boolean canTraverse(String location);

    String getArtifactName();
}
