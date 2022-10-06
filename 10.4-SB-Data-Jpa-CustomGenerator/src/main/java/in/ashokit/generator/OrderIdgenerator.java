package in.ashokit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class OrderIdgenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		
		
		String prefix="OD";
		String suffix="";
		try
		{
			Connection con=session.connection();
			Statement st=con.createStatement();
			String sql="select order_id_seq.nextval from dual";
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
			{
				int seqVal = rs.getInt(1);
				 suffix=String.valueOf(seqVal);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return prefix+suffix;
		
		
		
	}


}
