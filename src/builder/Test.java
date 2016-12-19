/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：建造者模式
 * 文件功能描述：与工厂模式不同，工厂模式是产生单个类的对象，建造者是产生复合对象的。
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package builder;

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
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}

}
