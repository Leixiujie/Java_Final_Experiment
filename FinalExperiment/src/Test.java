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
		//�����༶����
		StudentClass sClass=new StudentClass();
		
		//���༶���ѧ��
		sClass.createClass();
		
		System.out.println("ԭʼ˳��");
		System.out.println(sClass.output());
		
		//ð������
		sClass.sort();
		
		//��������
		System.out.println("����ð����������");
		System.out.println(sClass.output());
	}

}
