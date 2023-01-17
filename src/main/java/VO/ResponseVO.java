package VO;

import Dados.Clientes;
import Enums.EstadoAnimal;

import java.math.BigDecimal;

public class ResponseVO {
    int id;
    private Servicos servico;
    private BigDecimal valor;

    EstadoAnimal estadoanimal;
    Clientes cliente;

    public ResponseVO(int id, Servicos servico, BigDecimal valor, Clientes cliente) {
        this.id = id;
        this.servico = servico;
        this.valor = valor;
        this.cliente = cliente;
    }


    public ResponseVO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "id=" + id +
                ", servico=" + servico +
                ", valor=" + valor +
                ", cliente=" + cliente +
                '}';
    }

}
