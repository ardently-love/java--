package express_logistics_system;
//仪器类 Phone
public class Phone implements GPS{
	@Override
	public String location(){
		String location = "当前位置：石家庄鹿泉区";
		return location;
	}
}
