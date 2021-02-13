package com.focus.easymail.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * TaskAdapterIntercetpor
 *
 * @author focus
 * @date 2020/8/3
 **/
@Component
@Intercepts(@Signature(type = Executor.class,method = "update",
        args = {MappedStatement.class,Object.class}))
public class TaskAdapterIntercetpor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement)invocation.getArgs()[0];
        Object paramter = invocation.getArgs()[1];
        Field field = paramter.getClass().getDeclaredField("username");
        field.setAccessible(true);
        field.set(paramter,"focus111111111111");
        BoundSql boundSql= mappedStatement.getBoundSql(paramter);
        String sql = boundSql.getSql();
        System.out.println(sql);


        return invocation.proceed();
    }
}
