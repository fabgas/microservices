package org.tutorial.commandes.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public final class Commande {

    private Long id;
    private String codeCommande;
    private String refProduit;
    private String libelleProduit;

}