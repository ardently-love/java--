package express_logistics_system;
/*运输货物首先需要有交通工具，所以需要定义一个交通工具类。
 * 由于交通工具有多，因种此将交通工具类定义成一个抽象类，
 * 类中需要包含交通工具的编号、型号及运货负责人等属性，
 * 还要定义一个抽象的运输方法。*/

//交通工具类：vehicles
public abstract class Vehicles {
	private String id;		//编号
	private String model;	//型号
	private String admin;	//负责人
	//无参构造
	public Vehicles() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有参构造
	public Vehicles(String id, String model, String admin) {
		super();
		this.id = id;
		this.model = model;
		this.admin = admin;
	}
	// set 和 get 方法
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	//定义抽象运输方法：transport
	abstract void transport();
	
	
	//
}
