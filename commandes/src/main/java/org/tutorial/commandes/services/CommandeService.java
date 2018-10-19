package org.tutorial.commandes.services;

import java.util.List;

import org.tutorial.commandes.domain.Commande;

public interface CommandeService {
    /**
     * Return a list of commandes
     * @return
     */
    public List<Commande> getCommandes();
}