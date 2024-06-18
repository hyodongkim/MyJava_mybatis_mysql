package org.example.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.example.Dto.Gender;
import org.example.Dto.JobClass;

@MappedTypes(JobClass.class)
public class JobClassTypeHandler extends BaseTypeHandler<JobClass>{

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JobClass parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setInt(i, parameter.getCodeJob());
    }

    @Override
    public JobClass getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return JobClass.valueOf(rs.getInt(columnName));
    }

    @Override
    public JobClass getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return JobClass.valueOf(rs.getInt(columnIndex));
    }

    @Override
    public JobClass getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return JobClass.valueOf(cs.getInt(columnIndex));
    }

}