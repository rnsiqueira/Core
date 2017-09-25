package br.com.alert.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alert.ConnectionFactory;
import br.com.alert.modelo.Execucao;


public class ExecucaoDAO {
	
private Connection conexao;
	
	public ExecucaoDAO(){
		try {
			this.conexao = new ConnectionFactory().getConnection();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	
	public List<Execucao> listaExecucao(){
		try {
			
			List<Execucao> listExec = new ArrayList<Execucao>();
			PreparedStatement stm = conexao.prepareStatement("select * from TCC_EXECUCAO");
			
			ResultSet rs = stm.executeQuery();
			
			while(rs.next()){
				listExec.add(populalistExec(rs));
			}
			
			rs.close();
			stm.close();
			conexao.close();
			
			return listExec;
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		
		
		
	}
	
	public Execucao populalistExec(ResultSet rs) throws SQLException{
		Execucao exec = new Execucao();
		exec.setCod_setor(rs.getLong("cod_setor"));
		exec.setCod_sub_setor(rs.getLong("cod_sub_setor"));
		exec.setCod_relatorio(rs.getLong("cod_relatorio"));
		exec.setInd_ano(rs.getString("ind_ano"));
		exec.setInd_mes(rs.getString("ind_mes"));
		exec.setInd_semana(rs.getString("ind_semana"));
		exec.setExc_dat_inicio(rs.getDate("exc_dat_inicio"));
		exec.setExc_dat_fim(rs.getDate("exc_dat_fim"));
		exec.setExc_mes_01(rs.getString("exc_mes_01"));
		exec.setExc_mes_02(rs.getString("exc_mes_02"));
		exec.setExc_mes_03(rs.getString("exc_mes_03"));
		exec.setExc_mes_04(rs.getString("exc_mes_04"));
		exec.setExc_mes_05(rs.getString("exc_mes_05"));
		exec.setExc_mes_06(rs.getString("exc_mes_06"));
		exec.setExc_mes_07(rs.getString("exc_mes_07"));
		exec.setExc_mes_08(rs.getString("exc_mes_08"));
		exec.setExc_mes_09(rs.getString("exc_mes_09"));
		exec.setExc_mes_10(rs.getString("exc_mes_10"));
		exec.setExc_mes_11(rs.getString("exc_mes_11"));
		exec.setExc_mes_12(rs.getString("exc_mes_12"));
		exec.setExc_dia_01(rs.getString("exc_dia_01"));
		exec.setExc_dia_02(rs.getString("exc_dia_02"));
		exec.setExc_dia_03(rs.getString("exc_dia_03"));
		exec.setExc_dia_04(rs.getString("exc_dia_04"));
		exec.setExc_dia_05(rs.getString("exc_dia_05"));
		exec.setExc_dia_06(rs.getString("exc_dia_06"));
		exec.setExc_dia_07(rs.getString("exc_dia_07"));
		exec.setExc_dia_08(rs.getString("exc_dia_08"));
		exec.setExc_dia_09(rs.getString("exc_dia_09"));
		exec.setExc_dia_10(rs.getString("exc_dia_10"));
		exec.setExc_dia_11(rs.getString("exc_dia_11"));
		exec.setExc_dia_12(rs.getString("exc_dia_12"));
		exec.setExc_dia_13(rs.getString("exc_dia_13"));
		exec.setExc_dia_14(rs.getString("exc_dia_14"));
		exec.setExc_dia_15(rs.getString("exc_dia_15"));
		exec.setExc_dia_16(rs.getString("exc_dia_16"));
		exec.setExc_dia_17(rs.getString("exc_dia_17"));
		exec.setExc_dia_18(rs.getString("exc_dia_18"));
		exec.setExc_dia_19(rs.getString("exc_dia_19"));
		exec.setExc_dia_20(rs.getString("exc_dia_20"));
		exec.setExc_dia_21(rs.getString("exc_dia_21"));
		exec.setExc_dia_22(rs.getString("exc_dia_22"));
		exec.setExc_dia_23(rs.getString("exc_dia_23"));
		exec.setExc_dia_24(rs.getString("exc_dia_24"));
		exec.setExc_dia_25(rs.getString("exc_dia_25"));
		exec.setExc_dia_26(rs.getString("exc_dia_26"));
		exec.setExc_dia_27(rs.getString("exc_dia_27"));
		exec.setExc_dia_28(rs.getString("exc_dia_28"));
		exec.setExc_dia_29(rs.getString("exc_dia_29"));
		exec.setExc_dia_30(rs.getString("exc_dia_30"));
		exec.setExc_dia_31(rs.getString("exc_dia_31"));
		exec.setExc_dom(rs.getString("exc_dom"));
		exec.setExc_seg(rs.getString("exc_seg"));
		exec.setExc_ter(rs.getString("exc_ter"));
		exec.setExc_qua(rs.getString("exc_qua"));
		exec.setExc_qui(rs.getString("exc_qui"));
		exec.setExc_sex(rs.getString("exc_sex"));
		exec.setExc_sab(rs.getString("exc_sab"));
		exec.setExc_hr_00(rs.getString("exc_hr_00"));
		exec.setExc_hr_01(rs.getString("exc_hr_01"));
		exec.setExc_hr_02(rs.getString("exc_hr_02"));
		exec.setExc_hr_03(rs.getString("exc_hr_03"));
		exec.setExc_hr_04(rs.getString("exc_hr_04"));
		exec.setExc_hr_05(rs.getString("exc_hr_05"));
		exec.setExc_hr_06(rs.getString("exc_hr_06"));
		exec.setExc_hr_07(rs.getString("exc_hr_07"));
		exec.setExc_hr_08(rs.getString("exc_hr_08"));
		exec.setExc_hr_09(rs.getString("exc_hr_09"));
		exec.setExc_hr_10(rs.getString("exc_hr_10"));
		exec.setExc_hr_11(rs.getString("exc_hr_11"));
		exec.setExc_hr_12(rs.getString("exc_hr_12"));
		exec.setExc_hr_13(rs.getString("exc_hr_13"));
		exec.setExc_hr_14(rs.getString("exc_hr_14"));
		exec.setExc_hr_15(rs.getString("exc_hr_15"));
		exec.setExc_hr_16(rs.getString("exc_hr_16"));
		exec.setExc_hr_17(rs.getString("exc_hr_17"));
		exec.setExc_hr_18(rs.getString("exc_hr_18"));
		exec.setExc_hr_19(rs.getString("exc_hr_19"));
		exec.setExc_hr_20(rs.getString("exc_hr_20"));
		exec.setExc_hr_21(rs.getString("exc_hr_21"));
		exec.setExc_hr_22(rs.getString("exc_hr_22"));
		exec.setExc_hr_23(rs.getString("exc_hr_23"));
		
		return exec;
				
	}
	
	public void addExecucaoAnual(Execucao exec){
		String sql = "INSERT INTO TCC_EXECUCAO(cod_setor,cod_sub_setor, cod_relatorio, ind_ano, exc_mes_01, exc_mes_02,exc_mes_03, exc_mes_04, exc_mes_05, exc_mes_06," 
+ "exc_mes_07, exc_mes_08, exc_mes_09, exc_mes_10, exc_mes_11,exc_mes_12,exc_dia_01,exc_dia_02, exc_dia_03, exc_dia_04, exc_dia_05, exc_dia_06,exc_dia_07, exc_dia_08, exc_dia_09, exc_dia_10, exc_dia_11, exc_dia_12," 
+ "exc_dia_13, exc_dia_14, exc_dia_15, exc_dia_16, exc_dia_17, exc_dia_18, exc_dia_19, exc_dia_20, exc_dia_21, exc_dia_22, exc_dia_23, exc_dia_24," 
+ "exc_dia_25, exc_dia_26, exc_dia_27, exc_dia_28, exc_dia_29, exc_dia_30,exc_dia_31,exc_hr_00, exc_hr_01, exc_hr_02, exc_hr_03, exc_hr_04, exc_hr_05," 
+ "exc_hr_06, exc_hr_07, exc_hr_08, exc_hr_09, exc_hr_10, exc_hr_11,exc_hr_12, exc_hr_13, exc_hr_14, exc_hr_15, exc_hr_16, exc_hr_17,"
+ "exc_hr_18, exc_hr_19, exc_hr_20,exc_hr_21, exc_hr_22, exc_hr_23) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
+"?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stm;
		try {
			stm=conexao.prepareStatement(sql);
			stm.setLong(1, exec.getCod_setor());
			stm.setLong(2, 1);
			stm.setLong(3, exec.getCod_relatorio());
			stm.setString(4, exec.getInd_ano());
			stm.setString(5, exec.getExc_mes_01());
			stm.setString(6, exec.getExc_mes_02());
			stm.setString(7, exec.getExc_mes_03());
			stm.setString(8, exec.getExc_mes_04());
			stm.setString(9, exec.getExc_mes_05());
			stm.setString(10, exec.getExc_mes_06());
			stm.setString(11, exec.getExc_mes_07());
			stm.setString(12, exec.getExc_mes_08());
			stm.setString(13, exec.getExc_mes_09());
			stm.setString(14, exec.getExc_mes_10());
			stm.setString(15, exec.getExc_mes_11());
			stm.setString(16, exec.getExc_mes_12());
			stm.setString(17, exec.getExc_dia_01());
			stm.setString(18, exec.getExc_dia_02());
			stm.setString(19, exec.getExc_dia_03());
			stm.setString(20, exec.getExc_dia_04());
			stm.setString(21, exec.getExc_dia_05());
			stm.setString(22, exec.getExc_dia_06());
			stm.setString(23, exec.getExc_dia_07());
			stm.setString(24, exec.getExc_dia_08());
			stm.setString(25, exec.getExc_dia_09());
			stm.setString(26, exec.getExc_dia_10());
			stm.setString(27, exec.getExc_dia_11());
			stm.setString(28, exec.getExc_dia_12());
			stm.setString(29, exec.getExc_dia_13());
			stm.setString(30, exec.getExc_dia_14());
			stm.setString(31, exec.getExc_dia_15());
			stm.setString(32, exec.getExc_dia_16());
			stm.setString(33, exec.getExc_dia_17());
			stm.setString(34, exec.getExc_dia_18());
			stm.setString(35, exec.getExc_dia_19());
			stm.setString(36, exec.getExc_dia_20());
			stm.setString(37, exec.getExc_dia_21());
			stm.setString(38, exec.getExc_dia_22());
			stm.setString(39, exec.getExc_dia_23());
			stm.setString(40, exec.getExc_dia_24());
			stm.setString(41, exec.getExc_dia_25());
			stm.setString(42, exec.getExc_dia_26());
			stm.setString(43, exec.getExc_dia_27());
			stm.setString(44, exec.getExc_dia_28());
			stm.setString(45, exec.getExc_dia_29());
			stm.setString(46, exec.getExc_dia_30());
			stm.setString(47, exec.getExc_dia_31());
			stm.setString(48, exec.getExc_hr_00());
			stm.setString(49, exec.getExc_hr_01());
			stm.setString(50, exec.getExc_hr_02());
			stm.setString(51, exec.getExc_hr_03());
			stm.setString(52, exec.getExc_hr_04());
			stm.setString(53, exec.getExc_hr_05());
			stm.setString(54, exec.getExc_hr_06());
			stm.setString(55, exec.getExc_hr_07());
			stm.setString(56, exec.getExc_hr_08());
			stm.setString(57, exec.getExc_hr_09());
			stm.setString(58, exec.getExc_hr_10());
			stm.setString(59, exec.getExc_hr_11());
			stm.setString(60, exec.getExc_hr_12());
			stm.setString(61, exec.getExc_hr_13());
			stm.setString(62, exec.getExc_hr_14());
			stm.setString(63, exec.getExc_hr_15());
			stm.setString(64, exec.getExc_hr_16());
			stm.setString(65, exec.getExc_hr_17());
			stm.setString(66, exec.getExc_hr_18());
			stm.setString(67, exec.getExc_hr_19());
			stm.setString(68, exec.getExc_hr_20());
			stm.setString(69, exec.getExc_hr_21());
			stm.setString(70, exec.getExc_hr_22());
			stm.setString(71, exec.getExc_hr_23());
			stm.execute();
			conexao.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	public void addExecucaoMensal(Execucao exec){
		String sql = "INSERT INTO TCC_EXECUCAO(cod_setor,cod_sub_setor, cod_relatorio,ind_mes,"
+"exc_dia_01,exc_dia_02, exc_dia_03, exc_dia_04, exc_dia_05, exc_dia_06," 
+"exc_dia_07, exc_dia_08, exc_dia_09, exc_dia_10, exc_dia_11, exc_dia_12," 
+"exc_dia_13, exc_dia_14, exc_dia_15, exc_dia_16, exc_dia_17, exc_dia_18," 
+"exc_dia_19, exc_dia_20, exc_dia_21, exc_dia_22, exc_dia_23, exc_dia_24," 
+"exc_dia_25, exc_dia_26, exc_dia_27, exc_dia_28, exc_dia_29, exc_dia_30, exc_dia_31,"
+"exc_hr_00, exc_hr_01, exc_hr_02, exc_hr_03, exc_hr_04, exc_hr_05," 
+"exc_hr_06, exc_hr_07, exc_hr_08, exc_hr_09, exc_hr_10, exc_hr_11," 
+"exc_hr_12, exc_hr_13, exc_hr_14, exc_hr_15, exc_hr_16, exc_hr_17,"
+"exc_hr_18, exc_hr_19, exc_hr_20,exc_hr_21, exc_hr_22, exc_hr_23) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
+"?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stm;
		try {
			stm=conexao.prepareStatement(sql);
			stm.setLong(1, exec.getCod_setor());
			stm.setLong(2, 1);
			stm.setLong(3, exec.getCod_relatorio());
			stm.setString(4, exec.getInd_mes());
			stm.setString(5, exec.getExc_dia_01());
			stm.setString(6, exec.getExc_dia_02());
			stm.setString(7, exec.getExc_dia_03());
			stm.setString(8, exec.getExc_dia_04());
			stm.setString(9, exec.getExc_dia_05());
			stm.setString(10, exec.getExc_dia_06());
			stm.setString(11, exec.getExc_dia_07());
			stm.setString(12, exec.getExc_dia_08());
			stm.setString(13, exec.getExc_dia_09());
			stm.setString(14, exec.getExc_dia_10());
			stm.setString(15, exec.getExc_dia_11());
			stm.setString(15, exec.getExc_dia_12());
			stm.setString(17, exec.getExc_dia_13());
			stm.setString(18, exec.getExc_dia_14());
			stm.setString(19, exec.getExc_dia_15());
			stm.setString(20, exec.getExc_dia_16());
			stm.setString(21, exec.getExc_dia_17());
			stm.setString(22, exec.getExc_dia_18());
			stm.setString(23, exec.getExc_dia_19());
			stm.setString(24, exec.getExc_dia_20());
			stm.setString(25, exec.getExc_dia_21());
			stm.setString(26, exec.getExc_dia_22());
			stm.setString(27, exec.getExc_dia_23());
			stm.setString(28, exec.getExc_dia_24());
			stm.setString(29, exec.getExc_dia_25());
			stm.setString(30, exec.getExc_dia_26());
			stm.setString(31, exec.getExc_dia_27());
			stm.setString(32, exec.getExc_dia_28());
			stm.setString(33, exec.getExc_dia_29());
			stm.setString(34, exec.getExc_dia_30());
			stm.setString(35, exec.getExc_dia_31());
			stm.setString(36, exec.getExc_hr_00());
			stm.setString(37, exec.getExc_hr_01());
			stm.setString(38, exec.getExc_hr_02());
			stm.setString(39, exec.getExc_hr_03());
			stm.setString(40, exec.getExc_hr_04());
			stm.setString(41, exec.getExc_hr_05());
			stm.setString(42, exec.getExc_hr_06());
			stm.setString(43, exec.getExc_hr_07());
			stm.setString(44, exec.getExc_hr_08());
			stm.setString(45, exec.getExc_hr_09());
			stm.setString(46, exec.getExc_hr_10());
			stm.setString(47, exec.getExc_hr_11());
			stm.setString(48, exec.getExc_hr_12());
			stm.setString(49, exec.getExc_hr_13());
			stm.setString(50, exec.getExc_hr_14());
			stm.setString(51, exec.getExc_hr_15());
			stm.setString(52, exec.getExc_hr_16());
			stm.setString(53, exec.getExc_hr_17());
			stm.setString(54, exec.getExc_hr_18());
			stm.setString(55, exec.getExc_hr_19());
			stm.setString(56, exec.getExc_hr_20());
			stm.setString(57, exec.getExc_hr_21());
			stm.setString(58, exec.getExc_hr_22());
			stm.setString(59, exec.getExc_hr_23());
			stm.execute();
			conexao.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	public void addExecucaoSemanal(Execucao exec){
		String sql = "INSERT INTO TCC_EXECUCAO(cod_setor,cod_sub_setor, cod_relatorio,ind_semana,"
+"exc_dom, exc_seg, exc_ter, exc_qua, exc_qui, exc_sex, exc_sab," 
+"exc_hr_00, exc_hr_01, exc_hr_02, exc_hr_03, exc_hr_04, exc_hr_05," 
+"exc_hr_06, exc_hr_07, exc_hr_08, exc_hr_09, exc_hr_10, exc_hr_11," 
+"exc_hr_12, exc_hr_13, exc_hr_14, exc_hr_15, exc_hr_16, exc_hr_17," 
+"exc_hr_18, exc_hr_19, exc_hr_20,exc_hr_21, exc_hr_22, exc_hr_23) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,??,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stm;
		try {
			stm=conexao.prepareStatement(sql);
			stm.setLong(1, exec.getCod_setor());
			stm.setLong(2, 1);
			stm.setLong(3, exec.getCod_relatorio());
			stm.setString(4, exec.getInd_semana());
			stm.setString(5, exec.getExc_dom());
			stm.setString(6, exec.getExc_seg());
			stm.setString(7, exec.getExc_ter());
			stm.setString(8, exec.getExc_qua());
			stm.setString(9, exec.getExc_qui());
			stm.setString(10, exec.getExc_sex());
			stm.setString(11, exec.getExc_sab());
			stm.setString(12, exec.getExc_hr_00());
			stm.setString(13, exec.getExc_hr_01());
			stm.setString(14, exec.getExc_hr_02());
			stm.setString(15, exec.getExc_hr_03());
			stm.setString(16, exec.getExc_hr_04());
			stm.setString(17, exec.getExc_hr_05());
			stm.setString(18, exec.getExc_hr_06());
			stm.setString(19, exec.getExc_hr_07());
			stm.setString(20, exec.getExc_hr_08());
			stm.setString(21, exec.getExc_hr_09());
			stm.setString(22, exec.getExc_hr_10());
			stm.setString(23, exec.getExc_hr_11());
			stm.setString(24, exec.getExc_hr_12());
			stm.setString(25, exec.getExc_hr_13());
			stm.setString(26, exec.getExc_hr_14());
			stm.setString(27, exec.getExc_hr_15());
			stm.setString(28, exec.getExc_hr_16());
			stm.setString(29, exec.getExc_hr_17());
			stm.setString(30, exec.getExc_hr_18());
			stm.setString(31, exec.getExc_hr_19());
			stm.setString(32, exec.getExc_hr_20());
			stm.setString(33, exec.getExc_hr_21());
			stm.setString(34, exec.getExc_hr_22());
			stm.setString(35, exec.getExc_hr_23());
			
			stm.execute();
			conexao.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	
	
	
	public void addAlterHorasSemanal(Execucao exec){
		String sql = "update TCC_EXECUCAO set ind_semana = ?,"
+"exc_dom = ?, exc_seg = ?, exc_ter = ?, exc_qua = ?, exc_qui = ?, exc_sex = ?, exc_sab = ?," 
+"exc_hr_00 = ?, exc_hr_01 = ?, exc_hr_02 = ?, exc_hr_03 = ?, exc_hr_04 = ?, exc_hr_05 = ?," 
+"exc_hr_06 = ?, exc_hr_07 = ?, exc_hr_08 = ?, exc_hr_09 = ?, exc_hr_10 = ?, exc_hr_11 = ?," 
+"exc_hr_12 = ?, exc_hr_13 = ?, exc_hr_14 = ?, exc_hr_15 = ?, exc_hr_16 = ?, exc_hr_17 = ?," 
+"exc_hr_18 = ?, exc_hr_19 = ?, exc_hr_20 = ?,exc_hr_21 = ?, exc_hr_22 = ?, exc_hr_23 = ? where cod_setor = ? and cod_sub_setor = 1 and cod_relatorio = ?";
		PreparedStatement stm;
		try {
			stm=conexao.prepareStatement(sql);
			stm.setString(1, exec.getInd_semana());
			stm.setString(2, exec.getExc_dom());
			stm.setString(3, exec.getExc_seg());
			stm.setString(4, exec.getExc_ter());
			stm.setString(5, exec.getExc_qua());
			stm.setString(6, exec.getExc_qui());
			stm.setString(7, exec.getExc_sex());
			stm.setString(8, exec.getExc_sab());
			stm.setString(9, exec.getExc_hr_00());
			stm.setString(10, exec.getExc_hr_01());
			stm.setString(11, exec.getExc_hr_02());
			stm.setString(12, exec.getExc_hr_03());
			stm.setString(13, exec.getExc_hr_04());
			stm.setString(14, exec.getExc_hr_05());
			stm.setString(15, exec.getExc_hr_06());
			stm.setString(16, exec.getExc_hr_07());
			stm.setString(17, exec.getExc_hr_08());
			stm.setString(18, exec.getExc_hr_09());
			stm.setString(19, exec.getExc_hr_10());
			stm.setString(20, exec.getExc_hr_11());
			stm.setString(21, exec.getExc_hr_12());
			stm.setString(22, exec.getExc_hr_13());
			stm.setString(23, exec.getExc_hr_14());
			stm.setString(24, exec.getExc_hr_15());
			stm.setString(25, exec.getExc_hr_16());
			stm.setString(26, exec.getExc_hr_17());
			stm.setString(27, exec.getExc_hr_18());
			stm.setString(28, exec.getExc_hr_19());
			stm.setString(29, exec.getExc_hr_20());
			stm.setString(30, exec.getExc_hr_21());
			stm.setString(31, exec.getExc_hr_22());
			stm.setString(32, exec.getExc_hr_23());
			stm.setLong(33, exec.getCod_setor());
			stm.setLong(34, exec.getCod_relatorio());
			
			stm.execute();
			stm.close();
			conexao.commit();
			conexao.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	
	public void addExecucaoPeriodo(Execucao exec){
		String sql = "INSERT INTO TCC_EXECUCAO(cod_setor,cod_sub_setor, cod_relatorio,"
 + "exc_dat_inicio, exc_dat_fim,"
 + "exc_dom, exc_seg, exc_ter, exc_qua, exc_qui, exc_sex, exc_sab," 
 + "exc_hr_00, exc_hr_01, exc_hr_02, exc_hr_03, exc_hr_04, exc_hr_05," 
 + "exc_hr_06, exc_hr_07, exc_hr_08, exc_hr_09, exc_hr_10, exc_hr_11," 
 + "exc_hr_12, exc_hr_13, exc_hr_14, exc_hr_15, exc_hr_16, exc_hr_17,"
 + "exc_hr_18, exc_hr_19, exc_hr_20,exc_hr_21, exc_hr_22, exc_hr_23) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stm;
		try {
			stm=conexao.prepareStatement(sql);
			stm.setLong(1, exec.getCod_setor());
			stm.setLong(2, exec.getCod_sub_setor());
			stm.setLong(3, exec.getCod_relatorio());
			stm.setDate(4, exec.getExc_dat_inicio());
			stm.setDate(5, exec.getExc_dat_fim());
			stm.setString(6, exec.getExc_dom());
			stm.setString(7, exec.getExc_seg());
			stm.setString(8, exec.getExc_ter());
			stm.setString(9, exec.getExc_qua());
			stm.setString(10, exec.getExc_qui());
			stm.setString(11, exec.getExc_sex());
			stm.setString(12, exec.getExc_sab());
			stm.setString(13, exec.getExc_hr_00());
			stm.setString(14, exec.getExc_hr_01());
			stm.setString(15, exec.getExc_hr_02());
			stm.setString(16, exec.getExc_hr_03());
			stm.setString(17, exec.getExc_hr_04());
			stm.setString(18, exec.getExc_hr_05());
			stm.setString(19, exec.getExc_hr_06());
			stm.setString(20, exec.getExc_hr_07());
			stm.setString(21, exec.getExc_hr_08());
			stm.setString(22, exec.getExc_hr_09());
			stm.setString(23, exec.getExc_hr_10());
			stm.setString(24, exec.getExc_hr_11());
			stm.setString(25, exec.getExc_hr_12());
			stm.setString(26, exec.getExc_hr_13());
			stm.setString(27, exec.getExc_hr_14());
			stm.setString(28, exec.getExc_hr_15());
			stm.setString(29, exec.getExc_hr_16());
			stm.setString(30, exec.getExc_hr_17());
			stm.setString(31, exec.getExc_hr_18());
			stm.setString(32, exec.getExc_hr_19());
			stm.setString(33, exec.getExc_hr_20());
			stm.setString(34, exec.getExc_hr_21());
			stm.setString(35, exec.getExc_hr_22());
			stm.setString(36, exec.getExc_hr_23());
		
			stm.execute();
			conexao.close();
			}
		catch (SQLException e) {
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}

		/*public void AlterarPermissao(Permissao perm){
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
		}*/

}
