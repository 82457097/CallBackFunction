
public class MyListener implements Listener {
	@Override
	public void receiveInfo(String info) {
		System.out.println("监听器监听到信号。。。");
		System.out.println("接收到info的变更，变更后的info是" + info);
	}
}
