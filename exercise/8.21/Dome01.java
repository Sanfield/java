abstract class person
{
	private String name;
	private int age;
	public person(String name,int age)
	{
		this.setName(name);
		this.setAge(age);
	}
	public void setName(String name)
	{
		this.name = name ;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public void say()
	{
		System.out.println(this.getContend());
	}
	public abstract String getContend() ;
}
class work extends person
{
	private float salary;
	public work(String name,int age,float salary)
	{
		super(name,age);
		this.setSalary(salary);
	}
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	public float getSalary()
	{
		return this.salary;
	}
	public String getContend()
	{
		return "工人-->姓名："+super.getName()+",年龄"+super.getAge()+",工资："+this.getSalary();
	}
}
class student extends person
{
	private float score;
	public student(String name,int age,float score)
	{
		super(name,age);
		this.setScore(score);
	}
	public void setScore(float score)
	{
		this.score = score;
	}
	public float getScore()
	{
		return this.score;
	}
	
	public String getContend()
	{
		return "学生-->姓名："+super.getName()+",年龄"+super.getAge()+",成绩："+this.getScore();
	}
}




public class Dome01
{
	public static void main (String args[])
	{
		person p = null;
		p = new student("张三",30,90);
		p.say();

	}
}