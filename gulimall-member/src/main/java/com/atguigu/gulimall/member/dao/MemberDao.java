package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chuf
 * @email lrnimo@gmail.com
 * @date 2022-11-28 23:00:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
