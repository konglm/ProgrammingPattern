/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：解释器模式
 * 文件功能描述：做算法解释器等
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
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9+2-8
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));  
		System.out.println(result);
	}

}
