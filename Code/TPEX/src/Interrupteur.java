/**
 * 
 */

/**
 * @author bdame
 *
 */
public class Interrupteur {
	private boolean position;
	private Lampe lampe;
	public Interrupteur(Lampe lampe) {
		super();
		this.position = lampe.estAllumee();
		this.lampe = lampe;
	}
	public String getPosition() {
		if (position ==  true) {
			return "On";
		}else {
			return "Off";
		}
	}
	public void changerPosition() {
		lampe.modifierEtat();
		position = lampe.estAllumee();
	}
	public Lampe getLampe() {
		return lampe;
	}

}
