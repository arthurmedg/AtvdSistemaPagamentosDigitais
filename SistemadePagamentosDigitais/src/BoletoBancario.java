package AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src;

import AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src.Pagamento;

import java.time.LocalDateTime;

public class BoletoBancario extends Pagamento {
    public BoletoBancario(double valor, String status, LocalDateTime dataHoraPagamento, String identificadorTransacao, String moeda) {
        super(valor, status, dataHoraPagamento, identificadorTransacao, moeda);
    }
}
