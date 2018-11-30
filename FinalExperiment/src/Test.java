/**
 * 
 */

/**
 * @author qq
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建班级对象
		StudentClass sClass=new StudentClass();
		
		//给班级添加学生
		sClass.createClass();
		
		System.out.println("原始顺序：");
		System.out.println(sClass.output());
		
		//冒泡排序
		sClass.sort();
		
		//排序后输出
		System.out.println("数组冒泡排序结果：");
		System.out.println(sClass.output());
	}

}
