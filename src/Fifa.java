import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fifa {
    private Map<Competition, EnsembleEquipe> mapFifa;
    public Fifa() {
        mapFifa = new HashMap<>();
    }
    public void ajouterCompetition(Competition c) {
        mapFifa.put(c, new EnsembleEquipe());
    }
    public void ajouterEquipe(Competition c, Equipe e) {
        mapFifa.get(c).ajouterEquipe(e);
    }
    public void afficherFifa() {
        mapFifa.forEach((competition, ensembleEquipe) -> System.out.println("Competition: " + competition + ", EnsembleEquipe: " + ensembleEquipe));
    }
    public List<Equipe> retournerEquipesParPays(String nom) {
        return mapFifa.values().stream()
                .flatMap(ensembleEquipe -> ensembleEquipe.getEquipes().stream())
                .filter(equipe -> equipe.getPays().equals(nom))
                .collect(Collectors.toList());
    }

}


