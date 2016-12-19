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

package abstractFactory;

/**
 * @author konglm
 *
 */
public class SendMailFactory implements Provider {

	/**
	 *  @author konglm
	 */
	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender(); 
	}

}
