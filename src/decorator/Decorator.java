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

package decorator;

/**
 * @author konglm
 *
 */
public class Decorator implements Sourceable {
	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	/**
	 * @author konglm
	 */
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}

}
