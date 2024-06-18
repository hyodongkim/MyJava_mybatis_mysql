package org.example.TypeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.example.Dto.Gender;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenderTypeHandler extends BaseTypeHandler<Gender> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Gender parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, Integer.parseInt(parameter.getCodeSex()));
    }

    @Override
    public Gender getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return Gender.lookup(rs.getString(columnName));
    }

    @Override
    public Gender getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return Gender.valueOf(rs.getString(columnIndex));
    }

    @Override
    public Gender getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return Gender.valueOf(cs.getString(columnIndex));
    }
}