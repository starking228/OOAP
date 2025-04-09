package Lab10;

class RiverTraversal implements TraversalStrategy {
    @Override
    public boolean canTraverse(String location) {
        return location.equalsIgnoreCase("river");
    }

    @Override
    public String getArtifactName() {
        return "Ring of the Water Stream";
    }
}
