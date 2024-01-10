import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EnsembleEquipe {
    public Set<Equipe> equipes;
    public Set<Equipe> getEquipes() { return equipes; }
    public void ajouterEquipe(Equipe e) { equipes.add(e); }
    public void supprimerEquipe(Equipe e) { equipes.remove(e); }

    /*ToDo 3*/
    public boolean rechercherEquipe(Equipe e) {
        for (Equipe equipe: equipes) {
            if (equipe.equals(e))
                return true;
        }
        return false;
    }

    /* TODO 4 : Avec une méthode de référence ou une expression lambda */
    public void afficherEquipes(){
        equipes.forEach(System.out::println);
    }

    /* TODO 5 : Avec lambda Expression ou l’api Stream */
    public Set<Equipe> trierEquipesParNom() {
        return equipes.stream().sorted(Comparator.comparing(Equipe::getNom)).collect(Collectors.toCollection(TreeSet::new));
    }



}
