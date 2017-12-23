package main;

import java.io.*;
import java.util.Scanner;

import bfs_modificado.BFS;

public class Reserva {
	
	private Grafo grafo;
	private BFS bfs;
	
	public Reserva(File entrada)
	{
		Scanner sc;
		try
		{
			sc = new Scanner(entrada);
			grafo = new Grafo(sc.nextInt(), sc.nextInt());
			grafo.cargarGrafo(sc);
			bfs = new BFS(grafo,1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	
	public void resolver()
	{
		System.out.println(bfs.resolver());
	}
}
