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

package visitor;

/**
 * @author konglm
 *
 */
public interface Subject {
	  public void accept(Visitor visitor);  
	  public String getSubject(); 
}
