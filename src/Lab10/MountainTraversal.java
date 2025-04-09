package Lab10;

class MountainTraversal implements TraversalStrategy {
    @Override
    public boolean canTraverse(String location) {
        return location.equalsIgnoreCase("mountains");
    }

    @Override
    public String getArtifactName() {
        return "Heart of Stone Crystal";
    }
}
