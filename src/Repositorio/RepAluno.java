package Repositorio;

import com.mysql.jdbc.MySQLConnection;
import conn.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class RepAluno {
    
    Connection con;

    public boolean inserir(Aluno aluno){
        
        con = ConexaoMySql.getConexao(); 
        
        String sql = "insert into aluno (nome,"
                 + "cpf,telefone,endereco,bairro,numero,cidade) values "
                 + "(?,?,?,?,?,?,?)";
         try{
             con.setAutoCommit(false);
             PreparedStatement stmt = con.prepareStatement(sql);
             
             stmt.setString(1, aluno.getNome());
             stmt.setString(2, aluno.getCpf());
             stmt.setString(3, aluno.getTelefone());
             stmt.setString(4, aluno.getEndereco());
             stmt.setString(5, aluno.getBairro());
             stmt.setString(6, aluno.getNumero());
             stmt.setString(7, aluno.getCidade());
             
             stmt.execute();
             con.commit();
             ConexaoMySql.fecharConexao();
             
            return true;
         }catch(Exception ex){
             try{
                 con.rollback();
                 System.err.println(ex.getMessage());
                 return false;
             }catch(SQLException exSql){
                 System.err.println(exSql.getMessage());
             }
         }
         
       return true;
    }
    
  public List<Aluno> retornar(){
      
      con = ConexaoMySql.getConexao();
      List<Aluno> alunos = new ArrayList<>();
      
      String sql = "select * from aluno order by id desc";
      
      try{
          Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
          while(rs.next()){
              
              Aluno aluno = new Aluno();
              
              aluno.setId(rs.getInt("id"));
              aluno.setNome(rs.getString("nome"));
              aluno.setCpf(rs.getString("cpf"));
              aluno.setTelefone(rs.getString("telefone"));
              aluno.setEndereco(rs.getString("endereco"));
              aluno.setBairro(rs.getString("bairro"));
              aluno.setNumero(rs.getString("numero"));
              aluno.setCidade(rs.getString("cidade"));
              
              alunos.add(aluno);
          }            
      }catch(SQLException ex){
          return null;
      }
      
      ConexaoMySql.fecharConexao();
      
      return alunos;
  }  
  
      public boolean atualizar(Aluno aluno) {

        con = ConexaoMySql.getConexao();
        String sql = "update aluno set nome = ?, "
                + "cpf = ?,telefone = ?, endereco = ?,bairro = ?,numero = ?,cidade = ? where id = ?";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getTelefone());
            stmt.setString(4, aluno.getEndereco());
            stmt.setString(5, aluno.getBairro());
            stmt.setString(6, aluno.getNumero());
            stmt.setString(7, aluno.getCidade());
            stmt.setInt(8, aluno.getId());
             
            stmt.execute();

            con.commit();
            ConexaoMySql.fecharConexao();

            return true;

        } catch (SQLException ex) {
            try {
                con.rollback();
                System.err.println(ex);
                return false;
            } catch (SQLException ex1) {
                System.err.println(ex1);
            }

            return false;
        }

    }  
  
  public List<Aluno> pesquisar(String valor, String tipoPesquisa){
      
      con = ConexaoMySql.getConexao();
      List<Aluno> alunos = new ArrayList<>();
      
      String sql = ""; 
      
       if(tipoPesquisa.equals("nome")){
       sql = "select * from aluno where nome like '%"+valor+"%'";
      }else if(tipoPesquisa.equals("cpf")){
       sql = "select * from aluno where cpf = '"+valor+"'";
      }
      
      try{
          Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
          while(rs.next()){
              
              Aluno aluno = new Aluno();
              
              aluno.setId(rs.getInt("id"));
              aluno.setNome(rs.getString("nome"));
              aluno.setCpf(rs.getString("cpf"));
              aluno.setTelefone(rs.getString("telefone"));
              aluno.setEndereco(rs.getString("endereco"));
              aluno.setBairro(rs.getString("bairro"));
              aluno.setNumero(rs.getString("numero"));
              aluno.setCidade(rs.getString("cidade"));
              
              alunos.add(aluno);
          }            
      }catch(SQLException ex){
          return null;
      }
      
      ConexaoMySql.fecharConexao();
      
      return alunos;
  }  
    
  
  public boolean excluir(int id){
      
      con = ConexaoMySql.getConexao();
      String sql = "delete from aluno where id = ?";
      
      try{
          
          con.setAutoCommit(false);
          PreparedStatement stmt = con.prepareStatement(sql);
          
          stmt.setInt(1, id);
          
          stmt.execute();
          con.commit();
          ConexaoMySql.fecharConexao();
      
          return true;   
      }catch(SQLException ex){
          
          return false;
      }
        
  }
  
      
}
