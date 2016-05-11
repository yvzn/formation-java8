package fr.exemple;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class Repertoire {

    private List<Utilisateur> utilisateurs = new ArrayList<>();

    public Optional<Utilisateur> rechercherParNom(String nom) {
        return null;
    }

    public Optional<Utilisateur> rechercherParPrenom(String prenom) {
        return null;
    }

    public Optional<Utilisateur> rechercherMajeurs() {
        return null;
    }

    public Optional<Utilisateur> rechercherNeAvant1985() {
        return null;
    }

    public boolean estNeAvant1985(Utilisateur utilisateur) {
        return utilisateur.getDateNaissance().getYear() < 1985;
    }

    public static Optional<Utilisateur> rechercherDansListe(List<Utilisateur> liste, FiltreRecherche filtre) {
        return null;
    }

    public Map<Integer, List<Utilisateur>> utilisateursParAnneeDeNaissance() {
        return null;
    }

    public void afficherUilisateurs() {
        utilisateurs.stream()
                .sorted(Comparator.comparing(Utilisateur::getDateNaissance))
                .forEach(
                        utilisateur -> System.out.println(utilisateur.toDebugString())
                );
    }
}

// repertoire.getUtilisateurs().stream().map(Utilisateur::getNom).collect(Collectors.joining(", "));

// repertoire.getUtilisateurs().stream().collect(Collectors.groupingBy(utilisateur -> utilisateur.getDateNaissance().getYear()));
