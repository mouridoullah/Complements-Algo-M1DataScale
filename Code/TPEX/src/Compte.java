import java.util.*;

/**
 * 
 */

/**
 * @author bdame
 *
 */
public class Compte {
	private int code;
	private float solde;
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public void verser(float montant) throws NegativeExecption {
		if(montant < 0) throw new NegativeExecption("Montant inferieur à 0 !!");
		solde = solde + montant;
	}
	public void retirer(float montant) throws SoldeInsuffisantException, NegativeExecption{
		if(solde < montant) throw new SoldeInsuffisantException("Solde insufisant !!");
		if(montant < 0) throw new NegativeExecption("Montant inferieur à 0 !!");
		solde = solde - montant;
	}

}
