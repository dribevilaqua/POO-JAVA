import exe0.Funcionario;
import prova.ObraArte;
import prova.SubObraArte;

import java.util.ArrayList;
import java.util.List;

public class MainExposicao {
    public static void exibir (ObraArte subObraArte){ System.out.println(subObraArte.toString()); }
    public static void main(String[] args) {

        ObraArte Obra1 = new SubObraArte("Ainda não sei qual obra de arte eu sou", "Ana", "oleo", "gesso", true);
        ObraArte Obra2 = new SubObraArte("Obra Linda", "Renato", "Aquarela", "gesso", false);
        ObraArte Obra3 = new SubObraArte("Ceu aberto", "Lucas", "oleo", "Ferro", true);
        ObraArte Obra4 = new SubObraArte("Dia lindo", "Carla", "oleo", "Ferro", true);
        ObraArte Obra5 = new SubObraArte("Passeio Aqui", "Dulce", "oleo", "Ferro", false);

        exibir(Obra1);
        exibir(Obra2);
        exibir(Obra3);
        exibir(Obra4);
        exibir(Obra5);

        List<ObraArte> subObraArtes = new ArrayList<>();
        subObraArtes.add(Obra1);
        subObraArtes.add(Obra2);
        subObraArtes.add(Obra3);
        subObraArtes.add(Obra4);
        subObraArtes.add(Obra5);
    }
}
