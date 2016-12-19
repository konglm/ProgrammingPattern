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

package chainOfResponsibility;

/**
 * @author konglm
 *
 */
public class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	/**
	 * @author konglm
	 */
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println(name + "deal!");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}

}
