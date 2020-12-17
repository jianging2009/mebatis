package com.holyw.mebatis.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @className: MapperProxy
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2020/12/17
 **/
public class MapperProxy implements InvocationHandler {

    private SqlSession sqlSession;

    public MapperProxy(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String intefaceName = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String statementId = intefaceName + "." + methodName;
        return sqlSession.selectOne(statementId, args[0]);
    }
}