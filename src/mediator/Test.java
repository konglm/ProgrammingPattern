/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：中介者模式
 * 文件功能描述：由中介者去操作对象之间的关联。操作对象的所有操作关系都是中介类来实现，不能自己独立完成。对象都知道中介类的存在。
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
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		  Mediator mediator = new MyMediator();  
//		  mediator.createMediator();  
//		  mediator.workAll();
		  User user1 = new User1(mediator);
		  User user2 = new User2(mediator);
		  user1.work();
	}

}
