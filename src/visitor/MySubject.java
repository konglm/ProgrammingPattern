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
public class MySubject implements Subject {

	/**
	 *  @author konglm
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	/**
	 *  @author konglm
	 */
	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return "love";
	}

}
