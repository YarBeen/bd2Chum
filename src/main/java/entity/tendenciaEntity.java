package entity;

import java.util.ArrayList;

public class tendenciaEntity {
    
    private ArrayList<stringAndInt> categoriasMasOfertables;
    private ArrayList<stringAndInt> categoriasConMasPublicaciones;
    
    public tendenciaEntity(ArrayList<stringAndInt> categoriasMasOfertables,
            ArrayList<stringAndInt> categoriasConMasPublicaciones) {
        this.categoriasMasOfertables = categoriasMasOfertables;
        this.categoriasConMasPublicaciones = categoriasConMasPublicaciones;
    }

    public ArrayList<stringAndInt> getCategoriasMasOfertables() {
        return categoriasMasOfertables;
    }

    public void setCategoriasMasOfertables(ArrayList<stringAndInt> categoriasMasOfertables) {
        this.categoriasMasOfertables = categoriasMasOfertables;
    }

    public ArrayList<stringAndInt> getCategoriasConMasPublicaciones() {
        return categoriasConMasPublicaciones;
    }

    public void setCategoriasConMasPublicaciones(ArrayList<stringAndInt> categoriasConMasPublicaciones) {
        this.categoriasConMasPublicaciones = categoriasConMasPublicaciones;
    }

}