public class Produto {

    private String name;
    private double preco;
    private int quantia;


    public Produto(String name, double preco, int quantia) 
    {

        this.name = name;
        this.preco = preco;
        this.quantia = quantia;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public int getQuantia()
    {
        return quantia;
    }

    public void setQuantia(int quantia)
    {
        this.quantia = quantia;
    }
    
}
