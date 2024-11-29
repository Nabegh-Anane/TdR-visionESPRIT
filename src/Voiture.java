public class Voiture {
    private int immatriculation;
    private String marque;
    private float prixLocation;

    public Voiture(int immatriculation, String marque, float prixLocation) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.prixLocation = prixLocation;
    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(float prixLocation) {
        this.prixLocation = prixLocation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Voiture voiture = (Voiture) obj;
        return immatriculation == voiture.immatriculation && marque.equals(voiture.marque);
    }

    @Override
    public int hashCode() {
        return immatriculation + marque.hashCode();
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "immatriculation=" + immatriculation +
                ", marque='" + marque + '\'' +
                ", prixLocation=" + prixLocation +
                '}';
    }
}
