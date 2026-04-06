package AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src;

import java.time.LocalDateTime;

public abstract class Pagamento {
    private double valor;
    private String status;
    private LocalDateTime dataHoraPagamento;
    private String identificadorTransacao;
    private String moeda;

    public Pagamento(double valor, String status, LocalDateTime dataHoraPagamento, String identificadorTransacao, String moeda) {
        this.valor = valor;
        this.status = status;
        this.dataHoraPagamento = dataHoraPagamento;
        this.identificadorTransacao = identificadorTransacao;
        this.moeda = moeda;
    }

//    public
}
