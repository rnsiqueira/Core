package br.com.alert.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alert.ConnectionFactory;
import br.com.alert.modelo.Permissao;
import br.com.alert.modelo.Relatorio_Contatos;

public class Relatorio_ContatosDAO {
	
private Connection conexao;
	
	public Relatorio_ContatosDAO() {
		
		try {
			this.conexao = new ConnectionFactory().getConnection();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	
	public List<Relatorio_Contatos> listaPermissao(){
		try {
			
			List<Relatorio_Contatos> listRC = new ArrayList<Relatorio_Contatos>();
			PreparedStatement stm = conexao.prepareStatement("select * from TCC_RELATORIO_CONTATOS");
			
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()){
				listRC.add(populalistRC(rs));
			}
			
			rs.close();
			stm.close();
			conexao.close();
			
			return listRC;
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		
		
		
	}
	
	public Relatorio_Contatos populalistRC(ResultSet rs) throws SQLException{
		Relatorio_Contatos listRC = new Relatorio_Contatos();
		listRC.setCOD_SETOR(rs.getLong("COD_SETOR"));
		listRC.setCOD_SUB_SETOR(rs.getLong("COD_SUB_SETOR"));
		listRC.setCOD_RELATORIO(rs.getLong("COD_RELATORIO"));
		listRC.setCOD_CONTATO(rs.getLong("COD_CONTATO"));
		
		
		return listRC;
				
	}
	
	public void addRelatorio_Contatos(Relatorio_Contatos listRC){
		String sql = "insert into TCC_RELATORIO_CONTATOS (cod_setor,cod_sub_setor,cod_relatorio,cod_contato)"
  + "VALUES (?,1,?,?)";
		
		PreparedStatement stm;
		try {
			stm=conexao.prepareStatement(sql);
			stm.setLong(1, listRC.getCOD_SETOR());
			stm.setLong(2, listRC.getCOD_RELATORIO());
			stm.setLong(3, listRC.getCOD_CONTATO());
			stm.execute();
			stm.close();
			conexao.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
		public void AlterarPermissao(Permissao perm){
			String sql = "update TCC_PERMISSAO set DESC_PRIVILEGIO = ? where COD_PRIVILEGIO = ?";
			PreparedStatement stm;
			try {
				stm = conexao.prepareStatement(sql);
				stm.setString(1, perm.getDesc_privilegio());
				stm.setLong(2, perm.getCod_privilegio());
				stm.execute();
				stm.close();
				
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
			
			
			
			
			
		}
		
				
		public Permissao buscaPorId(Permissao perm) {

			String sql = "select * from TCC_PERMISSAO where COD_PRIVILEGIO = ?";
			PreparedStatement stm;
			try {
				stm = conexao.prepareStatement(sql);
				stm.setLong(1, perm.getCod_privilegio());
				stm.close();
				conexao.close();
				
				return perm;
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

}
