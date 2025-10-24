package exe1;

public class Veiculo {
    protected String placa;
    protected String modelo;
    protected double valorBase;

    //construtor sem paramentro
    public Veiculo() {
    }

    //construtor com parametro
    public Veiculo(String placa, String modelo, double valorBase) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorBase = valorBase;
    }

    //Getter e Setter
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valorBase='" + valorBase + '\'' +
                '}';
    }

    //calcular imposto o f é para falar que é um float
    public double calcularImposto(){
        return this.valorBase * 0.02f;
    }

}
