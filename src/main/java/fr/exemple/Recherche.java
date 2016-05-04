package fr.exemple;

import java.util.Optional;

@FunctionalInterface
public interface Recherche {
    boolean tester(Utilisateur utilisateur);
}
