/** 
 * <pre>项目名称:zhen_shop 
 * 文件名称:ServerResoonse.java 
 * 包名:com.fh.shop.backend.common 
 * 创建日期:2019年1月11日下午1:16:58 
 * Copyright (c) 2019, 1090273251@163.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.util;

import java.io.Serializable;

/** 
 * <pre>项目名称：zhen_shop    
 * 类名称：ServerResoonse    
 * 类描述：    
 * 创建人：朱兴光 1090273251@163.com    
 * 创建时间：2019年1月11日 下午1:16:58    
 * 修改人：朱兴光 1090273251@163.com     
 * 修改时间：2019年1月11日 下午1:16:58    
 * 修改备注：       
 * @version </pre>    
 */
public class ServerResponse implements Serializable{

	private static final long serialVersionUID = 7846637344646929089L;
	//返回数码
	private Integer code;
	//返回信息
	private String msg;
	//返回数据
	private Object data;
	/**    
	 * <pre>创建一个新的实例 ServerResponse.    
	 *    </pre>    
	 */
	private ServerResponse() {
		
	}
	/**    
	 * <pre>创建一个新的实例 ServerResponse.    
	 *    
	 * @param code
	 * @param msg
	 * @param data</pre>    
	 */
	private ServerResponse(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	//成功
	public static ServerResponse success(){
		
		ServerResponse obj = new ServerResponse(ResponseEnum.SUCCESS.getCode(),ResponseEnum.SUCCESS.getMsg(),null);
		
		return obj;
	}
	//失败
	public static ServerResponse exception(){
		
		ServerResponse obj = new ServerResponse(ResponseEnum.EXCEPTION.getCode(),ResponseEnum.EXCEPTION.getMsg(),null);
		
		return obj;
	}
	//其他错误
	public static ServerResponse error(ResponseEnum responseEnum){
		
		ServerResponse obj = new ServerResponse(responseEnum.getCode(),responseEnum.getMsg(),null);
		
		return obj;
	}
	//下拉列表框
	public static ServerResponse success(Object data){
		
		ServerResponse obj = new ServerResponse(ResponseEnum.SUCCESS.getCode(),ResponseEnum.SUCCESS.getMsg(),data);
		
		return obj;
	}
	
	
	
	/************get and set************************/
	public Integer getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	public Object getData() {
		return data;
	}
	

}
