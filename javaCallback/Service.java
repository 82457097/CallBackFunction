
import java.util.ArrayList;
import java.util.List;

public class Service {
	private Listener m_listener = null;
	private String m_info;

	public void setInfo(String info) {
		m_info = info;

		callBack();
	}

	public void addListener(Listener listener) {
		m_listener = listener;
	}

	public void callBack() {
		if(m_listener != null) {
			m_listener.receiveInfo(m_info);
		}
	}
}
