import Enums.EstadoAnimal;
import Enums.Vacinas;
import Models.*;
import Enums.Higiene;
import Enums.Servicos;
import VO.ResponseVO;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PetShop {
    final int ATENDIMENTO = 1;
    final int VACINAR = 2;
    final int HIGIENIZAR = 3;
    private String cnpj;
    private Endereco enderecoPetShop;
    static List<Remedios> remediosList = criarListaRemedios();
    static List<Alimentos> alimentosList = criarListaAlimentos();
    public ResponseVO atendimentoClinico(Clientes cliente, List<Animal> animais, String observacao) {
        //ciclo para mais de 1 animal
        ResponseVO response = new ResponseVO();
        response.setId(ATENDIMENTO);
        response.setCliente(cliente);
        response.setServico(Servicos.ATENDIMENTO_CLINICO);
        response.setValor(BigDecimal.valueOf(120));
        for (int i=0; i < animais.size(); i++) {
            Animal obs =  (Animal) animais.get(i);
            obs.setObservacoes(String.valueOf(Vacinas.values()[i]));
        }
        return response;
    }

    public ResponseVO vacinacao(Clientes cliente, List<Animal> animais, List<EsquemaVacinal> esquemaVacinalList, String observacao) {
        //ciclo para mais de 1 animal
        ResponseVO response = new ResponseVO();
        response.setId(VACINAR);
        response.setCliente(cliente);
        response.setServico(Servicos.VACINACAO);
        response.setValor(BigDecimal.valueOf(90));
        // somar na lista, não só gravar
        for (int j=0; j < animais.size(); j++) {
            esquemaVacinalList.add(new EsquemaVacinal(Vacinas.values()[j]));
            Animal obs =  (Animal) animais.get(j);
            obs.setObservacoes("Vacinado");
            //vac.setDate();
        }
        return response;
    }

    public ResponseVO higienizar(Clientes cliente, List<Animal> animais, Higiene higiene, String observacao) {
        ResponseVO response = new ResponseVO();
        response.setId(HIGIENIZAR);
        response.setCliente(cliente);
        response.setServico(Servicos.HIGIENIZAR);
        for (int i=0; i < animais.size(); i++) {
            Animal estadoAnimal =  (Animal) animais.get(i);
            if (higiene == Higiene.BANHO) {
                estadoAnimal.setEstadoAnimal(EstadoAnimal.LIMPO);
                response.setValor(BigDecimal.valueOf(60));
            } else  {
                estadoAnimal.setEstadoAnimal(EstadoAnimal.LIMPO_E_TOSADO);
                response.setValor(BigDecimal.valueOf(90));
            }
        }
        return response;
    }

    static void verRemedios() {
        remediosList.forEach(remedio -> System.out.println(remedio));
    }
    public static List<Remedios> criarListaRemedios() {
        Remedios remedio1 = new Remedios(1, "Bravecto", new BigDecimal(45));
        Remedios remedio2 = new Remedios(2, "NexGard", new BigDecimal(55));
        return Arrays.asList(remedio1,remedio2);
    }

   static void verAlimentos() {
        alimentosList.forEach(alimento -> System.out.println(alimento));
   }
    public static List<Alimentos> criarListaAlimentos() {
        Alimentos alimento1 = new Alimentos(1, "Petisco Wow", new BigDecimal(25));
        Alimentos alimento2 = new Alimentos(2, "Ração Premium Nutrilus", new BigDecimal(35));
        return Arrays.asList(alimento1, alimento2);
    }

    static void pagamentos(List<Integer> itens) {
        double total = 1;
        //total +=;
        System.out.println("O total é: " + total + "\n");
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
