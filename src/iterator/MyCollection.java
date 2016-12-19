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

package iterator;


/**
 * @author konglm
 *
 */
public class MyCollection implements Collection {
	public String string[] = {"A","B","C","D","E"};
	/**
	 *  @author konglm
	 */
	@Override
	public Iiterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this); 
	}

	/**
	 *  @author konglm
	 */
	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return string[i];
	}

	/**
	 *  @author konglm
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return string.length;
	}

}
