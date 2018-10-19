package org.tutorial.produits.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tutorial.produits.domain.Produit;

@RestController
public final class ProduitController {

    @RequestMapping("/produit/{codeProduit}")
    Produit getProduit( @PathVariable String codeProduit) {
        return new Produit(100L, codeProduit, "Produit", 100.0);
    }
}
