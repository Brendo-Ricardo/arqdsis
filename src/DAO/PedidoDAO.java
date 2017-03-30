package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//CLASS PEDIDO.DAO
public class PedidoDAO {
public void incluir(MODEL.PedidoTO to) {
String sqlInsert = "INSERT INTO pedido(id, descri��o, pre�o, quantidadeVendidas) VALUES (?, ?, ?,?)";

try (Connection conn = ConnectionFactory.obtemConexao();
PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
stm.setInt(1, to.getId());
stm.setString(2, to.getDescri��o());
stm.setDouble(3, to.getPre�o());
stm.setInt(4, to.getQuantidadeVendidas());
stm.execute();
} catch (SQLException e) {
e.printStackTrace();
 }
}


public void atualizar(MODEL.PedidoTO to) {
String sqlUpdate = "UPDATE pedido SET descri��o=?, pre�o=?, quantidadeVendidas=? WHERE id=?";

try (Connection conn = ConnectionFactory.obtemConexao();
PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
stm.setString(1, to.getDescri��o());
stm.setDouble(2, to.getPre�o());
stm.setInt(3, to.getQuantidadeVendidas());
stm.setInt(4, to.getId());
stm.execute();
} catch (Exception e) {
e.printStackTrace();
}
}

//EXCLUIR
public void excluir(MODEL.PedidoTO to) {
String sqlDelete = "DELETE FROM pedido WHERE id = ?";

try (Connection conn = ConnectionFactory.obtemConexao();
PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
stm.setInt(1, to.getId());
stm.execute();
} catch (Exception e) {
e.printStackTrace();
 }
}

//CARREGAR
public MODEL.PedidoTO carregar(int id) {
MODEL.PedidoTO to = new MODEL.PedidoTO();
String sqlSelect = "SELECT descri��o, pre�o, quantidadeVendidas FROM pedido WHERE pedido.id = ?";

try (Connection conn = ConnectionFactory.obtemConexao();
PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
stm.setInt(1, id);
try (ResultSet rs = stm.executeQuery();) {
if (rs.next()) {
to.setDescri��o(rs.getString("Descri��o"));
to.setPre�o(rs.getDouble("Pre�o"));
to.setQuantidadeVendidas(rs.getInt("QuantidadeVendidas"));
 }
} catch (SQLException e) {
e.printStackTrace();
 }
} catch (SQLException e1) {
System.out.print(e1.getStackTrace());
 }
return to;
 }
}