import java.util.*;

public class Agence {
    private String nom;
    private ListVoitures parking;
    private Map<Client, ListVoitures> ClientVoitureLoue;

    public Agence(String nom) {
        this.nom = nom;
        this.parking = new ListVoitures();
        this.ClientVoitureLoue = new HashMap<>();
    }

    public void ajoutVoiture(Voiture v) {
        parking.ajoutVoiture(v);
    }

    public void suppVoiture(Voiture v) {
        parking.supprimeVoiture(v);
    }

    public void loueClientVoiture(Client cl, Voiture v) {
        parking.supprimeVoiture(v);
        ClientVoitureLoue.putIfAbsent(cl, new ListVoitures());
        ClientVoitureLoue.get(cl).ajoutVoiture(v);
    }

    public void retourClientVoiture(Client cl, Voiture v) {
        if (ClientVoitureLoue.containsKey(cl)) {
            ClientVoitureLoue.get(cl).supprimeVoiture(v);
            parking.ajoutVoiture(v);
        }
    }

    public List<Voiture> selectVoitureSelonCritere(Critere c) {
        List<Voiture> resultats = new ArrayList<>();
        for (Voiture v : parking.getVoitures()) {
            if (c.estSatisfaitPar(v)) {
                resultats.add(v);
            }
        }
        return resultats;
    }

    public void afficheLesClientsEtLeursListesVoitures() {
        for (Map.Entry<Client, ListVoitures> entry : ClientVoitureLoue.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().getVoitures());
        }
    }
}
