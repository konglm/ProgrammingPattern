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

package command;

/**
 * @author konglm
 *
 */
public class MyCommand implements Command {
	
	private Receiver receiver;  
	         
	public MyCommand(Receiver receiver) {  
	    this.receiver = receiver;  
	} 

	/**
	 *  @author konglm
	 */
	@Override
	public void exe() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
