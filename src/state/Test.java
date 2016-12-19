/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：状态模式
 * 文件功能描述：根据状态去改变行为
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package state;

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
		 State state = new State();  
		 Context context = new Context(state);  
		             
        //设置第一种状态  
        state.setValue("state1");  
        context.method();  
         
        //设置第二种状态  
        state.setValue("state2");  
        context.method();
	}

}
