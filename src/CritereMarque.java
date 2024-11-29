public class CritereMarque implements Critere {
    private String marque;

    public CritereMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public boolean estSatisfaitPar(Voiture v) {
        return v.getMarque().equalsIgnoreCase(marque);
    }
}
