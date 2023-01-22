package express_logistics_system;
/*有了负责运输的交通工具后,就可以开始运输货物了。
 * 货物在运输前、运输中和运输后都需要检查和记录，并且每一个快递都有快递单号，
 * 这时可以定义一个快递任务类，
 * 包含快递单号和货物重量等属性,以及货物运输前、运输中和运输后等方法*/

//快递任务类 express task
public class ExpressTask {
	private String number;	//快递单号
	private String weight;	//货物重量
	//无参构造
	public ExpressTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有参构造
	public ExpressTask(String number, String weight) {
		super();
		this.number = number;
		this.weight = weight;
	}
	//get set 方法
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	//以及货物运输前、运输中和运输后等方法
	//编写货物运输前方法：
	public void sendBefore(){
		System.out.println("小哥快跑订单已开始运行……");
		System.out.println("货物重量为："+weight+"kg");
		System.out.println("客户缴费完毕！");
		System.out.println("货物装填完毕！");
		System.out.println("已通知运货人运货");
		System.out.println("货物快递单号为："+number);
		
	}
	//货物运输中方法：
	public void sending(Transport t, Phone get){
		System.out.println("运货人："+t.getModel());
		System.out.println("车辆类型："+t.getId()+" 车辆编号: "+t.getAdmin()+" 发送货物");
		System.out.println("当前货物位置："+get.location());
	}
	//货物运输后方法
	public void sendAfter(Transport t, ExpressTask task) {
		System.out.println("货物运输完毕！");
		System.out.println("车辆类型："+t.getId()+" 车辆编号: "+t.getAdmin()+" 快递单号："+task.getNumber()+" 货物已送达");
		t.upkeep();
	}
	
}
