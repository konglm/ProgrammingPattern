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

package adapter;

/**
 * @author konglm
 *
 */
public class Adapter2 implements Targetable {
	
	private Source source;
	
	public Adapter2(Source source){
		super();
		this.source = source;
	}

	/**
	 *  @author konglm
	 */
	@Override
	public void method1() {
		// TODO Auto-generated method stub 
		source.method1();  
	}

	/**
	 *  @author konglm
	 */
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method2!"); 
	}

}
