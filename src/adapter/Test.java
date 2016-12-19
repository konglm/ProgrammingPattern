/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：适配器模式
 * 文件功能描述：与装饰模式的不同就是，适配器模式是增加方法，装饰模式是改变方法
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package adapter;

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
//		Targetable target = new Adapter();
		Source source = new Source();
		Targetable target = new Adapter2(source);
		target.method1();
		target.method2();
	}

}
