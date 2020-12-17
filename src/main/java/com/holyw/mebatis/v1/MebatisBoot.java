package com.holyw.mebatis.v1;


import com.holyw.mebatis.mapper.BlogMapper;

public class MebatisBoot {
    public static void main(String[] args) {
        SqlSession sqlSession = new SqlSession(new Configuration(), new Executor());
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        blogMapper.selectBlogById(1);
    }
}
