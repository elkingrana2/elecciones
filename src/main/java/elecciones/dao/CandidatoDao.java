package elecciones.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import elecciones.dto.Candidato;
import elecciones.util.ConexionPostgreSQL;

public class CandidatoDao  {
	private ConexionPostgreSQL conexion;
	
	private static final String INSERT_candidato_SQL ="INSERT INTO candidato (name) VALUES (?)";
	private static final String DELETE_candidato_SQL ="DELETE FROM candidato WHERE id = ?;";
	private static final String UPDATE_candidato_SQL ="UPDATE candidato SET id = ? , SET name = ? WHERE id = ?;";
	private static final String SELECT_candidato_BY_ID ="SELECT * FROM candidato WHERE id = ?;";
	private static final String SELECT_ALL_candidatos ="SELECT * FROM candidato;";
	
	public CandidatoDao()
	{
		this.conexion = ConexionPostgreSQL.getConexion();
	}
	
	public void insert(Candidato candidato) throws SQLException
	{
		try {
			PreparedStatement preparedStatement = conexion.setprePreparedStatement(INSERT_candidato_SQL);
			preparedStatement.setString(1, candidato.getNombre());
			conexion.excecute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void delete(String id) throws SQLException
	{
		try {
			PreparedStatement preparedStatement = conexion.setprePreparedStatement(DELETE_candidato_SQL);
			preparedStatement.setString(1, id);
			conexion.excecute();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void update(Candidato country) throws SQLException
	{
		try {
			PreparedStatement preparedStatement = conexion.setprePreparedStatement(UPDATE_candidato_SQL);
			preparedStatement.setString(1, country.getNombre());
			preparedStatement.setString(2, country.getId());
			conexion.excecute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public List<Candidato> selectAll()
	{
		List <Candidato> paises = new ArrayList<>();
		
		try {
			PreparedStatement preparedStatement = conexion.setprePreparedStatement(SELECT_ALL_candidatos);
			
			ResultSet rs = conexion.query();
			
			while(rs.next())
			{
				String id = rs.getString("id");
				String name = rs.getString("name");
				paises.add(new Candidato(1, name, name, id, 0, 0));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return paises;
		
	}
	
	public Candidato select(String id)
	{
		Candidato pais = null;
		
		try {
			PreparedStatement preparedStatement = conexion.setprePreparedStatement(SELECT_candidato_BY_ID);
			preparedStatement.setString(1, id);
			ResultSet rs = conexion.query();
			
			while(rs.next())
			{
				String name = rs.getString("name");
				pais = new Candidato(1, name, name, id, 0, 0);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return pais;
		
	}

	
	
	
	
}	
