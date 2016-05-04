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

    public boolean estMasculin() {
        return Genre.MASCULIN.equals(genre);
    }
}





// private LocalDate dateNaissance;

// boolean estMajeur() { ChronoUnit.YEAR... }
