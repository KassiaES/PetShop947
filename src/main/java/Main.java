import Dados.Clientes;
import Enums.EstadoAnimal;
import Enums.Higiene;
import Enums.Porte;
import Models.Animal;
import Models.Cachorro;
import Models.EsquemaVacinal;
import Models.Gato;
import VO.ResponseVO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<EsquemaVacinal> esquemaVacinalList = new ArrayList<EsquemaVacinal>();
        List<Animal> pets = new ArrayList<Animal>();
        Animal animal = new Animal(){};

        //Crie o objeto Petshop
        PetShop petShop947 = new PetShop();

        //Crie no mínimo dois clientes, com pelo menos um deles tendo mais do que um pet
        Gato goiaba = new Gato("Goiaba", "03/12/2020", "persa", Porte.PEQUENO, 2.5, "doente", EstadoAnimal.LIMPO, esquemaVacinalList);
        Cachorro kiko = new Cachorro("Kiko","5/5/2017", "pug", Porte.PEQUENO, 2.5, "normal", EstadoAnimal.SUJO, esquemaVacinalList);
        Cachorro zeus = new Cachorro("Zeus","25/12/2021", "golden", Porte.GRANDE, 5, "normal", EstadoAnimal.SUJO, esquemaVacinalList);
        Clientes cliente1 = new Clientes();
        cliente1.setNome("Alexandre");
        cliente1.setId(3);
        cliente1.pets.add(kiko);

        Clientes cliente2 = new Clientes("Luciana", 7, pets);
        System.out.println(goiaba);



        //Valide se o retorno do metodo atendimentoClinico possui o id do serviço, o serviço prestado, o valor e valide principalmente, se há no campo observação do animal, o pedido do médico para a vacina
        kiko.setObservacoes("Doente");
        System.out.println(petShop947.atendimentoClinico(cliente1,pets, kiko.getObservacoes()));
        ResponseVO atendimentoClinico = petShop947.atendimentoClinico(cliente1,pets,kiko.getObservacoes());
        atendimentoClinico.toString();
        System.out.println(cliente1.getNome());


        //Chame o metodo vacinação do pet shop, e faça o pet tomar a vacina pedido no retorno do atendimentoClinico
        System.out.println(kiko.getObservacoes());
        ResponseVO vacinacao = petShop947.vacinacao(cliente1,pets,esquemaVacinalList, kiko.getObservacoes());
        vacinacao.toString();
        System.out.println(cliente1.getNome());


        //Valide se o retorno do metodo vacinação possui o esquemaVacinal do pet preenchido com o vacina que foi pedida, o id, o serviço prestado e o valor


        //Chame o metodo higienizar do petshop, e faça-o retornar no campo estado do animal, um valor referente ao serviço prestado ex: se chamou o metodo apenas pedindo para dar banho, o animal deverá estar limpo no retorno do metodo


        //Valide se o retorno do metodo higienizar possui id, serviço, preço e se o estado do animal está equivalente ao serviço pedido

        //Chame os métodos verRemedio e verAlimentos

        //Por último, passe para o metodo pagamentos, a lista de todos os ids do serviços utilizados mais pelo menos 1 remédio e 1 alimento e valide se a soma dos valores do pedido do cliente está correta


        System.out.println("O animal está " + Animal.estadoAnimal.SUJO);

        //petShop947.higienizar(animal, Higiene.BANHO_E_TOSA, null);

        System.out.println("Agora o animal está " + EstadoAnimal.LIMPO_E_TOSADO);

    }

    public void verAlimentos() {

    }

    public void verRemedios() {

    }

    public void pagamentos(List<Integer> itens) {

    }


}
