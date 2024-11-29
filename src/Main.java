import java.util.List;

public class Main {
    public static void main(String[] args) {
        Agence agence = new Agence("LocationPlus");

        Voiture v1 = new Voiture(1, "Toyota", 50);
        Voiture v2 = new Voiture(2, "BMW", 100);
        Voiture v3 = new Voiture(3, "Renault", 40);

        agence.ajoutVoiture(v1);
        agence.ajoutVoiture(v2);
        agence.ajoutVoiture(v3);

        Client client = new Client(101, "Nabegh", "Anane");
        agence.loueClientVoiture(client, v1);

        Critere critere = new CriterePrix(50);
        List<Voiture> voitures = agence.selectVoitureSelonCritere(critere);
        System.out.println("Voitures avec prix <= 50 : " + voitures);

        agence.afficheLesClientsEtLeursListesVoitures();
    }
}
