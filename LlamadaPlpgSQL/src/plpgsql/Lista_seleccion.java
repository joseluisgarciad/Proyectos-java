package plpgsql;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.List;
import javax.swing.*;

public class Lista_seleccion {


	

		static JFrame ventana;

		static JTextField caja_de_texto;

	 

		public Integer Lista()

		{

			ventana= new JFrame("Lista");

			List list = new List(5);

	 

			// Ponemos las opciones a la lista

			list.add("Uno");

			list.add("Dos");

			list.add("Tres");

			list.add("Quatro");

			list.add("Cinco");

			list.add("Seis");

			list.add("Siete");

			list.add("Ocho");

			list.add("Nueve");

	 

			//add list

			ventana.add(list);

			ventana.reshape(550,200,200,200);

			ventana.setLayout(new FlowLayout());

			ventana.show();
			
			return 0;

		}

	 

		public static void main (String [] args){

		/*	Lista x=new Lista();

			x.Lista();*/

		}

	}

