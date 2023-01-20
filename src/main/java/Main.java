import Enums.Servicos;
import Models.Clientes;
import Enums.EstadoAnimal;
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

        //Crie o objeto Petshop
        PetShop petShop947 = new PetShop();

        //Crie no mínimo dois clientes, com pelo menos um deles tendo mais do que um pet
        // primeiro pet
        Cachorro zeus = new Cachorro("Zeus","25/12/2021", "golden", Porte.GRANDE, 5, "normal", EstadoAnimal.SUJO, esquemaVacinalList);
        zeus.setNome("Zeus");
        zeus.setNascimento("25/12/2021");
        zeus.setRaca("golden");
        zeus.setPorte(Porte.GRANDE);
        zeus.setPeso(6.0);
        zeus.setObservacoes("DOENTE com alergia");
        zeus.setEstadoAnimal(EstadoAnimal.SUJO);
        zeus.setVacinas(esquemaVacinalList);

        //primeiro cliente
        Clientes cliente1 = new Clientes();
        cliente1.setNome("Luciana");
        cliente1.setId(1);
        cliente1.pets.add(zeus);

        //segundo pet
        Cachorro kiko = new Cachorro("Kiko","5/5/2017", "pug", Porte.PEQUENO, 2.5, "normal", EstadoAnimal.SUJO, esquemaVacinalList);
        kiko.setNome("Kiko");
        kiko.setNascimento("5/5/2017");
        kiko.setRaca("pug");
        kiko.setPorte(Porte.MEDIO);
        kiko.setPeso(3.5);
        kiko.setObservacoes("DOENTE - com infecção na urina");
        kiko.setEstadoAnimal(EstadoAnimal.SUJO);
        kiko.setVacinas(esquemaVacinalList);

        //terceiro pet
        Gato goiaba = new Gato("Goiaba", "03/12/2020", "persa", Porte.PEQUENO, 2.5, "doente", EstadoAnimal.LIMPO, esquemaVacinalList);
        goiaba.setNome("Goiaba");
        goiaba.setNascimento("03-12-2020");
        goiaba.setRaca("persa");
        goiaba.setPorte(Porte.PEQUENO);
        goiaba.setPeso(2.5);
        goiaba.setObservacoes("DOENTE");
        goiaba.setEstadoAnimal(EstadoAnimal.LIMPO);
        goiaba.setVacinas(esquemaVacinalList);

        //segundo cliente
        Clientes cliente2 = new Clientes();
        cliente2.setNome("Alexandre");
        cliente2.setId(2);
        cliente2.pets.add(kiko);
        cliente2.pets.add(goiaba);

        //Valide se o retorno do metodo atendimentoClinico possui o id do serviço, o serviço prestado, o valor e valide principalmente, se há no campo observação do animal, o pedido do médico para a vacina
        ResponseVO atendimentoClinico = petShop947.atendimentoClinico(cliente1, cliente1.pets, zeus.getObservacoes());
        System.out.println(atendimentoClinico);

        //Chame o metodo vacinação do pet shop, e faça o pet tomar a vacina pedido no retorno do atendimentoClinico
        ResponseVO vacinacao = petShop947.vacinacao(cliente1, cliente1.pets, zeus.getVacinas(), zeus.getObservacoes());
        System.out.println(vacinacao);



        //Valide se o retorno do metodo vacinação possui o esquemaVacinal do pet preenchido com o vacina que foi pedida, o id, o serviço prestado e o valor


        //Chame o metodo higienizar do petshop, e faça-o retornar no campo estado do animal, um valor referente ao serviço prestado ex: se chamou o metodo apenas pedindo para dar banho, o animal deverá estar limpo no retorno do metodo


        //Valide se o retorno do metodo higienizar possui id, serviço, preço e se o estado do animal está equivalente ao serviço pedido

        //Chame os métodos verRemedio e verAlimentos

        //Por último, passe para o metodo pagamentos, a lista de todos os ids do serviços utilizados mais pelo menos 1 remédio e 1 alimento e valide se a soma dos valores do pedido do cliente está correta




        //petShop947.higienizar(animal, Higiene.BANHO_E_TOSA, null);



    }

    public void verAlimentos() {

    }

    public void verRemedios() {

    }

    public void pagamentos(List<Integer> itens) {

    }


}
