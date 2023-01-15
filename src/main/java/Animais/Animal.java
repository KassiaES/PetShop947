package Animais;

import Enums.Porte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Animal {

    String nome;
    Date nascimento;
    String raca;
    Porte porte;
    Double peso;
    String observacoes;
    List<esquemaVacinal> vacinas = new ArrayList<esquemaVacinal>();
    // TODO fazer concatenação das informações de vacina;

    public Animal(String nome, Date nascimento, String raca, Porte porte, Double peso, String observacoes, List<esquemaVacinal> vacinas) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
        this.observacoes = observacoes;
        this.vacinas = vacinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
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

    public List<esquemaVacinal> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<esquemaVacinal> vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", raca='" + raca + '\'' +
                ", porte=" + porte +
                ", peso=" + peso +
                ", observacoes='" + observacoes + '\'' +
                ", vacinas=" + vacinas +
                '}';
    }
}
