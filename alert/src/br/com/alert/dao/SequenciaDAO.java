package br.com.alert.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alert.ConnectionFactory;
import br.com.alert.modelo.Sequencia;

public class SequenciaDAO {
	
		
		private Connection conexao;
		
		public SequenciaDAO(){
			try {
				this.conexao = new ConnectionFactory().getConnection();
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
		}
		
		
		public List<Sequencia> listaSequencia(){
			try {
				
				List<Sequencia> listSeq = new ArrayList<Sequencia>();
				PreparedStatement stm = conexao.prepareStatement("select * from TCC_SETOR");
				
				ResultSet rs = stm.executeQuery();
				
				while(rs.next()){
					listSeq.add(populalistSequecia(rs));
				}
				
				rs.close();
				stm.close();
				conexao.close();
				
				return listSeq;
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
			
			
			
		}
		
		public Sequencia populalistSequecia(ResultSet rs) throws SQLException{
			Sequencia seq = new Sequencia();
			
			seq.setNOM_SEQUENCIA(rs.getString("NOM_SEQUENCIA"));
			seq.setNRO_SEQUENCIA(rs.getLong("NRO_SEQUENCIA"));
			

			return seq;
					
		}
		
		public void addSequencia(Sequencia seq){
			String sql = "INSERT INTO TCC_SEQUENCIA (NOM_SEQUENCIA,NRO_SEQUENCIA) values(?,(select nvl( max(NRO_SEQUENCIA),0) + 1 from TCC_SEQUENCIA))";
			
			PreparedStatement stm;
			try {
				stm = conexao.prepareStatement(sql);
				stm.setString(1, seq.getNOM_SEQUENCIA());
				
				stm.execute();
				conexao.close();
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
		}
			/*public void inativoSetor(Setor setor){
				String sql = "update TCC_SETOR set and_ativo = ? where COD_SETOR = ?";
				PreparedStatement stm;
				try {
					stm = conexao.prepareStatement(sql);
					stm.setString(1, setor.getInd_ativo());
					stm.setLong(2, setor.getCod_setor());
					stm.execute();
					stm.close();
					
					
				} catch (SQLException e) {
					throw new RuntimeException(e);
					// TODO: handle exception
				}
				
				
				
				
				
			}
			
			public void alterSetor(Sequencia seq){
				String sql = "UPDATE TCC_SETOR SET NOM_SETOR = ?,NOM_SETOR_REDUZIDO = ?,URL_LINK = ?, URL_IMAGEM = ? WHERE COD_SETOR = ?";
				PreparedStatement stm;
				try {
					stm = conexao.prepareStatement(sql);
					stm.setString(1, setor.getNom_setor());
					stm.setString(2, setor.getNom_setor_reduzido());
					stm.setString(3, setor.getUrl_link());
					stm.setString(4, setor.getUrl_imagem());
					stm.setLong(5, setor.getCod_setor());
					stm.execute();
					stm.close();
					
				} catch (SQLException e) {
					throw new RuntimeException(e);
					// TODO: handle exception
				}
			}
			
			public Setor buscaPorId(Setor user) {

				String sql = "select * from TCC_SETOR where COD_SETOR = ?";
				PreparedStatement stm;
				try {
					stm = conexao.prepareStatement(sql);
					stm.setLong(1, user.getCod_setor());
					stm.close();
					conexao.close();
					
					return user;
					
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}*/
		
}



