package fr.exemple;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Repertoire {

    private List<Utilisateur> utilisateurs = new ArrayList<>();
}

// public Optional<Utilisateur> rechercherParNom(String nom) {
//  for (Utilisateur utilisateur : utilisateurs)

// public Optional<Utilisateur> rechercherDansListe(List<Utilisateur> liste, Recherche filtre) {

// repertoire.getUtilisateurs().stream().map(Utilisateur::getNom).collect(Collectors.joining(", "));

// repertoire.getUtilisateurs().stream().collect(Collectors.groupingBy(utilisateur -> utilisateur.getDateNaissance().getYear()));
