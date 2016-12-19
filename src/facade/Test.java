/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：外观模式
 * 文件功能描述：如果很多类对象之间的关系逻辑很复杂，不想暴露给外部，那么使用一个外观类来封装他们，提供给外部一个统一的界面，相当于接口。
 * 			与中介模式不同的是，所有类都可以独立存在，独立操作，并不知道外观类的存在。
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
