import Dados.Clientes;
import Dados.Endereco;
import Enums.Higiene;
import Enums.Servicos;
import Enums.Vacinas;
import Models.Animal;
import Models.EsquemaVacinal;
import VO.ResponseVO;

import java.math.BigDecimal;
import java.util.List;

import static Enums.Vacinas.VACINA_2;

public class PetShop {
    final int VACINAR = 1;
    final int HIGIENIZAR = 3;
    final int ATENDIMENTO = 2;

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
        ResponseVO response = new ResponseVO();
        response.setId(ATENDIMENTO);
        response.setCliente(cliente);
        response.setServico(Servicos.ATENDIMENTO_CLINICO);
        response.setValor(BigDecimal.valueOf(120));
        //animais.get(0).setObservacoes("Tomar VACINA_2");
        response.setServico(Servicos.VACINACAO);
        return response;
    }


    public ResponseVO vacinacao(Clientes cliente, List<Animal> animais, List<EsquemaVacinal> esquemaVacinalList, String observacao) {
        ResponseVO response = new ResponseVO();
        //esquemaVacinalList.add(EsquemaVacinal.setVacina(VACINA_2));
        response.setId(VACINAR);
        response.setCliente(cliente);
        response.setServico(Servicos.VACINACAO);
        response.setValor(BigDecimal.valueOf(90));
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
