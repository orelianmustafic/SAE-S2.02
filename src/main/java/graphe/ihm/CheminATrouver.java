package graphe.ihm;

import graphe.core.IGraphe;
import graphe.core.Arc;

import java.util.List;

public class CheminATrouver {
    private final String fileName;
    private final String repFileName;
    private final IGraphe g;
    private final Arc sdArc;
    private final int distanceAttendue;
    private final List<Integer> cheminPossible;

    public CheminATrouver(String fileName, String repFileName, IGraphe g, Arc sdArc, int distanceAttendue, List<Integer> cheminPossible) {
        this.fileName = fileName;
        this.repFileName = repFileName;
        this.g = g;
        this.sdArc = sdArc;
        this.distanceAttendue = distanceAttendue;
        this.cheminPossible = cheminPossible;
    }

    public String getFileName() {
        return fileName;
    }

    public String getRepFileName() {
        return repFileName;
    }

    public IGraphe getGraph() {
        return g;
    }

    public Arc getSDArc() {
        return sdArc;
    }

    public int getDistanceAttendue() {
        return distanceAttendue;
    }

    public List<Integer> getCheminPossible() {
        return cheminPossible;
    }
}
