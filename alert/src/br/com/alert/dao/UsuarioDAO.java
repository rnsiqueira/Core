
package br.com.alert.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alert.ConnectionFactory;
import br.com.alert.modelo.Usuario;

public class UsuarioDAO {
	private Connection connection;

	public UsuarioDAO() {
		try {
			connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean existeUsuario(Usuario usuario) {

		if (usuario == null) {
			throw new IllegalArgumentException("Usuario nao deve ser nulo");
		}

		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from TCC_CONTATOS where NOME_CONTATO = ? and to_char(SENHA_CONTATO) = ?");
			stmt.setString(1, usuario.getNOME_CONTATO());
			stmt.setString(2, usuario.getSENHA_CONTATO());
			ResultSet rs = stmt.executeQuery();

			boolean encontrado = rs.next();
			rs.close();
			stmt.close();

			connection.close();

			return encontrado;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void insereUsuario(Usuario usuario) {
		if (usuario == null) {
			throw new IllegalArgumentException("Usuario nao deve ser nulo");
		}

		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("insert into TCC_CONTATOS (COD_CONTATO, NOME_CONTATO, EMAIL_CONTATO, SENHA_CONTATO, NROCEL_CONTATO, COD_PRIVILEGIO, IND_ATIVO)"
							+ " values ((select nvl( max(COD_CONTATO),0) + 1 from TCC_CONTATOS),?,?,?,?,?,?)");

			stmt.setString(1, usuario.getNOME_CONTATO());
			stmt.setString(2, usuario.getEMAIL_CONTATO());
			stmt.setString(3, usuario.getSENHA_CONTATO());
			stmt.setString(4, usuario.getNROCEL_CONTATO());
			stmt.setLong(5, usuario.getCOD_PRIVILEGIO());
			stmt.setString(6, usuario.getIND_ATIVO());
			stmt.execute();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void removeUsuario(Usuario user) {
		String sql = "delete from TCC_CONTATOS where COD_CONTATO = ? and COD_CONTATO <> 1";
		PreparedStatement stm;
		try {
			stm = connection.prepareStatement(sql);
			stm.setLong(1, user.getCOD_CONTATO());
			stm.execute();
			stm.close();
			connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}

	public void alterarUsuario(Usuario user) {
		String sql = "update TCC_CONTATOS set NOME_CONTATO = ?, EMAIL_CONTATO = ?, SENHA_CONTATO = ?, NROCEL_CONTATO = ?, IND_ATIVO = ?, COD_PRIVILEGIO = ?"
				+ "  where COD_CONTATO = ?";
		PreparedStatement stm;
		try {
			stm = connection.prepareStatement(sql);
			stm.setString(1, user.getNOME_CONTATO());
			stm.setString(2, user.getEMAIL_CONTATO());
			stm.setString(3, user.getSENHA_CONTATO());
			stm.setString(4, user.getNROCEL_CONTATO());
			stm.setString(5, user.getIND_ATIVO());
			stm.setLong(6, user.getCOD_PRIVILEGIO());
			stm.setLong(7, user.getCOD_CONTATO());
			stm.execute();
			stm.close();
			connection.commit();
			connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}

	public List<Usuario> contatoList() {
		try {
			List<Usuario> contatos = new ArrayList<Usuario>();
			PreparedStatement stm = this.connection
					.prepareStatement("select * from TCC_CONTATOS");

			ResultSet rs = stm.executeQuery();

			while (rs.next()) {

				contatos.add(populaContatos(rs));
			}

			rs.close();
			stm.close();
			connection.close();

			return contatos;

		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}

	}

	public Usuario populaContatos(ResultSet rs) throws SQLException {

		Usuario contato = new Usuario();

		contato.setCOD_CONTATO(rs.getLong("COD_CONTATO"));
		contato.setNOME_CONTATO(rs.getString("NOME_CONTATO"));
		contato.setEMAIL_CONTATO(rs.getString("EMAIL_CONTATO"));
		contato.setSENHA_CONTATO(rs.getString("SENHA_CONTATO"));
		contato.setNROCEL_CONTATO(rs.getString("NROCEL_CONTATO"));
		contato.setCOD_PRIVILEGIO(rs.getLong("COD_PRIVILEGIO"));
		contato.setIND_ATIVO(rs.getString("IND_ATIVO"));

		return contato;

	}

	public Usuario buscaPorId(Usuario user) {

		System.out.println(user.getNOME_CONTATO());

		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from TCC_CONTATOS where COD_CONTATO = ?");
			stmt.setLong(1, user.getCOD_CONTATO());
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return populaContatos(rs);
			}

			rs.close();
			stmt.close();

			return null;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	
	
	
}
