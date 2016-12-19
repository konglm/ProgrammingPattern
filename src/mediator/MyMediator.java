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
public class MyMediator implements Mediator {
	
	  private User user1;  
	  private User user2;  
	    
	  public User getUser1() {  
	      return user1;  
	  }  
	  
	  public User getUser2() {  
	      return user2;  
	  }  

	/**
	 *  @author konglm
	 */
	@Override
	public void createMediator() {
		// TODO Auto-generated method stub
		  user1 = new User1(this);  
		  user2 = new User2(this);
	}

	/**
	 *  @author konglm
	 */
	@Override
	public void workAll() {
		// TODO Auto-generated method stub
		  user1.work();  
		  user2.work(); 
	}

}
