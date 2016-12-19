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
public class MyIterator implements Iiterator {

	private Collection collection;
	private int pos = -1;

	public MyIterator(Collection collection) {
		this.collection = collection;
	}

	/**
	 * @author konglm
	 */
	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		if (pos > 0) {
			pos--;
		}
		return collection.get(pos);
	}

	/**
	 * @author konglm
	 */
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if (pos < collection.size() - 1) {
			pos++;
		}
		return collection.get(pos);
	}

	/**
	 * @author konglm
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (pos < collection.size() - 1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author konglm
	 */
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		pos = 0;
		return collection.get(pos);
	}

}
