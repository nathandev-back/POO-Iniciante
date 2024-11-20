public class exibir extends Cadastrar{
    public  void Informacoes () {
        
        System.out.print("""
                ========================
                    Informações do produto
                
                Produto = %s
                Preço = %.2f
                Quantidade = %d
                
                ========================
                
                
                """.formatted(getName(),getPreco(), getQuantia()));
    }
    
}
