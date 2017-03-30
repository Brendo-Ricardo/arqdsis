package MODEL;

import DAO.PedidoDAO;

public class Pedido {
private int id;
private String descrição;
private double preço;
private int quantidadeVendidas;

public Pedido(int id, String descrição, double preço, int quantidadeVendidas) {
this.id = id;
this.descrição = descrição;
this.preço = preço;
this.quantidadeVendidas = quantidadeVendidas;
}

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

//GET AND SET- PREÇO
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

//MÉTODO CRIAR
public void criar() {
PedidoDAO dao = new PedidoDAO();
PedidoTO to = new PedidoTO();
to.setId(id);
to.setDescrição(descrição);
to.setPreço(preço);
to.setQuantidadeVendidas(quantidadeVendidas);
dao.incluir(to);
}

//MÉTODO ATUALIZAR
public void atualizar() {
PedidoDAO dao = new PedidoDAO();
PedidoTO to = new PedidoTO();
to.setId(id);
to.setDescrição(descrição);
to.setPreço(preço);
to.setQuantidadeVendidas(quantidadeVendidas);
dao.atualizar(to);
}

//MÉTODO EXCLUIR
public void excluir() {
PedidoDAO dao = new PedidoDAO();
PedidoTO to = new PedidoTO();
to.setId(id);
dao.excluir(to);
}

//MÉTODO CARREGAR
public void carregar() {
PedidoDAO dao = new PedidoDAO();
PedidoTO to = dao.carregar(id);
descrição = to.getDescrição();
preço = to.getPreço();
quantidadeVendidas = to.getQuantidadeVendidas();
}

@Override
public String toString() {
return "Pedido [id=" + id + ", descrição=" + descrição + ", preço=" + preço + ", quantidadeVendidas=" + quantidadeVendidas + "]";
}
}