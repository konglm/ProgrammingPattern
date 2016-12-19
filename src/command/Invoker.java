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
public class Invoker {
	private Command command;  
	         
    public Invoker(Command command) {  
       this.command = command;  
    }  
 
    public void action(){  
       command.exe();  
    }
}
