import java.time.LocalDateTime;

public abstract class Pagamento {
    public double valor;
    public String status;
    public LocalDateTime dataHoraPagamento;
    public String identificadorTransacao;
    public String moeda;

}
