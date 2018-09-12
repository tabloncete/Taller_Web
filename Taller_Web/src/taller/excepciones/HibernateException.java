package taller.excepciones;

public class HibernateException extends Exception {

	private static final long serialVersionUID = 3615314217822254724L;
	
	public HibernateException(Exception e) {
		e.printStackTrace();
	}
	
}
