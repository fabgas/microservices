package org.tutorial.commandes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tutorial.commandes.domain.Commande;
import org.tutorial.commandes.services.CommandeService;

@RestController
public final class CommandesController {

    @Autowired
    private  CommandeService commandeService;

    @RequestMapping("/commandes")
    public List<Commande>  getCommandes() {
        return commandeService.getCommandes();
    }
}