import Enums.EstadoAnimal;
import Enums.Vacinas;
import Models.*;
import Enums.Higiene;
import Enums.Servicos;
import VO.ResponseVO;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class PetShop {
    final int ATENDIMENTO = 1;
    final int VACINAR = 2;
    final int HIGIENIZAR = 3;
    private String cnpj;
    private Endereco enderecoPetShop;
    static List<Remedios> remediosList = criarListaRemedios();
    static List<Alimentos> alimentosList = criarListaAlimentos();
    public ResponseVO atendimentoClinico(Clientes cliente, List<Animal> animais, String observacao) {

        ResponseVO response = new ResponseVO();
        Random gerarVacina = new Random();
        BigDecimal valorConsulta = BigDecimal.ZERO;

        response.setId(ATENDIMENTO);
        response.setCliente(cliente);
        response.setServico(Servicos.ATENDIMENTO_CLINICO);

        //validação para não aplicar vacina repetida
        int indexVacina = -1;
        int indexVacinaAtual = -2;
        for (int i=0; i < animais.size(); i++) {

            valorConsulta = valorConsulta.add(BigDecimal.valueOf(120));

            Animal obs =  (Animal) animais.get(i);
            boolean again = false;

            do {
                indexVacinaAtual = gerarVacina.nextInt(5);
                if (indexVacina != indexVacinaAtual) {
                    if (obs.getObservacoes() != String.valueOf(Vacinas.values()[indexVacinaAtual])) {
                        obs.setObservacoes(String.valueOf(Vacinas.values()[indexVacinaAtual]));
                    } else again = true;
                }
            } while (again = false);
            indexVacina = indexVacinaAtual;
        }
        response.setValor(valorConsulta);
        return response;
    }

    public ResponseVO vacinacao(Clientes cliente, List<Animal> animais, List<Vacinas> vacinas, String observacao) {

        ResponseVO response = new ResponseVO();
        response.setId(VACINAR);
        response.setCliente(cliente);
        response.setServico(Servicos.VACINACAO);

        BigDecimal valorConsulta = BigDecimal.ZERO;
        valorConsulta = valorConsulta.add(BigDecimal.valueOf(90));


        for (Animal animal:animais) {
            // passa a observacao de String para Enum e gera o EsquemaVacinal

            EsquemaVacinal esquemaVacinal = (new EsquemaVacinal(LocalDate.now(),Vacinas.valueOf(animal.getObservacoes()), "Vacinado"));
            animal.getVacinas().add(esquemaVacinal);
            animal.setObservacoes("Atendido em " + LocalDate.now());

        }
        response.setValor(valorConsulta);
        return response;
    }

    public ResponseVO higienizar(Clientes cliente, List<Animal> animais, Higiene higiene, String observacao) {

        ResponseVO response = new ResponseVO();
        response.setId(HIGIENIZAR);
        response.setCliente(cliente);
        response.setServico(Servicos.HIGIENIZAR);

        BigDecimal valorConsulta = BigDecimal.ZERO;

        for (int k=0; k < animais.size(); k++) {

            Animal estadoAnimal =  (Animal) animais.get(k);
            estadoAnimal.setEstadoAnimal(EstadoAnimal.LIMPO_E_TOSADO);

            valorConsulta = valorConsulta.add(BigDecimal.valueOf(60));

        }
        response.setValor(valorConsulta);

        return response;
    }

    public static void verRemedios() {
        remediosList.forEach(remedio -> System.out.println(remedio));
    }
    public static List<Remedios> criarListaRemedios() {
        Remedios remedio1 = new Remedios(31, "Bravecto", new BigDecimal(45.50));
        Remedios remedio2 = new Remedios(32, "NexGard", new BigDecimal(55.75));
        Remedios remedio3 = new Remedios(33, "Frontline", new BigDecimal(50.25));
        return Arrays.asList(remedio1,remedio2,remedio3);
    }

   public static void verAlimentos() {
        alimentosList.forEach(alimento -> System.out.println(alimento));
   }
    public static List<Alimentos> criarListaAlimentos() {
        Alimentos alimento1 = new Alimentos(71, "Petisco Wow", new BigDecimal(25.50));
        Alimentos alimento2 = new Alimentos(72, "Ração Premium Nutrilus", new BigDecimal(35.50));
        Alimentos alimento3 = new Alimentos(73, "Ração Purina", new BigDecimal(40.75));
        return Arrays.asList(alimento1, alimento2,alimento3);
    }

    static void pagamentos(List<Integer> itens) {
        double total = 0;
        System.out.println("\n\n CUPOM FISCAL");
        for (int item:itens) {
            switch (item) {
                case 1:
                    total+= 120;
                    System.out.println(Servicos.ATENDIMENTO_CLINICO + " R$ 120.00"  );
                    break;
                case 2:
                    total+= 90;
                    System.out.println(Servicos.VACINACAO + " R$ 90.00"  );
                    break;
                case 3:
                    total+= 60;
                    System.out.println(Servicos.HIGIENIZAR + " R$ 60.00"  );
                    break;
                case 31:
                    System.out.println(remediosList.get(0));
                    total+= 45.50;
                    break;
                case 32:
                    System.out.println(remediosList.get(1));
                    total+= 55.75;
                    break;
                case 33:
                    System.out.println(remediosList.get(2));
                    total+= 50.25;
                    break;
                case 71:
                    System.out.println(alimentosList.get(0));
                    total+= 25.45;
                    break;
                case 72:
                    System.out.println(alimentosList.get(1));
                    total+= 35.50;
                    break;
                case 73:
                    System.out.println(alimentosList.get(2));
                    total+= 40.99;
                    break;
            }
        }
        System.out.println("\nO total é \u001B[36m R$ " + total + "\u001B[0m\n");
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEnderecoPetShop() {
        return enderecoPetShop;
    }

    public void setEnderecoPetShop(Endereco enderecoPetShop) {
        this.enderecoPetShop = enderecoPetShop;
    }
}
