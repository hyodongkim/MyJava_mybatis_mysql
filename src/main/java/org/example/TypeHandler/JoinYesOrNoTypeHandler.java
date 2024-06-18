package org.example.TypeHandler;


import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.example.Dto.Gender;
import org.example.Dto.JoinYesOrNo;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(JoinYesOrNo.class)
public class JoinYesOrNoTypeHandler extends BaseTypeHandler<JoinYesOrNo>{
        @Override
        public void setNonNullParameter(PreparedStatement ps, int i, JoinYesOrNo parameter, JdbcType jdbcType)
                throws SQLException {
            ps.setInt(i, parameter.getCodeJoin());
        }

        @Override
        public JoinYesOrNo getNullableResult(ResultSet rs, String columnName) throws SQLException {
            return JoinYesOrNo.valueOf(rs.getInt(columnName));
        }

        @Override
        public JoinYesOrNo getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
            return JoinYesOrNo.valueOf(rs.getInt(columnIndex));
        }

        @Override
        public JoinYesOrNo getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
            return JoinYesOrNo.valueOf(cs.getInt(columnIndex));
        }

    }