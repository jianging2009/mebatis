package com.holyw.mebatis.mapper;


import com.holyw.mebatis.entity.Blog;

/**
 * @Author: Denchy Chiang
 */

public interface BlogMapper {
    /**
     * 根据主键查询文章
     * @param bid
     * @return
     */
    //@Select("select * from blog where bid = ? ")
    public Blog selectBlogById(Integer bid);

}
