import Enums.EstadoAnimal;
import Enums.Higiene;

public class Main {

    public static void main(String[] args) {

        PetShop petShop947 = new PetShop();
        Animal animal = new Animal();
        animal.EstadoAnimal = EstadoAnimal.SUJO;

        System.out.println("O animal está " + EstadoAnimal.SUJO);

        petShop947.higienizacao(animal, Higiene.BANHO_E_TOSA, null);

        System.out.println("Agora o anima está " + animal.EstadoAnimal.);

    }

}
