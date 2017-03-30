package MODEL;

import DAO.PedidoDAO;

public class Pedido {
private int id;
private String descri��o;
private double pre�o;
private int quantidadeVendidas;

public Pedido(int id, String descri��o, double pre�o, int quantidadeVendidas) {
this.id = id;
this.descri��o = descri��o;
this.pre�o = pre�o;
this.quantidadeVendidas = quantidadeVendidas;
}

//GET AND SET - ID
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}

//GET AND SET - DESCRI��O
public String getDescri��o() {
return descri��o;
}
public void setDescri��o(String descri��o) {
this.descri��o = descri��o;
}

//GET AND SET- PRE�O
public double getPre�o() {
return pre�o;
}
public void setPre�o(double pre�o) {
this.pre�o = pre�o;
}

//GET AND SET - QUANTIDADE.VENDIDAS
public int getQuantidadeVendidas() {
return quantidadeVendidas;
}
public void setQuantidadeVendidas(int quantidadeVendidas) {
this.quantidadeVendidas = quantidadeVendidas;
}

//M�TODO CRIAR
public void criar() {
PedidoDAO dao = new PedidoDAO();
PedidoTO to = new PedidoTO();
to.setId(id);
to.setDescri��o(descri��o);
to.setPre�o(pre�o);
to.setQuantidadeVendidas(quantidadeVendidas);
dao.incluir(to);
}

//M�TODO ATUALIZAR
public void atualizar() {
PedidoDAO dao = new PedidoDAO();
PedidoTO to = new PedidoTO();
to.setId(id);
to.setDescri��o(descri��o);
to.setPre�o(pre�o);
to.setQuantidadeVendidas(quantidadeVendidas);
dao.atualizar(to);
}

//M�TODO EXCLUIR
public void excluir() {
PedidoDAO dao = new PedidoDAO();
PedidoTO to = new PedidoTO();
to.setId(id);
dao.excluir(to);
}

//M�TODO CARREGAR
public void carregar() {
PedidoDAO dao = new PedidoDAO();
PedidoTO to = dao.carregar(id);
descri��o = to.getDescri��o();
pre�o = to.getPre�o();
quantidadeVendidas = to.getQuantidadeVendidas();
}

@Override
public String toString() {
return "Pedido [id=" + id + ", descri��o=" + descri��o + ", pre�o=" + pre�o + ", quantidadeVendidas=" + quantidadeVendidas + "]";
}
}