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

package state;

/**
 * @author konglm
 *
 */
public class Context {
	private State state;  
	     
    public Context(State state) {  
        this.state = state;  
    }  
 
    public State getState() {  
        return state;  
    }  
 
    public void setState(State state) {  
        this.state = state;  
    }  
 
    public void method() {  
        if (state.getValue().equals("state1")) {  
            state.method1();  
        } else if (state.getValue().equals("state2")) {  
           state.method2();  
        }  
    }  
}
