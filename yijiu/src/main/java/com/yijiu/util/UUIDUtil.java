package com.yijiu.util;

import java.util.UUID;
/**
 * UUID������
 * @author  ����
 *   2017��4��25�� ����6:26:57
 */
public   class UUIDUtil {
	/**
	 * ���������UUID
	 * @return ������uuid
	 */
	 public  static String  getUUID(){
			return UUID.randomUUID().toString().replace("-", "");
		 }
}
