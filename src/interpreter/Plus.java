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
public class Plus implements Expression {

	/**
	 *  @author konglm
	 */
	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1()+context.getNum2(); 
	}

}
