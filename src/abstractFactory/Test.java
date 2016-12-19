/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：抽象工程模式
 * 文件功能描述：抽象出工厂的接口，便于增加新的工厂。
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package abstractFactory;

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
		Provider provider = new SendSmsFactory();
		Sender sender = provider.produce();
		sender.Send();
	}

}
