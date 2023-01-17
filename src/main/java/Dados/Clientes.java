package Dados;

import Enums.EstadoAnimal;
import Enums.Porte;
import Models.Animal;
import Models.EsquemaVacinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clientes  extends Animal {

    private int id;
    public List<Animal> pets = new ArrayList<Animal>();

    public Clientes(String nome, Date nascimento, String raca, Porte porte, Double peso, String observacoes, EstadoAnimal estadoAnimal, List<EsquemaVacinal> vacinas, int id, List<Animal> pets) {
        super(nome, nascimento, raca, porte, peso, observacoes, estadoAnimal, vacinas);
        this.id = id;
        this.pets = pets;
    }

    public Clientes(int id, List<Animal> pets) {
        this.id = id;
        this.pets = pets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }
}
