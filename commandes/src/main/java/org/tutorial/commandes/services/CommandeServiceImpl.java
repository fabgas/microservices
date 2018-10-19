package org.tutorial.commandes.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.tutorial.commandes.domain.Commande;
import org.tutorial.commandes.domain.Produit;

@Service
public class CommandeServiceImpl implements CommandeService {
   
    private final RestTemplate restTemplate;
    
    private String produitHost;
    @Autowired
    public CommandeServiceImpl(final RestTemplate restTemplate,@Value("${produitHost}") final String produitHost) {
        this.restTemplate = restTemplate;
        this.produitHost = produitHost;
    }

    public List<Commande> getCommandes() {
     List<Commande> commandes = Arrays.asList(new Commande(1L,"100101","100",null),
                                              new Commande(2L,"100101","1210",null)); 
      
     // need to complete commande with the field libelleProduit of produit.
     commandes.stream().forEach(commande -> {
         Produit produit = restTemplate.getForObject(produitHost+"/produit/"+commande.getRefProduit(), Produit.class);
        commande.setLibelleProduit(produit.getLibelleProduit());
        });
     return commandes;
    }
}