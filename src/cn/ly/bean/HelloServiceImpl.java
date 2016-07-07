package cn.ly.bean;

public class HelloServiceImpl implements HelloService{
	private String info;
	public void setInfo(String info) {
		this.info = info;
	}
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello->"+info);
	}
}
