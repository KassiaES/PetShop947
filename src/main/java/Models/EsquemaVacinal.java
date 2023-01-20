package Models;

import Enums.Vacinas;

import java.util.Date;

public class EsquemaVacinal {
    Date date;
    Vacinas vacina;
    String observacao;

    public EsquemaVacinal(Vacinas vacina) {
        this.vacina = vacina;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
}
