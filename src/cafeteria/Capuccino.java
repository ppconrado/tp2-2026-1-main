package padroesdecorator;

public class Capuccino extends BebidaDecorator {

    private Bebida bebida;

    public Capuccino(Bebida bebida) {

        super.descricao = "Cafe Expresso Gostosinho";
    }

    @Override
    public String getDescricao() {

        return super.descricao;
    }

    @Override
    public Double getPreco() {

        return 10.00;
    }
}