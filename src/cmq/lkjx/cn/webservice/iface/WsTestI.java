package cmq.lkjx.cn.webservice.iface;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WsTestI {
	@WebMethod
	String sayHello(String name);
	@WebMethod
	String sayHello2(String name);
	@WebMethod
	String sayHello3(String name);
	@WebMethod
	String sayHello4(String name);
}
