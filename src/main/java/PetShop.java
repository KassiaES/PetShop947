import Dados.Clientes;
import Dados.Endereco;
import Enums.Higiene;
import Enums.Servicos;
import Models.Animal;
import VO.ResponseVO;

import java.math.BigDecimal;
import java.util.List;

public class PetShop {
    final int VACINAR = 1;
    final int HIGIENIZAR = 2;
    final int ATENDIMENTO = 2;

    private String cnpj;
    private Endereco enderecoPetShop;

    ResponseVO higienizar = new ResponseVO();

    ResponseVO atendimentoClinco = new ResponseVO();

    ResponseVO vacinacao = new ResponseVO();


    public ResponseVO higienizar(Clientes cliente, List<Animal> animais, Higiene higiene, String observacao) {
        ResponseVO response = new ResponseVO();

        return response;
    }

    public ResponseVO atendimentoClinico(Clientes cliente, List<Animal> animais, String observacao) {
        ResponseVO response = new ResponseVO();
        response.setId(ATENDIMENTO);
        response.setCliente(cliente);
        response.setServico(Servicos.ATENDIMENTO_CLINICO);
        response.setValor(BigDecimal.valueOf(90));
        //animais.get(0).setObservacoes("Tomar VACINA_2");
        response.setServico(Servicos.VACINACAO);
        return response;
    }

    public ResponseVO vacinacao(Clientes cliente, List<Animal> animais, String observacao) {
        ResponseVO response = new ResponseVO();

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
