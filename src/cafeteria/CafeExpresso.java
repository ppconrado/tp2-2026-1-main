package padroesdecorator;

public class CafeExpresso extends Bebida {

    public CafeExpresso() {

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