package br.com.alert.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alert.ConnectionFactory;
import br.com.alert.modelo.Setor;



public class SetorDAO {
	
	private Connection conexao;
	
	public SetorDAO(){
		try {
			this.conexao = new ConnectionFactory().getConnection();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	
	public List<Setor> listaSetor(){
		try {
			
			List<Setor> listSetor = new ArrayList<Setor>();
			PreparedStatement stm = conexao.prepareStatement("select * from TCC_SETOR");
			
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()){
				listSetor.add(populalistSetor(rs));
			}
			
			rs.close();
			stm.close();
			conexao.close();
			
			return listSetor;
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		
		
		
	}
	
	public Setor populalistSetor(ResultSet rs) throws SQLException{
		Setor setores = new Setor();
		setores.setCod_setor(rs.getLong("cod_setor"));
		setores.setCod_sub_setor(rs.getLong("cod_sub_setor"));
		setores.setNom_setor(rs.getString("nom_setor"));
		setores.setNom_setor_reduzido(rs.getString("nom_setor_reduzido"));
		setores.setUrl_link(rs.getString("url_link"));
		setores.setUrl_imagem(rs.getString("url_imagem"));
		setores.setInd_ativo(rs.getString("ind_ativo"));

		return setores;
				
	}
	
	public void addSetor(Setor setor){
		String sql = "INSERT INTO TCC_SETOR (cod_setor, cod_sub_setor, nom_setor, nom_setor_reduzido, url_link, url_imagem, ind_ativo) values((select nvl( max(cod_setor),0) + 1 from tcc_setor),1,?,?,?,?,?)";
		
		PreparedStatement stm;
		try {
			stm = conexao.prepareStatement(sql);
			stm.setString(1, setor.getNom_setor());
			stm.setString(2, setor.getNom_setor_reduzido());
			stm.setString(3, setor.getUrl_link());
			stm.setString(4, setor.getUrl_imagem());
			stm.setString(5, setor.getInd_ativo());
			
			stm.execute();
			stm.close();
			conexao.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
		public void inativoSetor(Setor setor){
			String sql = "update TCC_SETOR set ind_ativo = decode(ind_ativo,'S','N','S') where cod_setor = ?";
			PreparedStatement stm;
			try {
				stm = conexao.prepareStatement(sql);
				stm.setLong(1, setor.getCod_setor());
				stm.execute();
				stm.close();
				conexao.commit();
				conexao.close();
				
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
			
			
			
			
			
		}
		
		public void alterSetor(Setor setor){
			System.out.println(setor.getCod_setor());
			
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
				conexao.commit();
				conexao.close();
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
		}
		
		public Setor buscaPorId(Setor setor) {
			System.out.println(setor.getCod_setor());
			
			try {
				PreparedStatement stmt = this.conexao.prepareStatement("select * from TCC_SETOR where cod_setor = ? "
						+ "and cod_sub_setor = 1");
				stmt.setLong(1, setor.getCod_setor());
				ResultSet rs = stmt.executeQuery();
				
				if (rs.next()) {
					return populalistSetor(rs);
				}

				rs.close();
				stmt.close();
				

				
				return null;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
				
		
		
}
