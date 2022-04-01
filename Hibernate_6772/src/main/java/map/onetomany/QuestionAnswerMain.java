package map.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionAnswerMain {

	public static void main(String[] args)
	{
		System.out.println("Hello World ");
		
		Configuration config = new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf =config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tf = session.beginTransaction();
		
		//creating question
		Question q1 = new Question();
		q1.setQuesId(101);
		q1.setQues("What Are The Java Features ???");
		
		//creating answer
		Answer answer = new Answer();
		answer.setAnsId(1);
		answer.setAns("Object-Oriented");
		answer.setQuestion(q1);
		
		Answer answer2 = new Answer();
		answer2.setAnsId(2);
		answer2.setAns("MultiThreaded");
		answer2.setQuestion(q1);
		
		Answer answer3 = new Answer();
		answer3.setAnsId(3);
		answer3.setAns("Robust");
		answer3.setQuestion(q1);
		
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(answer);
		list.add(answer2);
		list.add(answer3);
		
		q1.setAnswer(list);
		
		session.save(q1);
		session.save(answer);
		session.save(answer2);
		session.save(answer3);
		
		tf.commit();
		
	}

}
