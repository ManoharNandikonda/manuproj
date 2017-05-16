package com.Restfullapplication.Messanger;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
	public  List<Message> getAllMess(){
	Message m1=new Message(1,"manu","shashi");
	Message m2=new Message(2,"manu","shashi");
	ArrayList<Message> list= new ArrayList<Message>();
	list.add(m1);
	list.add(m2);
	return list;

	
	}

}
