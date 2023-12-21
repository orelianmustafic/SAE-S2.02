package graphe.algos;

import graphe.core.*;

import java.util.*;

public class Dijkstra {
    public static void dijkstra(IGrapheConst g, String source, Map<String, Integer> dist, Map<String, String> prev) {
        Set<String> noeudsDecouverts = new HashSet<>();
        PriorityQueue<Noeud> pq = new PriorityQueue<>(new SommetComparator());

        dist.put(source, 0);
        pq.add(new Noeud(source, 0));
        int tailleGraphe = g.getSommets().size();

        while (noeudsDecouverts.size() != tailleGraphe) {
            if (pq.isEmpty()) return;

            Noeud u = pq.remove();
            noeudsDecouverts.add(u.nom());

            for (String noeud : g.getSucc(u.nom())) {
                if (!noeudsDecouverts.contains(noeud)) {
                    int distanceArc = g.getValuation(u.nom(), noeud);
                    int distance = distanceArc + u.valuation();

                    if (distance < dist.get(noeud) ) {
                        dist.putIfAbsent(noeud, distance);
                        prev.put(noeud, u.nom());
                    }
                    pq.add(new Noeud(noeud, distance));
                }
            }
        }
    }
}

class SommetComparator implements Comparator<Noeud> {
    public int compare(Noeud s1, Noeud s2) {
        if (s1.valuation() > s2.valuation()) return 1;
        else if (s1.valuation() < s2.valuation()) return -1;
        return 0;
    }
}

record Noeud(String nom, int valuation) { }