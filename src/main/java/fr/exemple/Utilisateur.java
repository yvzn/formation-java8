package fr.exemple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {

    private String nom;

    private String prenom;

    private Genre genre;

    private LocalDate dateNaissance;

    public boolean estMajeur() {
        return false; //ChronoUnit.YEARS...
    }

    public boolean estMasculin() {
        return false;
    }

    public String toDebugString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", genre=" + genre +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}


