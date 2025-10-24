package prova;

public class ObraArte {
    protected String titulo;
    protected String artista;

    //construtor com paramentros
    public ObraArte() {
    }

    //construtor sem parametros
    public ObraArte(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    //getter e setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    //toString
    @Override
    public String toString() {
        return "ObraArte{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }

}
