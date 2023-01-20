import Enums.Vacinas;
import Models.Clientes;
import Models.Endereco;
import Enums.Higiene;
import Enums.Servicos;
import Models.Animal;
import Models.EsquemaVacinal;
import VO.ResponseVO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class PetShop {
    final int ATENDIMENTO = 1;
    final int VACINAR = 2;
    final int HIGIENIZAR = 3;
    private String cnpj;
    private Endereco enderecoPetShop;

    public ResponseVO higienizar(Clientes cliente, List<Animal> animais, Higiene higiene, String observacao) {
        ResponseVO response = new ResponseVO();
        response.setId(HIGIENIZAR);
        response.setCliente(cliente);
        response.setServico(Servicos.HIGIENIZAR);
        response.setValor(BigDecimal.valueOf(50));
        return response;
    }

    public ResponseVO atendimentoClinico(Clientes cliente, List<Animal> animais, String observacao) {
        //ciclo para mais de 1 animal
        ResponseVO response = new ResponseVO();
        response.setId(ATENDIMENTO);
        response.setCliente(cliente);
        response.setServico(Servicos.ATENDIMENTO_CLINICO);
        response.setValor(BigDecimal.valueOf(120));
        for (int i=0; i < animais.size(); i++) {
            Animal obs =  (Animal) animais.get(0);
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
            //vac.setDate();
        }
        return response;
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
