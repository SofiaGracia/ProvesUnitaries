/*
 * Classe que implementa una calculadora bàsica.
 */
package ProvesUni;

public class CalcUnit {
	private float lastResult; // Variable per emmagatzemar l'últim resultat
	private String lastOp; // Variable per emmagatzemar l'última operació realitzada
	
	/**
	 * Obté l'últim resultat calculat.
	 * @return L'últim resultat calculat
	 */
	public float getLastResult() {
		return this.lastResult;
	}
	
	/**
	 * Obté l'última operació realitzada.
	 * @return L'última operació realitzada
	 */
	public String getLastOp() {
		return this.lastOp;
	}
	
	/**
	 * Realitza una suma entre dos operands.
	 * @param op1 El primer operand
	 * @param op2 El segon operand
	 * @return El resultat de la suma
	 */
	public float suma( float op1, float op2) {
		float result = op1 + op2;
		this.lastResult = result;
		this.lastOp = "Suma";
		return result;
	}
	
	/**
	 * Realitza una resta entre dos operands.
	 * @param op1 El primer operand (minuend)
	 * @param op2 El segon operand (subtrahend)
	 * @return El resultat de la resta
	 */
	public float resta(float op1, float op2) {
		float result = op1 - op2;
		this.lastResult = result;
		this.lastOp = "Resta";
		return result;
	}
	
	/**
	 * Realitza una multiplicació entre dos operands.
	 * @param op1 El primer operand
	 * @param op2 El segon operand
	 * @return El resultat de la multiplicació
	 */
	public float multiplica(float op1, float op2) {
		float result = op1 * op2;
		this.lastResult = result;
		this.lastOp = "Multiplica";
		return result;
	}
	
	/**
	 * Realitza una divisió entre dos operands.
	 * @param op1 El dividend
	 * @param op2 El divisor
	 * @return El resultat de la divisió
	 */
	public float divideix(float op1, float op2) {
		float result = op1 / op2;
		this.lastResult = result;
		this.lastOp = "Divideix";
		return result;
	}
	
	/**
	 * Comprova si un operand és major que un altre.
	 * @param op1 L'operand a comparar
	 * @param op2 L'operand de referència
	 * @return Cert si op1 és major que op2; Fals altrament
	 */
	public boolean majorQue (float op1, float op2) {
		if (op1 > op2) {
			return true;
		}
		return false;
	}
    
    /**
     * Restableix els valors de l'últim resultat i de l'última operació a les seves valors inicials.
     */
    public void restablecer(){
        this.lastResult = 0;
        this.lastOp = "Ninguna";
    }
}