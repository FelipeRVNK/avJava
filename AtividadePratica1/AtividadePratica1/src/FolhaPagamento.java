public class FolhaPagamento {

    private String nomeFuncionario;
    private double horasTrabalhadas;
    private double valorHora;
    private double salarioBruto;
    private double ir;
    private double inss;
    private double fgts;
    private double salarioLiquido;

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double salarioBruto() {
        salarioBruto = horasTrabalhadas * valorHora;
        return salarioBruto;
    }

    public double ir(float res) {

        if (salarioBruto <= 1372.81) {
            ir = 0;
        } else if (salarioBruto >= 1372.82 && salarioBruto <= 2743.25) {
            ir = (salarioBruto * 0.15) - 205.92;
        } else if (salarioBruto > 2743.25) {
            ir = (salarioBruto * 0.27) - 548.82;
        }
        return ir;
    }

    public double inss() {
        if (salarioBruto <= 868.29) {
            inss = salarioBruto * 0.08;
        } else if (salarioBruto >= 868.30 && salarioBruto <= 1447.14) {
            inss = salarioBruto * 0.09;
        } else if (salarioBruto >= 1447.15 && salarioBruto <= 2894.27) {
            inss = salarioBruto * 0.11;
        } else {
            inss = 318.37;
        }
        return inss;

    }
    public double fgts(){
        fgts = salarioBruto * 0.08;
        return fgts;
    }

    public double salarioLiquido(){
        salarioLiquido = salarioBruto - (ir + inss);
        return salarioLiquido;
    }
}
