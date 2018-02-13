package app.com;

import java.lang.reflect.InvocationTargetException;
import java.sql.Date;

import javax.swing.SwingUtilities;

import com.gui.MainFrame;

public class Application {

	//private static VolService volService;

	public static void main(String[] args) {

//		@SuppressWarnings("resource")
//		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext();
//		app.scan("com.genericdao");
//		app.scan("com.dao");
//		app.scan("com.services");
//		app.refresh();

		//volService = app.getBean(VolServiceImpl.class);

		Date dateTimeAllee = Date.valueOf("2018-02-1");
		Date dateTimeRetour = Date.valueOf("2018-12-12");

		//volService.getAllVolsBetweenDate(dateTimeAllee, dateTimeRetour);

		try {
			SwingUtilities.invokeAndWait(new Runnable() {

				@Override
				public void run() {
					MainFrame ihmReservation = new MainFrame();
					ihmReservation.toString();

				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}

	}

}
