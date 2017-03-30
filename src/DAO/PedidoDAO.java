package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//CLASS PEDIDO.DAO
public class PedidoDAO {
public void incluir(MODEL.PedidoTO to) {
String sqlInsert = "INSERT INTO pedido(id, descrição, preço, quantidadeVendidas) VALUES (?, ?, ?,?)";

try (Connection conn = ConnectionFactory.obtemConexao();
PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
stm.setInt(1, to.getId());
stm.setString(2, to.getDescrição());
stm.setDouble(3, to.getPreço());
stm.setInt(4, to.getQuantidadeVendidas());
stm.execute();
} catch (SQLException e) {
e.printStackTrace();
 }
}


public void atualizar(MODEL.PedidoTO to) {
String sqlUpdate = "UPDATE pedido SET descrição=?, preço=?, quantidadeVendidas=? WHERE id=?";

try (Connection conn = ConnectionFactory.obtemConexao();
PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
stm.setString(1, to.getDescrição());
stm.setDouble(2, to.getPreço());
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
String sqlSelect = "SELECT descrição, preço, quantidadeVendidas FROM pedido WHERE pedido.id = ?";

try (Connection conn = ConnectionFactory.obtemConexao();
PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
stm.setInt(1, id);
try (ResultSet rs = stm.executeQuery();) {
if (rs.next()) {
to.setDescrição(rs.getString("Descrição"));
to.setPreço(rs.getDouble("Preço"));
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