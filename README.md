# Gestion d’une Agence de Location de Voitures

Ce projet consiste à développer une solution de gestion pour une agence de location de voitures. Les principales classes du programme sont :

## Classes Principales

### 1. Classe `Voiture`
- **Attributs** :
  - `immatriculation` : Identifiant unique de la voiture.
  - `marque` : Marque de la voiture.
  - `prixLocation` : Prix de location de la voiture.
- **Caractéristiques** :
  - Deux voitures sont égales si elles ont la même `immatriculation` et la même `marque`.
- **Tâches** :
  - Compléter la classe `Voiture`.

---

### 2. Classe `Client`
- **Attributs** :
  - `code` : Identifiant unique du client.
  - `nom` : Nom du client.
  - `prenom` : Prénom du client.
- **Caractéristiques** :
  - Deux clients sont égaux s’ils ont le même `code`.
- **Tâches** :
  - Compléter la classe `Client`.

---

### 3. Classe `ListVoitures`
- **Description** :
  - Stocke un ensemble de voitures dans une liste.
- **Fonctionnalités** :
  - Ajouter une voiture.
  - Supprimer une voiture.
  - Afficher la liste des voitures.
- **Tâches** :
  - Compléter la classe `ListVoitures`.

---

### 4. Interface `Critere`
- **Description** :
  - Permet de sélectionner les voitures répondant à un critère donné.
- **Méthode** :
  - `boolean estSatisfaitPar(Voiture v)`.
- **Tâches** :
  - Compléter la classe `CritereMarque` pour la sélection par marque.
  - Compléter la classe `CriterePrix` pour la sélection par prix.

---

### 5. Classe `Agence`
- **Attributs** :
  - `nom` : Nom de l’agence.
  - `parking` : Liste des voitures disponibles (`ListVoitures`).
  - `ClientVoitureLoue` : Map associant un client (`Client`) à sa liste de voitures louées (`ListVoitures`).
- **Fonctionnalités** :
  - Louer une voiture à un client.
  - Retourner une voiture louée.
  - Obtenir les voitures selon un critère donné.
  - Récupérer les clients ayant loué une ou plusieurs voitures.
  - Afficher les clients et leurs voitures louées.
  - Trier les clients par code ou par nom.
- **Tâches** :
  - Compléter la classe `Agence`.
  - Implémenter les méthodes de tri.

---

## Fonctionnalités à Implémenter

1. **Gestion des voitures** :
   - Ajout et suppression de voitures.
   - Affichage des voitures disponibles.

2. **Critères de sélection** :
   - Par marque.
   - Par prix.

3. **Gestion des clients** :
   - Louer et retourner des voitures.
   - Afficher les clients et leurs voitures.

4. **Tri des clients** :
   - Par code croissant.
   - Par nom croissant.

---

## Exemple de Classes Incomplètes

### Classe `Voiture`
```java
public class Voiture {
    private int immatriculation;
    private String marque;
    private float prixLocation;

    public Voiture(int immatriculation, String marque, float prixLocation) {
        // À compléter
    }

    public int getImmatriculation() { return immatriculation; }
    public void setImmatriculation(int immatriculation) { this.immatriculation = immatriculation; }
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public float getPrixLocation() { return prixLocation; }
    public void setPrixLocation(float prixLocation) { this.prixLocation = prixLocation; }

    public int hashCode() { /* À compléter */ }
    public boolean equals(Object obj) { /* À compléter */ }
    public String toString() { /* À compléter */ }
}
```

### Classe `Client`
```java
public class Client {
    private int code;
    private String nom;
    private String prenom;

    public Client(int code, String nom, String prenom) {
        // À compléter
    }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public int hashCode() { /* À compléter */ }
    public boolean equals(Object obj) { /* À compléter */ }
    public String toString() { /* À compléter */ }
}
```

### Classe `CritereMarque`
```java
public class CritereMarque implements Critere {
    private String marque;

    public CritereMarque(String marque) {
        this.marque = marque;
    }

    public boolean estSatisfaitPar(Voiture v) {
        // À compléter
    }
}
```


## Remarque

- Des codes partiels sont disponibles pour guider l'implémentation.
- Si d'autres classes sont nécessaires, elles peuvent être ajoutées.
