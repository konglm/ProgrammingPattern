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

package strategy;

/**
 * @author konglm
 *
 */
public class Minus extends AbstractCalculator implements ICalculator {

	/**
	 * @author konglm
	 */
	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int arrayInt[] = split(exp, "-");
		return arrayInt[0] - arrayInt[1];
	}

}
