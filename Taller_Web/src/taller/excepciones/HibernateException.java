package taller.excepciones;

public class HibernateException extends Exception {
	
	private static final long serialVersionUID = 3401657301472242264L;

	public HibernateException(Exception e) {
		e.printStackTrace();
	}
	
}
