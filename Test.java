package express_logistics_system;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//实例化 快递任务类对象，并使用有参构造传入参数
		ExpressTask task = new ExpressTask("T155348","12.8");
		//调用 运货前方法
		task.sendBefore();
		System.out.println("------------------------------");
		//实例化 专用运输车类：Transport
		Transport tr = new Transport("一汽哈众","王五","冀 TX211326");
		//实例化 仪器类
		Phone ph = new Phone();
		//调用 送货中方法
		task.sending(tr, ph);
		System.out.println("------------------------------");
		//调用 送货后方法
		task.sendAfter(tr,task);
	}

}
