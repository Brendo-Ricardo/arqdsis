package SERVICE;

import DAO.PedidoDAO;
import MODEL.PedidoTO;

public class PedidoService {
PedidoDAO dao;

public void Pedido() {
dao = new PedidoDAO();
}

//CRIAR
public void criar(PedidoTO to) {
dao.incluir(to);
}

//ATUALIZAR
public void atualizar(PedidoTO to) {
dao.atualizar(to);
}

//EXCLUIR
public void excluir(PedidoTO to) {
dao.excluir(to);
}

//CARREGAR
public PedidoTO carregar(int id) {
PedidoTO to = dao.carregar(id);
return to;
}

@Override
public String toString() {
String descrição = null;
String preço = null;
String quantidadeVendidas = null;
String id = null;
return "Pedido [id=" + id + ", descrição=" + descrição + ", preço=" + preço + ", quantidadeVendidas=" + quantidadeVendidas +"]";
 }
}