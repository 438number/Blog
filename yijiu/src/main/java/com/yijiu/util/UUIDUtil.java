package com.yijiu.util;

import java.util.UUID;
/**
 * UUID工具类
 * @author  郭晴
 *   2017年4月25日 下午6:26:57
 */
public   class UUIDUtil {
	/**
	 * 产生随机的UUID
	 * @return 产生的uuid
	 */
	 public  static String  getUUID(){
			return UUID.randomUUID().toString().replace("-", "");
		 }
}
