package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
         Voiture voiture = new Voiture("Ford", 18_000);
         assertAll(
                 () -> assertEquals(18_000, voiture.getPrix(), "Le prix doit être 18 000"),
                 () -> assertEquals("Ford", voiture.getMarque(), "La marque doit être Ford")
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
         Voiture voiture = new Voiture("Hyundai", 21_500);
         voiture.setId(88);
         assertAll(
                 () -> assertEquals(88, voiture.getId(), "L'id doit être 88"),
                 () -> assertEquals(21_500, voiture.getPrix(), "Le prix doit être 21 500"),
                 () -> assertEquals("Hyundai", voiture.getMarque(), "La marque doit être Hyundai")
         );
    }

    @Test
    void testGetSetMarque(){
         Voiture voiture = new Voiture("Kia", 16_000);
         voiture.setMarque("Mazda");
         assertAll(
                 () -> assertEquals(16_000, voiture.getPrix(), "Le prix doit être 16 000"),
                 () -> assertEquals("Mazda", voiture.getMarque(), "La marque doit être Mazda")
         );
    }

    @Test
    void testGetSetPrix(){
         Voiture voiture = new Voiture("Volvo", 45_000);
         voiture.setPrix(39_000);
         assertAll(
                 () -> assertEquals(39_000, voiture.getPrix(), "Le prix doit être 39 000"),
                 () -> assertEquals("Volvo", voiture.getMarque(), "La marque doit être Volvo")
         );
    }

    @Test
    void testToString(){
         Voiture voiture = new Voiture("Nissan", 27_300);
         voiture.setId(19);
         String expected = "Car{marque='Nissan', prix=27300, id=19}";
         assertEquals(expected, voiture.toString(), "La méthode toString doit retourner la chaîne attendue");
    }

}

