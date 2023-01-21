import Enums.Higiene;
import Models.*;
import Enums.EstadoAnimal;
import Enums.Porte;
import VO.ResponseVO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Crie o objeto Petshop
        PetShop petShop947 = new PetShop();

        List<EsquemaVacinal> esquemaVacinalList = new ArrayList<EsquemaVacinal>();
        List<Animal> pets = new ArrayList<Animal>();

        /**Crie no mínimo dois clientes, com pelo menos um deles tendo mais do que um pet */
        // primeiro pet
        Cachorro zeus = new Cachorro("Zeus","2022-01-20", "golden", Porte.GRANDE, 5, "normal", EstadoAnimal.SUJO, esquemaVacinalList);
        zeus.setNome("Zeus");
        zeus.setNascimento(LocalDate.parse("2022-01-20"));
        zeus.setRaca("golden");
        zeus.setPorte(Porte.GRANDE);
        zeus.setPeso(6.0);
        zeus.setObservacoes("DOENTE com alergia");
        zeus.setEstadoAnimal(EstadoAnimal.SUJO);
        zeus.setVacinas(esquemaVacinalList);

        //primeiro cliente
        Clientes cliente1 = new Clientes();
        cliente1.setNome("Luciana");
        cliente1.setId(111);
        cliente1.pets.add(zeus);

        //segundo pet
        Cachorro kiko = new Cachorro("Kiko","5-5-2017", "pug", Porte.PEQUENO, 2.5, "normal", EstadoAnimal.SUJO, esquemaVacinalList);
        kiko.setNome("Kiko");
        kiko.setNascimento(LocalDate.parse("2017-05-05"));
        kiko.setRaca("pug");
        kiko.setPorte(Porte.MEDIO);
        kiko.setPeso(3.5);
        kiko.setObservacoes("DOENTE - com infecção na urina");
        kiko.setEstadoAnimal(EstadoAnimal.SUJO);
        kiko.setVacinas(esquemaVacinalList);

        //terceiro pet
        Gato goiaba = new Gato("Goiaba", "2020-12-03", "persa", Porte.PEQUENO, 2.5, "doente", EstadoAnimal.LIMPO, esquemaVacinalList);
        goiaba.setNome("Goiaba");
        goiaba.setNascimento(LocalDate.parse("2020-12-03"));
        goiaba.setRaca("persa");
        goiaba.setPorte(Porte.PEQUENO);
        goiaba.setPeso(2.5);
        goiaba.setObservacoes("DOENTE");
        goiaba.setEstadoAnimal(EstadoAnimal.LIMPO);
        goiaba.setVacinas(esquemaVacinalList);

        //segundo cliente
        Clientes cliente2 = new Clientes();
        cliente2.setNome("Alexandre");
        cliente2.setId(112);
        cliente2.pets.add(kiko);
        cliente2.pets.add(goiaba);

        //lista dos ids de todos os produtos e serviços do cliente 1
        List<Integer> idList1 = new ArrayList<>();

        /**Chame o metodo atendimentoClinico do petshop, e faça-o retornar no campo observações o pedido do médico para o pet tomar a vacina_X*/
        ResponseVO atendimentoClinico = petShop947.atendimentoClinico(cliente1, cliente1.pets, cliente1.pets.get(0).getObservacoes());
        // metodo para colocar o numero de ids de procedimentos iguais ao número de animais, ex. 2 pets, adiciona 2 ids
        for (Animal pet: cliente1.pets) {
              idList1.add(atendimentoClinico.getId());
        }

        /**Valide se o retorno do metodo atendimentoClinico possui o id do serviço, o serviço prestado, o valor e valide principalmente, se há no campo observação do animal, o pedido do médico para a vacina*/
        System.out.println(atendimentoClinico);

        /**Chame o metodo vacinação do pet shop, e faça o pet tomar a vacina pedido no retorno do atendimentoClinico*/
        ResponseVO vacinacao = petShop947.vacinacao(cliente1, cliente1.pets, zeus.getVacinas(), zeus.getObservacoes());
        for (Animal pet: cliente1.pets) {
            idList1.add(vacinacao.getId());
        }

         /**Valide se o retorno do metodo vacinação possui o esquemaVacinal do pet preenchido com o vacina que foi pedida, o id, o serviço prestado e o valor */
         System.out.println(vacinacao);

        /**Chame o metodo higienizar do petshop, e faça-o retornar no campo estado do animal, um valor referente ao serviço prestado ex: se chamou o metodo apenas pedindo para dar banho, o animal deverá estar limpo no retorno do metodo*/
        ResponseVO higienizar = petShop947.higienizar(cliente1, cliente1.pets, Higiene.BANHO_E_TOSA,zeus.getObservacoes());
        for (Animal pet: cliente1.pets) {
            idList1.add(higienizar.getId());
        }

        /**Valide se o retorno do metodo higienizar possui id, serviço, preço e se o estado do animal está equivalente ao serviço pedido*/
        System.out.println(higienizar);

        /**Chame os métodos verRemedio e verAlimentos*/
        PetShop.verRemedios();
        idList1.add(PetShop.remediosList.get(1).getId());

        PetShop.verAlimentos();
        idList1.add(PetShop.alimentosList.get(0).getId());

        /**Por último, passe para o metodo pagamentos, a lista de todos os ids do serviços utilizados mais pelo menos 1 remédio e 1 alimento e valide se a soma dos valores do pedido do cliente está correta*/
        PetShop.pagamentos(idList1);

        //lista dos ids de todos os produtos e serviços do cliente 2
        List<Integer> idList2 = new ArrayList<>();

        /**Repita o todos os fluxos feitos para o cliente com apenas um pet para o que tenha dois, fazendo a seguinte alterações:
         * no metodo atendimentoClinico coloque uma observação diferente para cada animal do cliente (cada animal do cliente deve receber uma vacina diferente para esse caso de testes)*/

        /**
         * No metodo vacinação, vc deve vacinar cada animal conforme pedido no atendimentoClinico e deve checar no retorno o esquemaVacinal de cada animal e constatar a vacina correta em cada um
         */

        /**Chame os métodos verRemedio e verAlimentos*/
        PetShop.verRemedios();
        //idList2.add();
        PetShop.verAlimentos();
        //idList2.add();

        /** Por último, faça a mesma validação para o metodo pagamentos
         * ( a lista de todos os ids do serviços utilizados mais pelo menos 2 remédio e 2 alimento e valide se a soma dos valores do pedido do cliente está correta )
         *  lembre se que se foi enviado dois animais para qualquer serviço, o valor será o dobro do serviço feito apenas para um animal*/
        PetShop.pagamentos(idList2);


    }

}
