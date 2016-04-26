import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.unipe.mlpiii.conta.modelo.Conta;

public class Principal {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");

			String url = "jdbc:postgresql://localhost:1521/bancario";
			String login = "postgres";
			String senha = "123456";

			Connection con = DriverManager.getConnection(url, login, senha);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM CONTA");
			
			List<Conta> contas = new ArrayList<Conta>();
			
			while (rs.next()) {
				
				Conta c1 = new Conta();
				
				int id = rs.getInt("id");
				c1.setId(id);
				
				String numero = rs.getString("numero");
				c1.setNumero(numero);
				
				double saldo = rs.getDouble("saldo");
				c1.setSaldo(saldo);
				
				boolean status = rs.getBoolean("status");
				c1.setStatus(status);
				
				String titular = rs.getString("titular");
				c1.setTitular(titular);
				
				contas.add(c1);
				

			}
			
			for (Conta c1 : contas )
				System.out.println("Contas"+ c1);
			
			
			rs.close();
			st.close();
			con.close();
			
		} catch (SQLException e) {
		} catch (ClassNotFoundException e) {

		}

	}

	{
	}

}
