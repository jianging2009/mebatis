package com.holyw.mebatis.v1;

public class SqlSession {

    private Configuration configuration;

    private Executor executor;

    public SqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statementId, Object paramater) {
        String sql = Configuration.sqlMappings.getString(statementId);
        return executor.query(sql,paramater);
    }

    public <T> T getMapper(Class clazz) {return configuration.getMapper(clazz,this);}
}
