import java.util.ArrayList;
import java.util.List;

public class ListVoitures {
    private List<Voiture> voitures;

    public ListVoitures() {
        this.voitures = new ArrayList<>();
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void ajoutVoiture(Voiture v) {
        voitures.add(v);
    }

    public void supprimeVoiture(Voiture v) {
        voitures.remove(v);
    }

    public void affiche() {
        for (Voiture v : voitures) {
            System.out.println(v);
        }
    }
}
