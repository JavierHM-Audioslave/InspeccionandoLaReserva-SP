package bfs_modificado;

import java.util.ArrayList;

import main.Grafo;

public class BFS {
	
	private Grafo grafo;
	private Integer nodoInicial;
	private ArrayList<Integer> recorridos;
	private Integer cantCaminosDistintos;
	
	public BFS(Grafo grafo, Integer nodoInicial) //Se produce un rulo en el if del for del metodo "resolver". Tal vez el in3.txt no sea un caso de entrada valido. PREGUNTAR. //
	{
		this.grafo = grafo;
		this.nodoInicial = nodoInicial-1;
		recorridos = new ArrayList<Integer>();
		cantCaminosDistintos = 0;
	}
	
	public Integer resolver()
	{		
		ArrayList<Integer> cola = new ArrayList<Integer>();
		//Se lista el nodo como ya recorrido
		recorridos.add(nodoInicial);
		//Se agrega el nodo a la cola de visitas
		cola.add(nodoInicial);
		//Hasta que visite todos los nodos
		while (!cola.isEmpty()) {
		  int j = cola.remove(0); //Se saca el primero nodo de la cola
		//Se busca en la matriz que representa el grafo los nodos adyacentes
		    for (int i = 0; i < grafo.obtenerCantNodos(); i++) {
		      //Si es un nodo adyacente y no está visitado entonces
              if (grafo.obtenerValor(j, i) == 1){
                cola.add(i);//Se agrega a la cola de visitas
                recorridos.add(i);//Se marca como recorrido
                
                if(i==grafo.obtenerCantNodos()-1)
                {
                	cantCaminosDistintos++;
                }
              }
          }
      }
	  
	  return cantCaminosDistintos;
	}
}
