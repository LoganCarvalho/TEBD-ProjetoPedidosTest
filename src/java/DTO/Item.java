
package DTO;

/**
 *
 * @author Logan
 */
public class Item {
    
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    //Construtor da classe que está sendo usado em Pedido
    public Item(String newDescricao, int newQuantidade, double newValor){
		this.descricao = newDescricao;
		this.quantidade = newQuantidade;
		this.valorUnitario = newValor;
	}
    
    public String getDescricao(){
		return this.descricao;
	}
	
    public double getValorTotalItem(){
		return this.quantidade * this.valorUnitario;
	}
	
    @Override
    public String toString(){
		return "Descricao: " + this.descricao + " - " + "Qtd:" +
		this.quantidade + " - " + "Valor: " + this.valorUnitario + "\n";
	}
    
    public int getQuantidade(){
		return this.quantidade;
	}

    public double getValorUnitario(){
		return this.valorUnitario;
	}	
    
}
