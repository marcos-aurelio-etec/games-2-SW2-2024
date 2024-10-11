package application.record;

import application.model.Plataforma;

public record plataformaDTO(long id, String nome) {
    public PlataformaDTO(Plataforma plataforma) {
        this(plataforma.getId(), plataforma.getNome());
    }
}
