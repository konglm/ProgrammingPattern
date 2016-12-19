/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：外观模式
 * 文件功能描述：如果很多类对象之间的关系很复杂，那么使用一个外观类来理顺加载他们的关系
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package facade;

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
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
