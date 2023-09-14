package cursos.alura.java_util.models;

import java.util.Arrays;

import org.omg.CORBA.PRIVATE_MEMBER;

import cursos.alura.polimorfismo.bytebank.herdado.contas.conta.Conta;

public class Objects<T> {
	
	private Object[] objects;
	private int next;
	
	public Objects() {
		this.objects = new Object[0];
		this.next = 0;
	}
	
	@SuppressWarnings("unchecked")
	public T get(final int index) {
		if(index < 0) return null;
		if(index >= objects.length) return null;
		return (T) objects[index];
	}
	
	public void add(final T conta) {
		Object[] objects = new Object[next + 1];
		for (int i = 0; i < this.objects.length; i++) {
			objects[i] = this.objects[i];
		}
		this.objects = objects;
		this.objects[next] = conta;
		next++;
	}
	
	public int length() {
		return next;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(objects);
	}
}
