package br.com.sge.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import br.com.sge.connection.SGEConnectionMySql;
import br.com.sge.model.ProdutoModel;
import br.com.sge.util.Mascaras;
import br.com.sge.view.Sales;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jluiz
 */
public class ProdutoDao extends SGEConnectionMySql implements IProdutoDao {

    Mascaras mascaras = new Mascaras();

    /**
     * grava Produto
     *
     * @param pProdutoModel return int
     * @return
     */
    @Override
    public int salvarProdutoDAO(ProdutoModel pProdutoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_produto ("
                    + "pro_descricao,"
                    + "pro_categoria,"
                    + "pro_observacao,"
                    + "pro_quantidade_estoque,"
                    + "pro_valor_total,"
                    + "pro_valor_unitario,"
                    + "pro_codigo_barra,"
                    + "pro_data_entrada"
                    + ") VALUES ("
                    + "'" + pProdutoModel.getProDescricao() + "',"
                    + "'" + pProdutoModel.getProCategoria() + "',"
                    + "'" + pProdutoModel.getProObservacao() + "',"
                    + "'" + pProdutoModel.getProQuantidadeEstoque() + "',"
                    + "'" + pProdutoModel.getProValorTotal() + "',"
                    + "'" + pProdutoModel.getProValorUnitario() + "',"
                    + "'" + pProdutoModel.getProCodigoBarras() + "',"
                    + "'" + pProdutoModel.getProDataEntrada() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Produto
     *
     * @param pIdProduto return ModelProduto
     * @return
     */
    @Override
    public ProdutoModel getProdutoDAO(int pIdProduto) {
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_produto"
                    + " WHERE"
                    + " pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProCategoria(this.getResultSet().getString(3));
                produtoModel.setProObservacao(this.getResultSet().getString(4));
                produtoModel.setProQuantidadeEstoque(this.getResultSet().getInt(5));
                produtoModel.setProValorTotal(this.getResultSet().getDouble(6));
                produtoModel.setProValorUnitario(this.getResultSet().getDouble(7));
                produtoModel.setProCodigoBarras(this.getResultSet().getString(8));
                produtoModel.setProDataEntrada(this.getResultSet().getString(9));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produtoModel;
    }

    /**
     * recupera uma lista de Produto return ArrayList
     *
     * @return
     */
    @Override
    public ArrayList<ProdutoModel> getListaProdutoDAO() {
        ArrayList<ProdutoModel> listamodelProduto = new ArrayList();
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_produto;"
            );

            while (this.getResultSet().next()) {
                produtoModel = new ProdutoModel();
                produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProCategoria(this.getResultSet().getString(3));
                produtoModel.setProObservacao(this.getResultSet().getString(4));
                produtoModel.setProQuantidadeEstoque(this.getResultSet().getInt(5));
                produtoModel.setProValorTotal(this.getResultSet().getDouble(6));
                produtoModel.setProValorUnitario(this.getResultSet().getDouble(7));
                produtoModel.setProCodigoBarras(this.getResultSet().getString(8));
                produtoModel.setProDataEntrada(this.getResultSet().getString(9));
                listamodelProduto.add(produtoModel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
     * atualiza Produto
     *
     * @param pProdutoModel return boolean
     * @return
     */
    @Override
    public boolean atualizarProdutoDAO(ProdutoModel pProdutoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "pk_id_produto = '" + pProdutoModel.getProCodigoProduto() + "',"
                    + "pro_descricao = '" + pProdutoModel.getProDescricao() + "',"
                    + "pro_categoria ='" + pProdutoModel.getProCategoria() + "',"
                    + "pro_observacao = '" + pProdutoModel.getProObservacao() + "',"
                    + "pro_quantidade_estoque = '" + pProdutoModel.getProQuantidadeEstoque() + "',"
                    + "pro_valor_total = '" + pProdutoModel.getProValorTotal() + "',"
                    + "pro_valor_unitario = '" + pProdutoModel.getProValorUnitario() + "',"
                    + "pro_codigo_barra = '" + pProdutoModel.getProCodigoBarras() + "',"
                    + "pro_data_entrada = '" + pProdutoModel.getProDataEntrada() + "'"
                    + " WHERE "
                    + "pk_id_produto = '" + pProdutoModel.getProCodigoProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Produto
     *
     * @param pIdProduto return boolean
     * @return
     */
    @Override
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto "
                    + " WHERE "
                    + "pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Alterar estoque de produtos no banco
     *
     * @param pListaModelProdutos
     * @return
     */
    @Override
    public boolean alterarEstoqueProdutosDAO(ArrayList<ProdutoModel> pListaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < pListaModelProdutos.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE tbl_produto SET "
                        + "pro_quantidade_estoque = '" + pListaModelProdutos.get(i).getProQuantidadeEstoque() + "'"
                        + " WHERE pk_id_produto = '" + pListaModelProdutos.get(i).getProCodigoProduto() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * retornar um produto pelo nome
     *
     * @param pNomeProduto
     * @return modelproduto
     */
    @Override
    public ProdutoModel retornarProdutoDAO(String pNomeProduto) {
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_produto"
                    + " WHERE"
                    + " pro_descricao = '" + pNomeProduto + "'"
                    + ";");
            while (this.getResultSet().next()) {
                produtoModel = new ProdutoModel();
                produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProCategoria(this.getResultSet().getString(3));
                produtoModel.setProObservacao(this.getResultSet().getString(4));
                produtoModel.setProQuantidadeEstoque(this.getResultSet().getInt(5));
                produtoModel.setProValorTotal(this.getResultSet().getDouble(6));
                produtoModel.setProValorUnitario(this.getResultSet().getDouble(7));
                produtoModel.setProCodigoBarras(this.getResultSet().getString(8));
                produtoModel.setProDataEntrada(this.getResultSet().getString(9));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produtoModel;
    }

    public void calcular() {
        String pre;
        String can = "";
        double total = 0;
        double precio;
        int cantidad = 0;
        double imp = 0.0;
        for (int i = 0; i < Sales.jtSales.getRowCount(); i++) {
            pre = Sales.jtSales.getValueAt(i, 4).toString();
            can = Sales.jtSales.getValueAt(i, 3).toString();
            precio = Double.parseDouble(pre);
            cantidad = Integer.parseInt(can);
            imp = precio * cantidad;
            total = total + imp;
            Sales.jtSales.setValueAt(Math.rint(imp * 100) / 100, i, 5);
        }
        Sales.lblTotal.setText("" + Math.rint(total * 100) / 100);
    }

    private void setQuantProduct() {

        DefaultTableModel model = (DefaultTableModel) Sales.jtSales.getModel();
        int total = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            String x = model.getValueAt(i, 3).toString();
            int y = Integer.parseInt(x);
            total += y;
            Sales.jtfQtde.setText(String.valueOf(total));
        }
    }

    /**
     * retornar um produto pelo ID apenas para preencher a tabela de vendas.
     *
     * @param productCode
     * @param amount
     */
    public void getProdutoDAO(int productCode, int amount) {

        DefaultTableModel modelo = (DefaultTableModel) Sales.jtSales.getModel();
        int qtdeLinhas = Sales.jtSales.getRowCount();
        String productData[] = new String[5];

        String desc = null;
        String categoria = null;
        Double vTotal = 0.0;
        double vUnitario = 0.0;

        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_produto"
                    + " WHERE"
                    + " pk_id_produto =' " + productCode + " ' "
                    + ";");

            while (this.getResultSet().next()) {
                desc = this.getResultSet().getString("pro_descricao");
                categoria = this.getResultSet().getString("pro_categoria");
                vTotal = this.getResultSet().getDouble("pro_valor_total");
                vUnitario = this.getResultSet().getDouble("pro_valor_unitario");
            }

            productData[0] = String.valueOf(productCode);
            productData[1] = desc;
            productData[2] = categoria;
            productData[3] = String.valueOf(amount);
            productData[4] = String.valueOf(vTotal);
            //    productData[5] = String.valueOf(sum); // valor total

            modelo.addRow(productData);
            Sales.jtSales.setModel(modelo);
            calcular();
            setQuantProduct();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Filtra produtos pela quantidade em estoque
     *
     * @param pEstoqueProduto
     * @return
     */
    @Override
    public ProdutoModel filtrarEstoqueProdutosDAO(String pEstoqueProduto) {
        ProdutoModel produtoModel = new ProdutoModel();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_produto" + " WHERE pro_quantidade_estoque = '" + pEstoqueProduto + "';");
            while (this.getResultSet().next()) {
                produtoModel = new ProdutoModel();
                produtoModel.setProCodigoProduto(this.getResultSet().getInt(1));
                produtoModel.setProDescricao(this.getResultSet().getString(2));
                produtoModel.setProCategoria(this.getResultSet().getString(3));
                produtoModel.setProObservacao(this.getResultSet().getString(4));
                produtoModel.setProQuantidadeEstoque(this.getResultSet().getInt(5));
                produtoModel.setProValorTotal(this.getResultSet().getDouble(6));
                produtoModel.setProValorUnitario(this.getResultSet().getDouble(7));
                produtoModel.setProCodigoBarras(this.getResultSet().getString(8));
                produtoModel.setProDataEntrada(this.getResultSet().getString(9));
                //  listamodelProdutos.add(modelProduto);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return produtoModel;
    }

}
