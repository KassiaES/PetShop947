import Dados.Clientes;
import Enums.EstadoAnimal;
import Enums.Higiene;
import Enums.Porte;
import Models.Animal;
import Models.EsquemaVacinal;
import Models.Gato;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PetShop petShop947 = new PetShop();
        List<EsquemaVacinal> esquemaVacinalList = new ArrayList<EsquemaVacinal>();
        List<Animal> pets = new ArrayList<Animal>();
        Animal animal = new Animal(){};


        Gato cliente1 = new Gato("Goiaba", 03-03-2020, "persa", Porte.PEQUENO, 2.5, "doente", EstadoAnimal.LIMPO, esquemaVacinalList, 1, pets);



        System.out.println("O animal está " + Animal.estadoAnimal.SUJO);

        petShop947.higienizar(animal, Higiene.BANHO_E_TOSA, null);

        System.out.println("Agora o animal está " + EstadoAnimal.LIMPO_E_TOSADO);

    }

    public void verAlimentos() {

    }

    public void verRemedios() {

    }


}
