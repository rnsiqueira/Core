package br.com.alert.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alert.ConnectionFactory;
import br.com.alert.modelo.Permissao;

public class PermissaoDAO {
	
private Connection conexao;
	
	public PermissaoDAO(){
		try {
			this.conexao = new ConnectionFactory().getConnection();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	
	public List<Permissao> listaPermissao(){
		try {
			
			List<Permissao> listPerm = new ArrayList<Permissao>();
			PreparedStatement stm = conexao.prepareStatement("select * from TCC_PERMISSAO");
			
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()){
				listPerm.add(populalistPerm(rs));
			}
			
			rs.close();
			stm.close();
			conexao.close();
			
			return listPerm;
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		
		
		
	}
	
	public Permissao populalistPerm(ResultSet rs) throws SQLException{
		Permissao perm = new Permissao();
		perm.setCod_privilegio(rs.getLong("cod_privilegio"));
		perm.setDesc_privilegio(rs.getString("desc_privilegio"));
		
		return perm;
				
	}
	
	public void addPermissao(Permissao perm){
		String sql = "INSERT INTO TCC_PERMISSAO(COD_PRIVILEGIO,DESC_PRIVILEGIO) "
				+ "VALUES ((select nvl( max(COD_PRIVILEGIO),0) + 1 from TCC_PERMISSAO),?)";
		
		PreparedStatement stm;
		try {
			stm=conexao.prepareStatement(sql);
			stm.setString(1, perm.getDesc_privilegio());
			
			stm.execute();
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
