package Lab10;

class EclipseTraversal implements TraversalStrategy {
    @Override
    public boolean canTraverse(String location) {
        return location.equalsIgnoreCase("Eclipse");
    }

    @Override
    public String getArtifactName() {
        return "Sphere of Moonlight";
    }
}
