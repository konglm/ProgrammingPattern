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

package mediator;

/**
 * @author konglm
 *
 */
public class User2 extends User {
	
	  public User2(Mediator mediator){  
	      super(mediator);  
	  } 

	/**
	 *  @author konglm
	 */
	@Override
	public void work() {
		// TODO Auto-generated method stub
		super.getMediator().workAll();
	}

}
