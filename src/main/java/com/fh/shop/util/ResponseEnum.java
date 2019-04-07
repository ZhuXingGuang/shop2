/** 
 * <pre>项目名称:zhen_shop 
 * 文件名称:ResponseEnum.java 
 * 包名:com.fh.shop.backend.common 
 * 创建日期:2019年1月11日下午1:48:43 
 * Copyright (c) 2019, 1090273251@163.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.util;

/** 
 * <pre>项目名称：zhen_shop    
 * 类名称：ResponseEnum    
 * 类描述：    
 * 创建人：朱兴光 1090273251@163.com    
 * 创建时间：2019年1月11日 下午1:48:43    
 * 修改人：朱兴光 1090273251@163.com     
 * 修改时间：2019年1月11日 下午1:48:43    
 * 修改备注：       
 * @version </pre>    
 */
public enum ResponseEnum {
	
	
	USERNAME_USEPWD_EMPTY(1000,"账号或者密码或验证码为空"),
	USERNAME_ERROR(1001,"账号不存在"),
	USEPWD_ERROR(1002,"密码错误"),
	IMGCODE_ERROR(1003,"验证码错误"),
	USER_LOCK(1004,"密码错误太多，已锁定"),
	USER_EXITS(1005,"用户已存在"),
	EXCEPTION(-1,"ERROR"),
	SUCCESS(200,"OK");
	
	//返回状态码
	private int code;
	//返回信息
	private String msg;
	
	/**    
	 * <pre>创建一个新的实例 ResponseEnum.    
	 *    
	 * @param code
	 * @param msg</pre>    
	 */
	private ResponseEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	/**    
	 * <pre>创建一个新的实例 ResponseEnum.    
	 *    
	 * @param name
	 * @param ordinal</pre>    
	 */
	private ResponseEnum() {
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}


	
	

}
