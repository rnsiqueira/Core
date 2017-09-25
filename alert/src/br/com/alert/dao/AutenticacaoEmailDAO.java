package br.com.alert.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alert.ConnectionFactory;
import br.com.alert.modelo.AutenticacaoEmail;


public class AutenticacaoEmailDAO {
	
	private Connection conexao;
	
	
	public AutenticacaoEmailDAO(){
		
		try {
			this.conexao = new ConnectionFactory().getConnection();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	public List<AutenticacaoEmail> listaAutenticaEmail(){
		try {
			
			List<AutenticacaoEmail> listAutEmail = new ArrayList<AutenticacaoEmail>();
			PreparedStatement stm = conexao.prepareStatement("select * from TCC_autenticacao_EMAIL");
			
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()){
				listAutEmail.add(populalistaAutenticaEmail(rs));
			}
			
			rs.close();
			stm.close();
			conexao.close();
			
			return listAutEmail;
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		
		
		
	}
	
	public AutenticacaoEmail populalistaAutenticaEmail(ResultSet rs) throws SQLException{
		AutenticacaoEmail emails = new AutenticacaoEmail();
		emails.setCod_autenticacao(rs.getLong("cod_autenticacao"));
		emails.setAut_usuario(rs.getString("aut_usuario"));
		emails.setAut_senha(rs.getString("aut_senha"));
		emails.setEmail_host(rs.getString("email_host"));
		emails.setEmail_porta(rs.getString("email_porta"));
		
		return emails;
				
	}
	
	public void addAutenticaEmail(AutenticacaoEmail user){
		String sql = "insert into TCC_autenticacao_EMAIL (cod_autenticacao,aut_usuario,aut_senha,email_host,email_porta) "
				+ "values (?,?,?,?,?)";
		PreparedStatement stm;
		try {
			stm = conexao.prepareStatement(sql);
			stm.setLong(1, user.getCod_autenticacao());
			stm.setString(2, user.getAut_usuario());
			stm.setString(3, user.getAut_senha());
			stm.setString(4, user.getEmail_host());
			stm.setString(5, user.getEmail_porta());
			stm.execute();
			conexao.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
		public void removUserEmail(AutenticacaoEmail user){
			String sql = "delete from TCC_autenticacao_EMAIL where cod_autenticacao = ?";
			PreparedStatement stm;
			try {
				stm = conexao.prepareStatement(sql);
				stm.setLong(1, user.getCod_autenticacao());
				stm.execute();
				stm.close();
				
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
			
			
			
			
			
		}
		
		public void alterUserEmail(AutenticacaoEmail user){
			String sql = "UPDATE TCC_AUTENTICACAO_EMAIL SET AUT_USUARIO = ?, AUT_SENHA   = ?, EMAIL_HOST  = ?, EMAIL_PORTA = ? WHERE COD_AUTENTICACAO = ?";
			PreparedStatement stm;
			try {
				stm = conexao.prepareStatement(sql);
				stm.setString(1, user.getAut_usuario());
				stm.setString(2, user.getAut_senha());
				stm.setString(3, user.getEmail_host());
				stm.setString(4, user.getEmail_porta());
				stm.setLong(5, user.getCod_autenticacao());
				stm.execute();
				stm.close();
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
		}
		
		public AutenticacaoEmail buscaPorId(AutenticacaoEmail user) {

			String sql = "select * from TCC_AUTENTICACAO_EMAIL where COD_AUTENTICACAO = ?";
			PreparedStatement stm;
			try {
				stm = conexao.prepareStatement(sql);
				stm.setLong(1, user.getCod_autenticacao());
				stm.close();
				conexao.close();
				
				return user;
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}


