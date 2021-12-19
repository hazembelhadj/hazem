package org.sid.demo1;

import org.sid.demo1.dao.ProduitRepository;
import org.sid.demo1.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository;


    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        restConfiguration.exposeIdsFor(Produit.class);

        produitRepository.save(new Produit(null,"ordinateur",6700,3));
        produitRepository.save(new Produit(null,"imprimante",1700,3));
        produitRepository.save(new Produit(null,"phone",25,3));

        produitRepository.findAll().forEach(p->{
            System.out.println(p.toString());
        });
    }
}
