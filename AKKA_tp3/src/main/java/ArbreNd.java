import java.util.Map;

import akka.actor.ActorRef;


public class ArbreNd {

	public String name;
	public Map<ActorRef, Integer> msgFils;
	public boolean isSend = false;
	public MessageToActor msg;
	public ArbreNd(String name, Map<ActorRef, Integer> msgFils) {
		super();
		this.name = name;
		this.msgFils = msgFils;
	}

	public void onReceive(Object o) throws Exception{

		String msgSend = (String) o;
		msg = new MessageToActor(1, msgSend);
		
		if (o instanceof String){
			if (msgSend.startsWith("/cmd")){
				System.out.println("Received command"+msgSend);
				return;
			}
			if(!msgFils.containsValue(msg.num)){
				// msgFils.putAll(msg.num);
				isSend =true;
				 
				
				
				
			}
		}
		





	}

}
