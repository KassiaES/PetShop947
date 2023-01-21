package Models;

import Enums.Vacinas;
import java.time.LocalDate;

public class EsquemaVacinal {
    LocalDate date;
    Vacinas vacina;
    String observacao;

    public EsquemaVacinal(LocalDate date, Vacinas vacina, String observacao) {
        this.date = date;
        this.vacina = vacina;
        this.observacao = observacao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Vacinas getVacina() {
        return vacina;
    }

    public void setVacina(Vacinas vacina) {
        this.vacina = vacina;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "EsquemaVacinal{" +
                "date=" + date +
                ", vacina=" + vacina +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
