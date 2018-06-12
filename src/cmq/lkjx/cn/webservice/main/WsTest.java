package cmq.lkjx.cn.webservice.main;
import javax.xml.ws.Endpoint;

import cmq.lkjx.cn.webservice.iface.WsTestI;
import cmq.lkjx.cn.webservice.ifaceimpl.WsTestImpl;


public class WsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:2232/aa", new WsTestImpl());
	}

}
