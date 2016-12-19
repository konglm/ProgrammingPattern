/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：
 * 文件功能描述：
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package state;

/**
 * @author konglm
 *
 */
public class State {
	private String value;  
	         
   public String getValue() {  
       return value;  
   }  
 
   public void setValue(String value) {  
       this.value = value;  
   }  
 
   public void method1(){  
       System.out.println("execute the first opt!");  
   }  
     
   public void method2(){  
       System.out.println("execute the second opt!");  
   }  
}
