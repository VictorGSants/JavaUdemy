package entities;

import java.util.Objects;

public class Candidato {
    private String name;
    private Integer votos;

    public Candidato(String name, Integer votos) {
        this.name = name;
        this.votos = votos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(name, candidato.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
