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

package interpreter;

/**
 * @author konglm
 *
 */
public class Context {
	  private int num1;  
	  private int num2;  
	        
	  public Context(int num1, int num2) {  
	       this.num1 = num1;  
	       this.num2 = num2;  
	  }  
	       
	  public int getNum1() {  
	       return num1;  
	  }  
	  public void setNum1(int num1) {  
	       this.num1 = num1;  
	  }  
	  public int getNum2() {  
	       return num2;  
	  }  
	  public void setNum2(int num2) {  
	      this.num2 = num2;  
	  }
}
