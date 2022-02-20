package examenInterfaces;

import java.awt.Color;

import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Jprogress extends JProgressBar implements ChangeListener {
	
		public Jprogress () {
		this.addChangeListener(this);
		this.setStringPainted(true);
	}

	@Override
	public void stateChanged (ChangeEvent e) {
		
		System.out.println(this.getValue());
		
		if (this.getValue()<17) {
			this.setBackground(Color.cyan);
		}else if (this.getValue()< 33) {
			this.setBackground(	Color.blue);
		
		}else if (this.getValue()<50) {
			this.setBackground(Color.green);
		}else if (this.getValue()< 4) {
			this.setBackground(Color.yellow);
		}else if (this.getValue()< 5) {
			this.setBackground(Color.orange);
		}else if (this.getValue()< 6) {
			this.setBackground(Color.red);
		}
	}
	

}
