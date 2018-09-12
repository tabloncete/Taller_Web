package taller.excepciones;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 8670135969660230761L;
	
	public ServiceException(HibernateException he) {
		he.printStackTrace();
	}

	public ServiceException(ParserConfigurationException pce) {
		pce.printStackTrace();
	}

	public ServiceException(TransformerException tfe) {
		tfe.printStackTrace();
	}
	
}
