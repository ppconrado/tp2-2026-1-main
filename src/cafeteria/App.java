package padroesdecorator;

public class App {

    public static void main(String...strings) {

        Bebida cafe = new CafeExpresso();
        Bebida leite = new LeitinhoCremoso();

        System.out.println(cafe.getDescricao() + cafe.getPreco());

        System.out.println(leite.getDescricao() + leite.getPreco());

        Bebida capuccino = new Capuccino(cafe);
        
        System.out.println(capuccino.getDescricao() + capuccino.getPreco());

    
}

}