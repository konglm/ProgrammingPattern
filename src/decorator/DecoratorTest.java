/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：装饰模式
 * 文件功能描述：与适配器模式的不同就是，适配器模式是增加方法，装饰模式是改变方法。
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package decorator;

/**
 * @author konglm
 *
 */
public class DecoratorTest {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}
