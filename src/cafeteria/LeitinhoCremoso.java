package padroesdecorator;

public class LeitinhoCremoso extends Bebida {

    public LeitinhoCremoso() {

        super.descricao = "Leitinho do Cremoso do campo";
    }

    @Override
    public String getDescricao() {

        return super.descricao;
    }

    @Override
    public Double getPreco() {

        return 5.0;
    }
}