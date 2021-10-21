package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.CustomerDTO;
import dto.OrderDetailDTO;
import util.DbUtil;

public class CustomerDAOImpl implements CustomerDAO {
	Properties proFile = new Properties();
	
    public CustomerDAOImpl() {
    	try {
    	//proFile에 외보 ~.properties 파일을 로딩한다.
        //proFile.load(new FileInputStream("src/...."));
    	
    	//현 프로젝트 런타임될 때 즉, 서버에서 실행될 때 classes폴더를 동적으로 가져와서 경로를 설정해야한다.
    		proFile.load(getClass().getClassLoader().getResourceAsStream("customer_sql.properties"));
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	@Override
	public CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = proFile.getProperty("customer.login");
		CustomerDTO dbDTO = null;
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, customerDTO.getCustomerId());
			ps.setString(2, customerDTO.getCustomerPwd());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dbDTO = new CustomerDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getString(7), rs.getString(8), rs.getString(9));
			}			
		}finally {
			DbUtil.dbClose(rs, ps,con);
		}
		
		return dbDTO;
	}

	@Override
	public int signUpCustomer(CustomerDTO customerDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("customer.signup");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, customerDTO.getCustomerId());
			ps.setString(2, customerDTO.getCustomerPwd());
			ps.setString(3, customerDTO.getCustomerName());
			ps.setString(4, customerDTO.getCustomerBirth());
			ps.setString(5, customerDTO.getCustomerEmail());
			ps.setString(6, customerDTO.getCustomerAddr());
			ps.setString(7, customerDTO.getCustomerContact());
			result = ps.executeUpdate();		
		}finally {
			DbUtil.dbClose(ps,con);
		}
		
		return result;
	}

	@Override
	public String searchIdCustomer(String name, String email) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = proFile.getProperty("customer.searchid");
		String result = null;
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = rs.getString(1);
			}			
		}finally {
			DbUtil.dbClose(rs, ps,con);
		}
		
		return result;
	}
    
	
	//비밀번호 설정을 위한 것
	@Override
	public int checkIdAndEmail(String id, String email) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = proFile.getProperty("customer.checkidandemail");
		int result = 0;
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, email);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = 1;
			}			
		}finally {
			DbUtil.dbClose(rs, ps,con);
		}
		
		return result;
	}

	

	@Override
	public int setPwd(String id, String pwd) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("customer.setpwd");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, pwd);
			ps.setString(2, id);
			result = ps.executeUpdate();		
		}finally {
			DbUtil.dbClose(ps,con);
		}
		
		return result;
	}
    
	@Override
	public boolean idCheck(String id) throws SQLException{
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  boolean result=false;
		  String sql = proFile.getProperty("customer.idcheck");

		  try {
		   con=DbUtil.getConnection();
		   ps = con.prepareStatement(sql);
		   ps.setString(1, id);
		   rs = ps.executeQuery();
		   if(rs.next()){
		    result=true;
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }finally {
		   DbUtil.dbClose(rs, ps, con);
		  }
		  return result;
	}
	
	@Override
	public boolean emailCheck(String email) throws SQLException{
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  boolean result=false;
		  String sql = proFile.getProperty("customer.emailcheck");

		  try {
		   con=DbUtil.getConnection();
		   ps = con.prepareStatement(sql);
		   ps.setString(1, email);
		   rs = ps.executeQuery();
		   if(rs.next()){
		    result=true;
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }finally {
		   DbUtil.dbClose(rs, ps, con);
		  }
		  return result;
	}

	@Override
	public boolean contactCheck(String contact) throws SQLException{
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  boolean result=false;
		  String sql = proFile.getProperty("customer.contactcheck");

		  try {
		   con=DbUtil.getConnection();
		   ps = con.prepareStatement(sql);
		   ps.setString(1, contact);
		   rs = ps.executeQuery();
		   if(rs.next()){
		    result=true;
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }finally {
		   DbUtil.dbClose(rs, ps, con);
		  }
		  return result;
	}

	@Override
	public int checkPwd(String id, String pwd) throws SQLException{
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  int result=0;
		  String sql = proFile.getProperty("customer.pwdcheck");

		  try {
		   con=DbUtil.getConnection();
		   ps = con.prepareStatement(sql);
		   ps.setString(1, id);
		   ps.setString(2, pwd);
		   rs = ps.executeQuery();
		   if(rs.next()){
		    result=1;
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }finally {
		   DbUtil.dbClose(rs, ps, con);
		  }
		  return result;
	}

	@Override
	public List<OrderDetailDTO> selectOrderDetailByCustomerNo(int customerNo) throws SQLException {
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  List<OrderDetailDTO> result = new ArrayList<OrderDetailDTO>();
		  String sql = proFile.getProperty("customer.selectorderdetail");

		  try {
			   con=DbUtil.getConnection();
			   ps = con.prepareStatement(sql);
			   ps.setInt(1, customerNo);
			   rs = ps.executeQuery();
			   while(rs.next()){
			       OrderDetailDTO detailDTO = new OrderDetailDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
			       result.add(detailDTO);
			   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }finally {
		   DbUtil.dbClose(rs, ps, con);
		  }
		  return result;
	}
	
	
	

}
