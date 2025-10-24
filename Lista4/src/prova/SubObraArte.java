package prova;

import exe0.Funcionario;

public class SubObraArte extends ObraArte{
    private String Pintura;
    private String material;
    private boolean interativa;

    public SubObraArte (){
        super();
    }

    public SubObraArte(String titulo, String artista, String pintura, String material, boolean interativa) {
        super(titulo, artista);
        Pintura = pintura;
        this.material = material;
        this.interativa = interativa;
    }

    public String getPintura() {
        return Pintura;
    }

    public void setPintura(String pintura) {
        Pintura = pintura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isInterativa() {
        return interativa;
    }

    public void setInterativa(boolean interativa) {
        this.interativa = interativa;
    }

    @Override
    public String toString() {
        return "SubObraArte{" +
               super.toString() + "Pintura realizada com técnica '" + Pintura + '\'' +
                ", Esclupida em " + material + '\'' +
                ", Exposição " + interativa +
                '}';
    }

   // public boolean Exposicao(){
     //   if interativa == true;
       // return System.out.println("Interativa");
    //} else ("não interativa")



}
