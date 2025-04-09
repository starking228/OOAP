package Lab10;

class ForestTraversal implements TraversalStrategy {
    @Override
    public boolean canTraverse(String location) {
        return location.equalsIgnoreCase("Forest");
    }

    @Override
    public String getArtifactName() {
        return "Amulet of the Forest Spirits";
    }
}
