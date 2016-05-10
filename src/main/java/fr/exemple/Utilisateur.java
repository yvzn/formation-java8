package fr.exemple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Utilisateur {

    private String nom;

    private String prenom;

    private Genre genre;
}





// private LocalDate dateNaissance;

// public boolean estMajeur() { ChronoUnit.YEAR... }

// public boolean estMasculin() {