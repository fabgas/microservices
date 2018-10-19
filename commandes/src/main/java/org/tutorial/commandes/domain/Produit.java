package org.tutorial.commandes.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe entity des produits
 */
@Getter
@Setter
@AllArgsConstructor
public final class Produit{

    private Long id;
    private String codeProduit;
    private String libelleProduit;
    private Double poids;

}