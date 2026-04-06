import AtvdSistemaPagamentosDigitais.SistemadePagamentosDigitais.src.Pix;

void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Qual a forma de pagamento?");
    IO.println("1 - Boleto Bancário");
    IO.println("2 - Cartao de Crédito");
    IO.println("3 - Pix");
    int escolhaPagamento = Integer.parseInt((sc.next()));

    if (escolhaPagamento == 1) {

    }
    IO.println(escolhaPagamento);

}