/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：命令模式
 * 文件功能描述：发令者通过命令与接令者联系，并不知道接令者的存在和命令如何执行。
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package command;

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
		Receiver receiver = new Receiver();  
		Command cmd = new MyCommand(receiver);  
		Invoker invoker = new Invoker(cmd);  
		invoker.action(); 
	}

}
