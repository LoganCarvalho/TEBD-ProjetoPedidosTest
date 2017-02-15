
package DAO;
import java.sql.*;

/**
 *
 * @author Logan
 */
public class BDjdbc extends BD implements java.io.Serializable {
    
  static BDjdbc bdjdbc= new BDjdbc();

  private String dataSource;


  public BDjdbc() {
    
  }
  
  public void setDataSource(String dataSource){
  	this.dataSource = dataSource;
  }

  /**
  * MÈtodo responsavel por fazer a conexao com o
  * Banco atraves de um driver JDBC e do objeto
  * conn.
  *
  * @throws Exception Contendo a descriÁ„o do erro
  * que poder· vir acontecer se houver algum problema
  * na conexao com o Banco de Dados.
  */
  
  public void setConexao() throws Exception {
      try {
              String driver = "com.mysql.jdbc.Driver";
              String usuario = "root";
              String senha = "";
    	      String url = "jdbc:mysql://localhost";
              
 	      Class.forName(driver);
	
 	      this.conn = DriverManager.getConnection(url, usuario, senha);
 		 
          conn.setAutoCommit(false);
       }catch (SQLException | ClassNotFoundException e){
           System.out.println("erro, verifique se o driver foi incluido como biblioteca do projeto ou procure o administrador do sistema.");
           throw new RuntimeException(e);
      }
  }
  
    /**
  * MÈtodo que pega o objeto Conn que contem a
  * conexao com Banco de Dados.
  *
  * @return Connection Objeto que encapsula
  * metodos para conexao com o Banco de Dados.
  */
  
    public String toString (){
         return "Login = " + this.login + " Senha = " + this.senha;

}
    
    public static void main(String args[])throws Exception {
	
     
              String driver = "com.mysql.jdbc.Driver";
              String usuario = "root";
              String senha = "";
    	      String url = "jdbc:mysql://localhost";
		 
        	Class.forName(driver);
	
    		 Connection c= DriverManager.getConnection(url, usuario, senha);
    		 System.out.println(c.getCatalog());	
    }
    
    
}
