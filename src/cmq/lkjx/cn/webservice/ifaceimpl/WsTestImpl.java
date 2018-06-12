package cmq.lkjx.cn.webservice.ifaceimpl;

import javax.jws.WebService;

import cmq.lkjx.cn.webservice.iface.WsTestI;
@WebService
public class WsTestImpl implements WsTestI{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "你是： "+name;
	}

	@Override
	public String sayHello2(String name) {
		System.out.println("你是： "+name);
		return "你是2： "+name;
	}

	@Override
	public String sayHello3(String name) {
		System.out.println("你是3： "+name);
		return "你是3： "+name;
	}

	@Override
	public String sayHello4(String name) {
		System.out.println("你是4： "+name);
		return "你是4： "+name;
	}

}
