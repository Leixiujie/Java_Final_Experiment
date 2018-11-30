
public class StudentClass {
	private Student[] stus;
	private int size;
	
	public StudentClass() {
		size=0;
		stus=null;
	}
	
	public void createClass() {
		String names[]= {"张三","王五","李四","赵六","孙七"};
		double grades[]= {67,78.5,98,76.5,90};
		int ages[]= {17,18,18,19,17};
		
		size=names.length;
		stus=new Student[size];
		
		for(int i=0;i<size;i++) {
			stus[i]=new Student(names[i],ages[i],grades[i]);
		}
	}
	
	public void sort() {
		Student temp;
		for(int i=0;i<size-1;i++) {
			for(int j=1;j<size-i;j++) {
				if(stus[j-1].getGrade()>stus[j].getGrade()) {
					temp=stus[j-1];
					stus[j-1]=stus[j];
					stus[j]=temp;
				}
			}
		}
	}
		
		public String output(){
			StringBuilder studentInfo=new StringBuilder();
			for(int i=0;i<size;i++) {
				studentInfo.append("姓名："+stus[i].getName()+"\t成绩："+stus[i].getGrade()+"\r\n");
			}
			return studentInfo.toString();
		}
}