public class Produto {
    private int id; //Gerado automaticamente
    private String nome;
    private int quantidade;
    private double preco;
    private String status;

    //Criando o metodo construtor
    public Produto(String nome, int quantidade, double preco, String status){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.status = status;
    }

    //Overload do construtor caso não seja passado nenhum argumento
    public Produto(){
        // Construtor vazio - Permite instanciar um objeto
    }

    //ID Getter:
    public int getId(){
        return this.id;
    }

    //ID Setter:
    public void setId(int id) {
        this.id = id;
    }

    //Nome Getter:
    public String getNome(){
        return this.nome;
    }

    //Nome Setter:
    public void setNome(String nome){
        this.nome = nome;
    }

    //Quantidade Getter:
    public int getQuantidade(){
        return this.quantidade;
    }

    //Quantidade Setter
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    //Preco Getter:
    public double getPreco(){
        return this.preco;
    }

    //Preco Setter:
    public void setPreco(double preco){
        this.preco = preco;
    }

    //Status getter:
    public String getStatus(){
        return this.status;
    }

    //Status setter:
    public void setStatus(String status){
        this.status = status;
    }

}
