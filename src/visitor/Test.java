/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：访问者模式
 * 文件功能描述：访问者封装操作，主题封装数据结构。增加操作的话，增加访问者。数据结构需稳定。
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package visitor;

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
		  Visitor visitor = new MyVisitor();  
		  Subject sub = new MySubject();  
		  sub.accept(visitor);
	}

}
