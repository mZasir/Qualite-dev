package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
         Voiture voiture = new Voiture("Audi", 50_000);
         assertAll(
                 () -> assertEquals(50_000, voiture.getPrix(), "Le prix doit être 50 000"),
                 () -> assertEquals("Audi", voiture.getMarque(), "La marque doit être Audi")
         );
    }

    @Test
    void creerVoitureVide() {
            Voiture voiture = new Voiture();
            assertAll(
                    () -> assertEquals(0, voiture.getPrix(), "Le prix doit être 0"),
                    () -> assertNull(voiture.getMarque(), "La marque doit être null")
            );
    }

    @Test
    void testGetSetId(){
         Voiture voiture = new Voiture("BMW", 75_000);
         voiture.setId(42);
         assertAll(
                 () -> assertEquals(42, voiture.getId(), "L'id doit être 42"),
                 () -> assertEquals(75_000, voiture.getPrix(), "Le prix doit être 75 000"),
                 () -> assertEquals("BMW", voiture.getMarque(), "La marque doit être BMW")
         );
    }

    @Test
    void testGetSetMarque(){
         Voiture voiture = new Voiture("Peugeot", 30_000);
         voiture.setMarque("Renault");
         assertAll(
                 () -> assertEquals(30_000, voiture.getPrix(), "Le prix doit être 30 000"),
                 () -> assertEquals("Renault", voiture.getMarque(), "La marque doit être Renault")
         );
    }

    @Test
    void testGetSetPrix(){
         Voiture voiture = new Voiture("Tesla", 120_000);
         voiture.setPrix(90_000);
         assertAll(
                 () -> assertEquals(90_000, voiture.getPrix(), "Le prix doit être 90 000"),
                 () -> assertEquals("Tesla", voiture.getMarque(), "La marque doit être Tesla")
         );
    }

    @Test
    void testToString(){
         Voiture voiture = new Voiture("Citroën", 22_500);
         voiture.setId(7);
         String expected = "Car{marque='Citroën', prix=22500, id=7}";
         assertEquals(expected, voiture.toString(), "La méthode toString doit retourner la chaîne attendue");
    }

}

