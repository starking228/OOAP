package Lab10;

class Unit {
    private TraversalStrategy artifact1;
    private TraversalStrategy artifact2;
    private String name;

    public Unit(String name, TraversalStrategy artifact1, TraversalStrategy artifact2) {
        this.name = name;
        this.artifact1 = artifact1;
        this.artifact2 = artifact2;
    }

    public String getName() {
        return name;
    }

    public boolean tryToTraverse(String location) {
        System.out.println(name + " trying to get through " + location + "...");

        if (artifact1.canTraverse(location)) {
            System.out.println("✅ Artifact used: " + artifact1.getArtifactName());
            return true;
        } else if (artifact2.canTraverse(location)) {
            System.out.println("✅ Artifact used: " + artifact2.getArtifactName());
            return true;
        } else {
            System.out.println("❌ There is no matching artifact for this location..");
            return false;
        }
    }
}
