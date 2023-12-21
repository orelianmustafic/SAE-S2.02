package graphe.core;//

public class Arc {

    private final String noeudSource;
    private final String noeudDestination;
    private final int valeur;

    public Arc(String s, String d, int v){
        this.noeudSource = s;
        this.noeudDestination = d;
        this.valeur = v;
    }

    public String getSource() {
        return noeudSource;
    }

    public String getDestination() {
        return noeudDestination;
    }

    public int getValuation() {
        return valeur;
    }

    public boolean equals(Arc a){
        return a.noeudSource.equals(this.noeudSource) && a.noeudDestination.equals(this.noeudDestination);

    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(noeudSource);
        if(valeur == -1){
            s.append(":");
        }
        else
            s.append("-").append(noeudDestination).append("(").append(valeur).append(")");
        s.append(", ");
        return s.toString();
    }
}
