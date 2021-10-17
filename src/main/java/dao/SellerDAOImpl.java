package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import dto.SellerDTO;
import util.DbUtil;

public class SellerDAOImpl implements SellerDAO {

	Properties proFile = new Properties();
	
    public SellerDAOImpl() {
    	try {
    	//proFile에 외보 ~.properties 파일을 로딩한다.
        //proFile.load(new FileInputStream("src/...."));
    	
    	//현 프로젝트 런타임될 때 즉, 서버에서 실행될 때 classes폴더를 동적으로 가져와서 경로를 설정해야한다.
    		proFile.load(getClass().getClassLoader().getResourceAsStream("seller_sql.properties"));
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	@Override
	public SellerDTO loginCheck(SellerDTO sellerDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = proFile.getProperty("seller.login");
		SellerDTO dbDTO = null;
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, sellerDTO.getSellerId());
			ps.setString(2, sellerDTO.getSellerPwd());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dbDTO = new SellerDTO(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getString(7), rs.getString(8), rs.getInt(9));
			}			
		}finally {
			DbUtil.dbClose(rs, ps,con);
		}
		
		return dbDTO;
	}

	@Override
	public int signUpSeller(SellerDTO sellerDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("seller.signup");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, sellerDTO.getSellerId());
			ps.setString(2, sellerDTO.getSellerPwd());
			ps.setString(3, sellerDTO.getSellerName());
			ps.setString(4, sellerDTO.getSellerEmail());
			ps.setString(5, sellerDTO.getSellerAddr());
			ps.setString(6, sellerDTO.getSellerContact());
			ps.setInt(7, sellerDTO.getSellerBusinessNo());
			result = ps.executeUpdate();		
		}finally {
			DbUtil.dbClose(ps,con);
		}
		
		return result;
	}

	@Override
	public String searchIdSeller(String name, String email) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = proFile.getProperty("seller.searchid");
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
		String sql = proFile.getProperty("seller.checkidandemail");
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
		String sql = proFile.getProperty("seller.setpwd");
		
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
	public boolean idCheck(String id) {
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  boolean result=false;
		  String sql = proFile.getProperty("seller.idcheck");

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
	public boolean emailCheck(String email) {
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  boolean result=false;
		  String sql = proFile.getProperty("seller.emailcheck");

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
	public boolean contactCheck(String contact) {
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  boolean result=false;
		  String sql = proFile.getProperty("seller.contactcheck");

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
	public boolean businessNoCheck(int businessNo) {
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  boolean result=false;
		  String sql = proFile.getProperty("seller.businessnocheck");

		  try {
		   con=DbUtil.getConnection();
		   ps = con.prepareStatement(sql);
		   ps.setInt(1, businessNo);
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
	public int checkPwd(String id, String pwd) {
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  Connection con = null;
		  int result=0;
		  String sql = proFile.getProperty("seller.pwdcheck");

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

}
