/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：组合模式
 * 文件功能描述：用树结构去组合的模式
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package composite;

/**
 * @author konglm
 *
 */
public class Tree {
	   TreeNode root = null;  
	     
      public Tree(String name) {  
           root = new TreeNode(name);  
       }  
     
       public static void main(String[] args) {  
           Tree tree = new Tree("A");  
           TreeNode nodeB = new TreeNode("B");  
           TreeNode nodeC = new TreeNode("C");  
             
           nodeB.add(nodeC);  
           tree.root.add(nodeB);  
           System.out.println("build the tree finished!");  
       }  
}
