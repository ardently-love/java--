package express_logistics_system;
//交通工具可能有很多种，这里定义一个专用运输车类，该类需要继承交通工具类，并实现保养接口。
//定义 专用运输车类：transport
public class Transport extends Vehicles implements Repair{
	//无参构造
	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有参构造
	public Transport(String id, String model, String admin) {
		super(id, model, admin);
		// TODO Auto-generated constructor stub
	}
	//重写（实现） Vehicles类中的transport方法
	@Override
	void transport() {
		System.out.println("货物正在运输中……");
	}
	//重写（实现） Repair接口中的upkeep保养方法
	@Override
	public void upkeep(){
		System.out.println("车辆已保养完毕！");
	}

}
