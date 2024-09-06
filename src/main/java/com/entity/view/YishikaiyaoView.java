package com.entity.view;

import com.entity.YishikaiyaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医师开药
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 18:06:31
 */
@TableName("yishikaiyao")
public class YishikaiyaoView  extends YishikaiyaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YishikaiyaoView(){
	}
 
 	public YishikaiyaoView(YishikaiyaoEntity yishikaiyaoEntity){
 	try {
			BeanUtils.copyProperties(this, yishikaiyaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
