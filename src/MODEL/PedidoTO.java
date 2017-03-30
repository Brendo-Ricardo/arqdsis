package MODEL;

public class PedidoTO {

private int id;
private String descrição;
private double preço;
private int quantidadeVendidas;

//GET AND SET - ID
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}

//GET AND SET - DESCRIÇÃO
public String getDescrição() {
return descrição;
}
public void setDescrição(String descrição) {
this.descrição = descrição;
}

//GET AND SET - PREÇO
public double getPreço() {
return preço;
}
public void setPreço(double preço) {
this.preço = preço;
}

//GET AND SET - QUANTIDADE.VENDIDAS
public int getQuantidadeVendidas() {
return quantidadeVendidas;
}
public void setQuantidadeVendidas(int quantidadeVendidas) {
this.quantidadeVendidas = quantidadeVendidas;
 }

}  