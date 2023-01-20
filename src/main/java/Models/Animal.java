package Models;

import Enums.EstadoAnimal;
import Enums.Porte;
import java.util.ArrayList;
import java.util.List;

public abstract class  Animal{

    public static EstadoAnimal estadoAnimal;
    private String nome;
    private String nascimento;
    private String raca;
    private Porte porte;
    private Double peso;
    public String observacoes;


    public Animal(String nome, String  nascimento, String raca, Porte porte, Double peso, String observacoes, EstadoAnimal estadoAnimal, List<EsquemaVacinal> vacinas) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
        this.observacoes = observacoes;
        this.estadoAnimal = estadoAnimal;
        this.vacinas = vacinas;
    }

    public Animal() {

    }

    List<EsquemaVacinal> vacinas = new ArrayList<EsquemaVacinal>();
    // TODO fazer concatenação das informações de vacina;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String  getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public EstadoAnimal getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(EstadoAnimal estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public List<EsquemaVacinal> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<EsquemaVacinal> vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome= " + "\u001B[31m" + nome + "\u001B[0m" +'\'' +
                ", nascimento= " + nascimento +
                ", raca= " + raca + '\'' +
                ", porte= " + porte +
                ", peso= " + peso +
                ", observacoes= " +  observacoes + '\'' +
                ", estadoAnimal= " + estadoAnimal +
                ", vacinas= " + vacinas +
                '}';
    }
}
