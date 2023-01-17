import Dados.Endereco;
import Enums.Higiene;
import Models.Animal;
import VO.ResponseVO;

public class PetShop {
    final int VACINAR = 1;
    final int HIGIENIZAR = 2;

    private String cnpj;
    private Endereco enderecoPetShop;

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

    ResponseVO higienizar = new ResponseVO();

    ResponseVO atendimentoClinco = new ResponseVO();

    ResponseVO vacinacao = new ResponseVO();

    public void higienizar(Animal animal, Higiene banhoETosa, Object o) {
    }
}
