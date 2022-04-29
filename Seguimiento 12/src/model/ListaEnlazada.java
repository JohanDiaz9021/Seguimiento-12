package model;

public class ListaEnlazada {

    private Node inicio;
    private Node presente;
    private  int contador = 1;

    public void asignarTurno(Node x){

        if(inicio == null){
           inicio = x;
            inicio.setSiguiente(inicio);
            inicio.setAnterior(inicio);

            presente = inicio;
            return;
        }
        else if(inicio != null) {
            Node cola = inicio.getAnterior();
            inicio.setAnterior(x);
            cola.setSiguiente(x);
            x.setSiguiente(inicio);
            x.setAnterior(cola);
            return;
        }
    }
    public void mostrarELTurno(){
    	
    	if(presente != null) {
    		System.out.println(presente.getValue());
    	} 
    	else if(presente == null) {
    		System.out.println("No hay turnos aun");
    	}
    }
    public void pasarTurnoSiguiente() {
    	
    	if(presente != null) {
    		presente.setContador(presente.getContador()+contador);
    		presente = presente.getSiguiente();
    		System.out.println("Se paso el turno");
    	}
    	else if(presente == null) {
    		System.out.println("No se encuentra mas turnos registrados");
    	}
    }
    public void eliminarTurno() {
    	
    	if(inicio != null) {
    		Node x = presente.getSiguiente();
    		Node y = presente.getAnterior();
    		
    		x.setSiguiente(y);
    		
    		presente = y;
    		presente = x;
    		
    		inicio = presente;
    		System.out.println("Se elimino de manera exitosa");
    	}
    	else if(inicio == null) {
    		System.out.println("No se encuentra algun turno registrado");
    	}
    }
}