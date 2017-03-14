package com.ai.duxiefenli;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.duxiefenli.mapper.SysConfig;
import com.ai.duxiefenli.mapper.SysConfigCriteria;
import com.ai.duxiefenli.mapper.SysConfigMapper;



@Service
public class DuxieTest implements DuxieInterface{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	public String selectTest(String ntAccount,boolean iswin){
		SysConfigCriteria orderCriteria = new SysConfigCriteria();
		SysConfigCriteria.Criteria ordcriteria = orderCriteria.createCriteria();
		ordcriteria.andIdEqualTo(26);
		SysConfigMapper ordermapper = sqlSessionTemplate.getMapper(SysConfigMapper.class);
		
		List<SysConfig> orderlist = ordermapper.selectByExample(orderCriteria);
		if(orderlist != null){
			//System.out.println(orderlist.get(0).getTypeCode());
		}
		
		
		return "000000";
		
				
	}
	
	public String updateTest(String ntAccount,boolean iswin){
		SysConfigMapper ordermapper = sqlSessionTemplate.getMapper(SysConfigMapper.class);		
		int i = ordermapper.deleteByPrimaryKey(26);	
		
		System.out.println(i);
		
		return "000000";
		
				
	}

}
