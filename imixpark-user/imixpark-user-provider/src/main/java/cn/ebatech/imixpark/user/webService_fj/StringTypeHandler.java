package cn.ebatech.imixpark.user.webService_fj;
import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.slf4j.Logger;
public class StringTypeHandler implements TypeHandler<Object> {  
    private static Logger logger = org.slf4j.LoggerFactory.getLogger(StringTypeHandler.class);  
  
    private static String ISO88591_ENCODE = "ISO8859_1";  
    private static String UTF8_ENCODE = "UTF-8";  
    private static String GBK_ENCODE = "GBK";  
  
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {  
        try {  
            String paramStr = null;  
            if (null != parameter) {  
                paramStr = (String) parameter;  
                if (GBK_ENCODE.equals(getEncode(paramStr))) {  
                    if (null != parameter) {  
                        ps.setString(i, new String(((String) parameter).getBytes(GBK_ENCODE), ISO88591_ENCODE));  
                    }  
                }  
            }  
            else {  
                ps.setString(i, (String) parameter);  
            }  
        } catch (UnsupportedEncodingException e) {  
            ps.setString(i, (String) parameter);  
            logger.debug("StringTypeHandler encode Exception");  
        }  
    }  
  
    public Object getResult(ResultSet rs, String columnName) throws SQLException {  
        try {  
            if (null != rs.getString(columnName)) {  
                String columnValue = rs.getString(columnName);  
                if (ISO88591_ENCODE.equals(getEncode(columnValue))) {  
                    return new String(rs.getString(columnName).getBytes(ISO88591_ENCODE), GBK_ENCODE);  
                }  
            }  
        } catch (UnsupportedEncodingException e) {  
            logger.debug("StringTypeHandler encode Exception");  
        }  
        return rs.getString(columnName);  
    }  
  
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {  
        return cs.getString(columnIndex);  
    }  
  
	@Override
	public Object getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

    
    
    //返回编码格式  
    public String getEncode(String str) {  
        String encode = null;  
        if (verifyEncode(str, GBK_ENCODE)) {  
            encode = GBK_ENCODE;  
        } else if (verifyEncode(str, ISO88591_ENCODE)) {  
            encode = ISO88591_ENCODE;  
        } else if (verifyEncode(str, UTF8_ENCODE)) {  
            encode = UTF8_ENCODE;  
        }   
  
        return encode;  
    }  
  
    //判断编码格式是否相符  
    public boolean verifyEncode(String str, String encode) {  
        try {  
            if (str.equals(new String(str.getBytes(encode), encode))) {  
                return true;  
            }  
        } catch (UnsupportedEncodingException e) {  
            logger.debug("StringTypeHandler encode UnsupportedEncoding");  
        }  
        return false;  
    }



	
}