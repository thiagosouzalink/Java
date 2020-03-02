

/*
Animação java elaborado como projeto da faculdade

Autor: Thiago Souza	

Universidade Federal do Pará
*/




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimacaoFutebol extends JFrame {

// local para variaveis de instancia
 private int w,b,j,t,a;


   public AnimacaoFutebol() {

        super("FUTEBOL");
        getContentPane().setBackground(Color.blue); //fundo da animação
        setSize ( 1200, 800 );
        setVisible ( true );

     }




   public void paint(Graphics g) {

	    super.paint(g);

	     Graphics2D g2d = (Graphics2D) g;



// ---------------------Apresentação-------------------------------------------------------------------

	   


        for (int s = 0; s <= 800; s += 80) {
               g.setColor(Color.white);
		       g.setFont(new Font("Arial", Font.BOLD, 50));
		       g.drawString("Futebol", 100 , 200 + s);
		       g.drawString("paixão nacional", 100 , 250 + s);



			   	  if (s != 240) {

			   		    try {
			   		       Thread.sleep(500);
			   		         }
			   		        catch (Exception u) {
			   		                }
			   		            } else {
			   		                //parada de tempo
			   		                try {
			   		                    Thread.sleep(3000);
			   		                } catch (Exception u) {}

								}


                       if (s < 800) {
					  		    g.setColor(Color.blue);
				                g.fillRect(0, 0, 1200 , 800 );


		   }



}








//--------------------parte da animação---------------------------------------------------------------


	    // desenha o sol
	     g.setColor(Color.yellow);
		 g.fillRoundRect(800,40,100,110,360,360);

		 // desenha o campo
		 g.setColor(Color.green);
		 g.fillRect(0,220,1050,800);//200


         //desenha a trave
         g.setColor(Color.white);
         g.fillRect(300,100,5,120);
         g.fillRect(300,100,275,5);
         g.fillRect(575,100,5,120);

         // bola
         g2d.setColor(Color.black);
		 g2d.fillOval(680,690,25,25);



          // 1º personagem -> jogador com a bola
         g2d.setColor(Color.black);
   		 g2d.drawOval(25,625,30,30); // movimento da cabeça
   		 g2d.drawLine(40,655,40,695); // movimento do tronco
   		 g2d.drawLine(40,655,20,685); // movimento da braço esquerda
   		 g2d.drawLine(40,655,60,685); // movimento da braço direita
   		 g2d.drawLine(40,695,20,734); // movimento do pé esquerdo
   		 g2d.drawLine(40,695,60,734); // movimento do pé direito

          // 2º personagem -> outro jogador
         g2d.setColor(Color.black);
		 g2d.drawOval(25,510,30,30);
		 g2d.drawLine(40,540,40,580);
    	 g2d.drawLine(40,540,20,570);
		 g2d.drawLine(40,540,60,570);
		 g2d.drawLine(40,580,20,619);
		 g2d.drawLine(40,580,60,619);

         // 3º personagem -> plateia
         g2d.setColor(Color.black);
		 g2d.drawOval(950,450,30,30);
		 g2d.drawLine(965,480,965,520);
		 g2d.drawLine(965,480,945,510);
   		 g2d.drawLine(965,480,985,510);
   		 g2d.drawLine(965,520,945,559);
		 g2d.drawLine(965,520,985,559);

         // 4º personagem -> plateia
          g2d.setColor(Color.black);
		  g2d.drawOval(950,335,30,30);
		  g2d.drawLine(965,365,965,405);
		  g2d.drawLine(965,365,945,395);
		  g2d.drawLine(965,365,985,395);
		  g2d.drawLine(965,405,945,444);
		  g2d.drawLine(965,405,985,444);

         // 5º personagem -> goleiro
          g2d.setColor(Color.black);
		  g2d.drawOval(436,100+10,30,30);
		  g2d.drawLine(451,130+10,451,170+10);
		  g2d.drawLine(451,130+10,431,160+10);
		  g2d.drawLine(451,130+10,471,160+10);
		  g2d.drawLine(451,170+10,431,209+10);
		  g2d.drawLine(451,170+10,471,209+10);



//-----------------dialogo entre os jogadores-------------------------------------------------



          // 1º personagem -> jogador com a bola


		   try {
		   	   Thread.sleep(2000);
		   	   }
		   	  catch (InterruptedException interruptedException) {}



		   Polygon dialogo1 = new Polygon();
           Polygon dialogo2 = new Polygon();
		   g.setColor(Color.white);
		   dialogo1.addPoint(60,640);
		   dialogo1.addPoint(85,630);
		   dialogo1.addPoint(70,630);
           g.fillPolygon(dialogo1);

           dialogo2.addPoint(70,630);
		   dialogo2.addPoint(70,570);
		   dialogo2.addPoint(210,570);
		   dialogo2.addPoint(210,630);
           g.fillPolygon(dialogo2);



            // 2º personagem -> outro jogador

            Polygon dialogo3 = new Polygon();
		    Polygon dialogo4 = new Polygon();
		    g.setColor(Color.white);
		    dialogo3.addPoint(60,525);
		    dialogo3.addPoint(85,515);
		   	dialogo3.addPoint(70,515);
		    g.fillPolygon(dialogo3);

		    dialogo4.addPoint(70,515);
		   	dialogo4.addPoint(70,455);
		    dialogo4.addPoint(210,455);
		    dialogo4.addPoint(210,515);
		    g.fillPolygon(dialogo4);


          // conversa1 dos outros dois


            Polygon dialogo5 = new Polygon();
		    Polygon dialogo6 = new Polygon();
            g.setColor(Color.white);
            dialogo5.addPoint(935,350);
            dialogo5.addPoint(910,340);
            dialogo5.addPoint(925,340);
            g.fillPolygon(dialogo5);

            dialogo6.addPoint(925,340);
            dialogo6.addPoint(925,280);
            dialogo6.addPoint(785,280);
            dialogo6.addPoint(785,340);
            g.fillPolygon(dialogo6);


            Polygon dialogo7 = new Polygon();
		    Polygon dialogo8 = new Polygon();
            g.setColor(Color.white);
            dialogo7.addPoint(935,435);
            dialogo7.addPoint(910,425);
            dialogo7.addPoint(925,425);
            g.fillPolygon(dialogo7);

            dialogo8.addPoint(925,425);
            dialogo8.addPoint(925,365);
            dialogo8.addPoint(785,365);
            dialogo8.addPoint(785,425);
            g.fillPolygon(dialogo8);





              conversa1(g,dialogo1,dialogo2,dialogo3,dialogo4,dialogo5,dialogo6,
                         dialogo7,dialogo8);

			  try {
			  	Thread.sleep(1500);
			  	}
			    catch (InterruptedException interruptedException) {}








         // intervalo de tempo para o movimento dos jogadores
            try {
		 		Thread.sleep(1000);
		 		}
		 	catch (InterruptedException interruptedException) {}



                     // pinta a imagem do jogador com a cor atual
                     g2d.setColor(Color.green);
		    		 g2d.drawOval(25,625,30,30);
		    		 g2d.drawLine(40,655,40,695);
		    		 g2d.drawLine(40,655,20,685);
		    		 g2d.drawLine(40,655,60,685);
		    		 g2d.drawLine(40,695,20,734);
		    		 g2d.drawLine(40,695,60,734);
















 //------------- menino com a bola---movimento---------------------------------------------------

         for( w=0;w<=650;w+=25) {

		     b=20+w;
		     g2d.setColor(Color.black);
		     g2d.drawOval(5+w,625,30,30); // movimento da cabeça
		     g2d.drawLine(20+w,655,20+w,695); // movimento do tronco
		     g2d.drawLine(20+w,655,w,685); // movimento da braço esquerda
		     g2d.drawLine(20+w,655,40+w,685); // movimento da braço direita
		     g2d.drawLine(b,695,b-20,734); // movimento do pé esquerdo
			 g2d.drawLine(b,695,b+20,734); // movimento do pé direito



             // atraso do primeiro jogador
                 try {
			   		 Thread.sleep(60);
			   		 }
			   		catch (InterruptedException interruptedException) {}


                  try {
				 	 Thread.sleep(60);
				 	}
				 	catch (InterruptedException interruptedException) {}


               // pinta o fundo coa a cor atual
               g2d.setColor(Color.green);
			   g2d.drawOval(5+w,625,30,30);
			   g2d.drawLine(20+w,655,20+w,695);
			   g2d.drawLine(20+w,655,w,685);
			   g2d.drawLine(20+w,655,40+w,685);
			   g2d.drawLine(b,695,b-20,734);
			   g2d.drawLine(b,695,b+20,734);


          } // fim do for


           //b = 669; w = 649;

           		g2d.setColor(Color.black);
		        g2d.drawOval(w-20,625,30,30);
		   		g2d.drawLine(w-5,655,w-5,695);
		   		g2d.drawLine(w-5,655,w-25,685);
		   		g2d.drawLine(w-5,655,w+15,685);
		   		g2d.drawLine(b,695,b-20,734);
		   	    g2d.drawLine(b,695,b+20,734);









        // atraso entre o movimento de um jogador para outro
             try {
		    	  Thread.sleep(300);
		    	 }
		    	catch (InterruptedException interruptedException) {}


               // pinta a imagem do jogador com a cor atual
               g2d.setColor(Color.green);
			   g2d.drawOval(25,510,30,30);
		       g2d.drawLine(40,540,40,580);
    	       g2d.drawLine(40,540,20,570);
		       g2d.drawLine(40,540,60,570);
		       g2d.drawLine(40,580,20,619);
		       g2d.drawLine(40,580,60,619);



//----------- outro menino do jogo--------movimento---------------------------------------------


         for( w=0;w<=650;w+=25) {

			   b=20+w;
               g2d.setColor(Color.black);
			   g2d.drawOval(5+w,510,30,30);
			   g2d.drawLine(20+w,540,20+w,580);
			   g2d.drawLine(20+w,540,w,570);
		       g2d.drawLine(20+w,540,40+w,570);// movimento da braço
			   g2d.drawLine(b,580,b-20,619);
			   g2d.drawLine(b,580,b+20,619);




               try {
			 	Thread.sleep(60);
			 		}
			 	   catch (InterruptedException interruptedException) {}


			    try {
			 	 Thread.sleep(60);
			 		}
			 	   catch (InterruptedException interruptedException) {}

			     // pinta o fundo com a cor atual
			    g2d.setColor(Color.green);
			   	g2d.drawOval(5+w,510,30,30);
			   	g2d.drawLine(20+w,540,20+w,580);
			   	g2d.drawLine(20+w,540,w,570);
			    g2d.drawLine(20+w,540,40+w,570);
			    g2d.drawLine(b,580,b-20,619);
			   	g2d.drawLine(b,580,b+20,619);





		} // fim do for


           		g2d.setColor(Color.black);
		 		g2d.drawOval(w-20,510,30,30);
		   	    g2d.drawLine(w-5,540,w-5,580);
		   		g2d.drawLine(w-5,540,w-25,570);
		   		g2d.drawLine(w-5,540,w+15,570);
		   	    g2d.drawLine(b,580,b-20,619);
		   	    g2d.drawLine(b,580,b+20,619);







        // parada para o movimento do braço
               try {

			    Thread.sleep(100);

			        }
		         catch (InterruptedException interruptedException) {}



               // dialogo antes do movimento do braço


               Polygon dialogo9 = new Polygon();
			   Polygon dialogo10 = new Polygon();
			   g.setColor(Color.white);
			   dialogo9.addPoint(w-20-35,525);
			   dialogo9.addPoint(w-20-60,515);
			   dialogo9.addPoint(w-20-45,515);
			   g.fillPolygon(dialogo9);

			   dialogo10.addPoint(w-20-45,515);
			   dialogo10.addPoint(w-20-45,455);
			   dialogo10.addPoint(w-20-185,455);
			   dialogo10.addPoint(w-20-185,515);
			   g.fillPolygon(dialogo10);

               g.setColor(Color.black);
               g.drawString("Vem pra cima",w-20-180,465);
               g.drawString("Seu ruim",w-20-180,475);


            try {

			    Thread.sleep(1000);

				}
			  catch (InterruptedException interruptedException) {}




          // for do movimento do braço

          for (int i=1; i<=3 ;i++)  {



		             try {
		  		  		Thread.sleep(100);
		  		  		}
		  		  	catch (InterruptedException interruptedException) {}








                // braço abaixado
		        g2d.setColor(Color.black);
		        g2d.drawOval(w-20,510,30,30);
		        g2d.drawLine(w-5,540,w-5,580);
		        g2d.drawLine(w-5,540,w-25,570);
		        g2d.drawLine(w-5,540,w+15,570);// movimento da braço x1=x2 y=+20
		        g2d.drawLine(b,580,b-20,619);
		        g2d.drawLine(b,580,b+20,619);

               try {
		  		  Thread.sleep(200);
		  		   }
		  	     catch (InterruptedException interruptedException) {}



              try {
				Thread.sleep(200);
					}
				catch (InterruptedException interruptedException) {}

			   g2d.setColor(Color.green);
               g2d.drawOval(w-20,510,30,30);
			   g2d.drawLine(w-5,540,w-5,580);
			   g2d.drawLine(w-5,540,w-25,570);
			   g2d.drawLine(w-5,540,w+15,570);
			   g2d.drawLine(b,580,b-20,619);
			   g2d.drawLine(b,580,b+20,619);


               // braço erguido
               g2d.setColor(Color.black);
               g2d.drawOval(w-20,510,30,30);
		  	   g2d.drawLine(w-5,540,w-5,580);
		  	   g2d.drawLine(w-5,540,w-25,570);
		  	   g2d.drawLine(w-5,540,w+15+20,540);
		  	   g2d.drawLine(b,580,b-20,619);
		  	   g2d.drawLine(b,580,b+20,619);


              try {
		   		  	Thread.sleep(200);
		   		  }
		  	       catch (InterruptedException interruptedException) {}





             try {
		  		  Thread.sleep(200);
		  		 }
		  	      catch (InterruptedException interruptedException) {}

                  g2d.setColor(Color.green);

                   g2d.drawOval(w-20,510,30,30);
		  		   g2d.drawLine(w-5,540,w-5,580);
		  		   g2d.drawLine(w-5,540,w-25,570);
		  		   g2d.drawLine(w-5,540,w+15+20,540);
		  		   g2d.drawLine(b,580,b-20,619);
		  		   g2d.drawLine(b,580,b+20,619);




                 if( i==2) {

					 g.setColor(Color.green);
					 g.fillPolygon(dialogo9);
					 g.fillPolygon(dialogo10);

				  }



	  }


                // braço abaixado
                g2d.setColor(Color.black);
	   		    g2d.drawOval(w-20,510,30,30);
	   		    g2d.drawLine(w-5,540,w-5,580);
	   		    g2d.drawLine(w-5,540,w-25,570);
	   		    g2d.drawLine(w-5,540,w+15,570);// movimento da braço
	   		    g2d.drawLine(b,580,b-20,619);
	   		    g2d.drawLine(b,580,b+20,619);









//---------------------------movimento do drible----------------------------------------------


            try {
		  		Thread.sleep(1000);
		  	   }
		  	  catch (InterruptedException interruptedException) {}

            g.setColor(Color.green);
			g2d.drawOval(w-20,625,30,30);
		    g2d.drawLine(w-5,655,w-5,695);
			g2d.drawLine(w-5,655,w-25,685);
			g2d.drawLine(w-5,655,w+15,685);
			g2d.drawLine(b,695,b-20,734);
			g2d.drawLine(b,695,b+20,734); // movimento da perna


            g.setColor(Color.black);
            g2d.drawOval(w-20,625,30,30);
		    g2d.drawLine(w-5,655,w-5,695);
		    g2d.drawLine(w-5,655,w-25,685);
		   	g2d.drawLine(w-5,655,w+15,685);
		   	g2d.drawLine(b,695,b-20,734);
		   	g2d.drawLine(b,695,b+20,690); // movimento da perna

            try {
				Thread.sleep(500); // 1000
				}
		   catch (InterruptedException interruptedException) {}

            g.setColor(Color.green);
            g2d.drawOval(w-20,625,30,30);
			g2d.drawLine(w-5,655,w-5,695);
			g2d.drawLine(w-5,655,w-25,685);
			g2d.drawLine(w-5,655,w+15,685);
			g2d.drawLine(b,695,b-20,734);
			g2d.drawLine(b,695,b+20,690); // movimento da perna


            g.setColor(Color.black);
            g2d.drawOval(w-20,625,30,30);
			g2d.drawLine(w-5,655,w-5,695);
			g2d.drawLine(w-5,655,w-25,685);
			g2d.drawLine(w-5,655,w+15,685);
			g2d.drawLine(b,695,b-20,734);
			g2d.drawLine(b,695,b+20,734); // movimento da perna

            try {
		   		Thread.sleep(500);
		   		}
		   		catch (InterruptedException interruptedException) {}

           g.setColor(Color.green);
           g2d.fillOval(680,690,25,25);





 //-----------movimento da bola-----------------------------------------------------------------

     for (  j=690; j>= 350; j-=20 ) {

          t = 10;
          g.setColor(Color.black);
		  g2d.fillOval(680-t,j,25,25);

		   try {
		  		Thread.sleep(60);
		  	   }
		  	  catch (InterruptedException interruptedException) {}

          g.setColor(Color.green);
		  g2d.fillOval(680-t,j,25,25);
          g2d.drawOval(w-20,510,30,30);

		  g.setColor(Color.black);

		  //1º jogador
		  g2d.drawOval(w-20,625,30,30);
		  g2d.drawLine(w-5,655,w-5,695);
		  g2d.drawLine(w-5,655,w-25,685);
		  g2d.drawLine(w-5,655,w+15,685);
		  g2d.drawLine(b,695,b-20,734);
		  g2d.drawLine(b,695,b+20,734);
          // 2º jogador
		  g2d.drawOval(w-20,510,30,30);
		  g2d.drawLine(w-5,540,w-5,580);
		  g2d.drawLine(w-5,540,w-25,570);
		  g2d.drawLine(w-5,540,w+15,570);
		  g2d.drawLine(b,580,b-20,619);
		  g2d.drawLine(b,580,b+20,619);

		  }



         g.setColor(Color.black);
		 g2d.fillOval(670,350,25,25);


//-------------movimento do jogador após o drible-------------------------------------------

         for ( t=0;t<=80;t+=20) {

          g2d.drawOval(w-20-t,625,30,30);
		  g2d.drawLine(w-5-t,655,w-5-t,695);
		  g2d.drawLine(w-5-t,655,w-25-t,685);
		  g2d.drawLine(w-5-t,655,w+15-t,685);
		  g2d.drawLine(b-t,695,b-20-t,734);
		  g2d.drawLine(b-t,695,b+20-t,734);

           try {
		  	  Thread.sleep(100);
		  	   }
		  	catch (InterruptedException interruptedException) {}



          g.setColor(Color.green);
          g2d.drawOval(w-20-t,625,30,30);
		  g2d.drawLine(w-5-t,655,w-5-t,695);
		  g2d.drawLine(w-5-t,655,w-25-t,685);
		  g2d.drawLine(w-5-t,655,w+15-t,685);
		  g2d.drawLine(b-t,695,b-20-t,734);
		  g2d.drawLine(b-t,695,b+20-t,734);


}


          g.setColor(Color.black);
          g2d.drawOval(w-20-t,625,30,30);
		  g2d.drawLine(w-5-t,655,w-5-t,695);
		  g2d.drawLine(w-5-t,655,w-25-t,685);
		  g2d.drawLine(w-5-t,655,w+15-t,685);
		  g2d.drawLine(b-t,695,b-20-t,734);
		  g2d.drawLine(b-t,695,b+20-t,734);



        for (  j=0; j<= 354; j+=20 ) {

         g.setColor(Color.black);
         g2d.drawOval(w-20-t,625-j,30,30);
		 g2d.drawLine(w-5-t,655-j,w-5-t,695-j);
		 g2d.drawLine(w-5-t,655-j,w-25-t,685-j);
		 g2d.drawLine(w-5-t,655-j,w+15-t,685-j);
		 g2d.drawLine(b-t,695-j,b-20-t,734-j);
		 g2d.drawLine(b-t,695-j,b+20-t,734-j);


         try {
		  	  Thread.sleep(100);
		  	   }
		  	catch (InterruptedException interruptedException) {}


         g.setColor(Color.green);
         g2d.drawOval(w-20-t,625-j,30,30);
		 g2d.drawLine(w-5-t,655-j,w-5-t,695-j);
		 g2d.drawLine(w-5-t,655-j,w-25-t,685-j);
		 g2d.drawLine(w-5-t,655-j,w+15-t,685-j);
		 g2d.drawLine(b-t,695-j,b-20-t,734-j);
		 g2d.drawLine(b-t,695-j,b+20-t,734-j);



 }


         g.setColor(Color.black);
         g2d.drawOval(w-20-t,625-j,30,30);
		 g2d.drawLine(w-5-t,655-j,w-5-t,695-j);
		 g2d.drawLine(w-5-t,655-j,w-25-t,685-j);
		 g2d.drawLine(w-5-t,655-j,w+15-t,685-j);
		 g2d.drawLine(b-t,695-j,b-20-t,734-j);
		 g2d.drawLine(b-t,695-j,b+20-t,734-j);


         try {
		  	 Thread.sleep(100);
		  	  }
		  	catch (InterruptedException interruptedException) {}

         g.setColor(Color.black);
         g2d.drawOval(w-20-t,625-j,30,30);
		 g2d.drawLine(w-5-t,655-j,w-5-t,695-j);
		 g2d.drawLine(w-5-t,655-j,w-25-t,685-j);
		 g2d.drawLine(w-5-t,655-j,w+15-t,685-j);
		 g2d.drawLine(b-t,695-j,b-20-t,734-j);
		 g2d.drawLine(b-t,695-j,b+20-t,734-j);

         try {
		 	Thread.sleep(100);
		 	 }
		  	 catch (InterruptedException interruptedException) {}

         g.setColor(Color.green);
		 g2d.drawOval(w-20-t,625-j,30,30);
		 g2d.drawLine(w-5-t,655-j,w-5-t,695-j);
		 g2d.drawLine(w-5-t,655-j,w-25-t,685-j);
		 g2d.drawLine(w-5-t,655-j,w+15-t,685-j);
		 g2d.drawLine(b-t,695-j,b-20-t,734-j);
		 g2d.drawLine(b-t,695-j,b+20-t,734-j);



        for ( t=80;t>=0;t-=20) {

         g.setColor(Color.black);
		 g2d.drawOval(w-20-t,625-j,30,30);
		 g2d.drawLine(w-5-t,655-j,w-5-t,695-j);
		 g2d.drawLine(w-5-t,655-j,w-25-t,685-j);
		 g2d.drawLine(w-5-t,655-j,w+15-t,685-j);
		 g2d.drawLine(b-t,695-j,b-20-t,734-j);
		 g2d.drawLine(b-t,695-j,b+20-t,734-j);


           try {
		  	   Thread.sleep(100);
		  	   }
		  	  catch (InterruptedException interruptedException) {}


         g.setColor(Color.green);
		 g2d.drawOval(w-20-t,625-j,30,30);
		 g2d.drawLine(w-5-t,655-j,w-5-t,695-j);
		 g2d.drawLine(w-5-t,655-j,w-25-t,685-j);
		 g2d.drawLine(w-5-t,655-j,w+15-t,685-j);
		 g2d.drawLine(b-t,695-j,b-20-t,734-j);
		 g2d.drawLine(b-t,695-j,b+20-t,734-j);



   }


         g.setColor(Color.black);
		 g2d.drawOval(w-20,625-j,30,30);
		 g2d.drawLine(w-5,655-j,w-5,695-j);
		 g2d.drawLine(w-5,655-j,w-25,685-j);
		 g2d.drawLine(w-5,655-j,w+15,685-j);
		 g2d.drawLine(b,695-j,b-20,734-j);
		 g2d.drawLine(b,695-j,b+20,734-j);



 //------------movimento do chute ao gol--------------------------------------------------------


                 try {
		 		  	  Thread.sleep(1000);
		 		  	  }
		 		  	 catch (InterruptedException interruptedException) {}

          g.setColor(Color.green);
		  g2d.drawOval(w-20,625-j,30,30);
		  g2d.drawLine(w-5,655-j,w-5,695-j);
		  g2d.drawLine(w-5,655-j,w-25,685-j);
		  g2d.drawLine(w-5,655-j,w+15,685-j);
		  g2d.drawLine(b,695-j,b-20,734-j);
		  g2d.drawLine(b,695-j,b+20,734-j);

          g.setColor(Color.black);
		  g2d.drawOval(w-20,625-j,30,30);
		  g2d.drawLine(w-5,655-j,w-5,695-j);
		  g2d.drawLine(w-5,655-j,w-25,685-j);
		  g2d.drawLine(w-5,655-j,w+15,685-j);
		  g2d.drawLine(b,695-j,b-20,734-j);
		  g2d.drawLine(b,695-j,b+20,350);


          try {
		  	 Thread.sleep(200);
		  	  }
		 	 catch (InterruptedException interruptedException) {}

            g.setColor(Color.green);
			g2d.drawOval(w-20,625-j,30,30);
			g2d.drawLine(w-5,655-j,w-5,695-j);
			g2d.drawLine(w-5,655-j,w-25,685-j);
			g2d.drawLine(w-5,655-j,w+15,685-j);
			g2d.drawLine(b,695-j,b-20,734-j);
			g2d.drawLine(b,695-j,b+20,350);

             g.setColor(Color.black);
			 g2d.fillOval(670,350,25,25);

            g.setColor(Color.black);
			g2d.drawOval(w-20,625-j,30,30);
			g2d.drawLine(w-5,655-j,w-5,695-j);
			g2d.drawLine(w-5,655-j,w-25,685-j);
			g2d.drawLine(w-5,655-j,w+15,685-j);
			g2d.drawLine(b,695-j,b-20,734-j);
			g2d.drawLine(b,695-j,b+20,734-j);

            try {
				Thread.sleep(500);
			    }
			 catch (InterruptedException interruptedException) {}

           g.setColor(Color.green);
           g2d.fillOval(670,350,25,25);





//------------------movimento da bola após ao chute ao gol -------------------------------------------





      a = 340;

      for ( j=650;j>=320;j-=35) {


	    a = a-19; // -19

        g.setColor(Color.black);
        g2d.fillOval(j,a,25,25);


        try {
			Thread.sleep(100);
			 }
			catch (InterruptedException interruptedException) {}



        if( a==226) {

			g.setColor(Color.green);
		    g2d.fillOval(j,a,25,25);

			a=a-31;


             }

         g.setColor(Color.green);
		 g2d.fillOval(j,a,25,25);

          g.setColor(Color.black);
		  g2d.drawOval(w-20,265,30,30);
		  g2d.drawLine(w-5,295,w-5,335);
		  g2d.drawLine(w-5,295,w-25,325);
		  g2d.drawLine(w-5,295,w+15,325);
		  g2d.drawLine(w-5,335,w-25,374);
		  g2d.drawLine(w-5,335,w+15,374);








         if( a<200) {

          g.setColor(Color.blue);
		  g2d.fillOval(j,a,25,25);

}

}

     g.setColor(Color.black);
	 g2d.fillOval(320,a,25,25);



//-------------------goleiro defendendo------------------------------------------------------

          g2d.setColor(Color.blue);
		  g2d.drawOval(436,100+10,30,30);
		  g2d.drawLine(451,130+10,451,170+10);
		  g2d.drawLine(451,130+10,431,160+10);
		  g2d.drawLine(451,130+10,471,160+10);
		  g2d.drawLine(451,180,431,219);
		  g2d.drawLine(451,180,471,219);



           g2d.setColor(Color.black);
           g2d.drawOval(350,110,30,30);
		   g2d.drawLine(365,140,365,180);
		   g2d.drawLine(365,140,340,130);
		   g2d.drawLine(365,140,385,170);
		   g2d.drawLine(365,180,345,219);
		   g2d.drawLine(365,180,385,219);



      try {
	  		  			Thread.sleep(100);
	  		  			 }
	  			catch (InterruptedException interruptedException) {}













//--------------movimento da bola apos a defesa------------------------------------------------


       g.setColor(Color.blue);
       g2d.fillOval(320,a,25,25);

       g2d.setColor(Color.black);
	   g2d.drawOval(350,110,30,30);
	   g2d.drawLine(365,140,365,180);
	   g2d.drawLine(365,140,340,130);
	   g2d.drawLine(365,140,385,170);
	   g2d.drawLine(365,180,345,219);
	   g2d.drawLine(365,180,385,219);





    a=140;

     while(a<=330) {

		  g.setColor(Color.black);
		  g2d.fillOval(320,a,25,25);

          try {
		  			Thread.sleep(100);
		  			 }
			catch (InterruptedException interruptedException) {}

         if (a<200) {

         g.setColor(Color.blue);
         g2d.fillOval(320,a,25,25);

	   }

         else {
         g.setColor(Color.green);
          g2d.fillOval(320,a,25,25);

		  }


	 a=a+40;

	 }
       g.setColor(Color.black);
       g2d.fillOval(320,a,25,25);







//-------------------jogador finalizando pela segunda vez----------------------------------------------




         try {
		 	Thread.sleep(200);
		 	 }
		 	catch (InterruptedException interruptedException) {}





                g.setColor(Color.green);
	 			g2d.drawOval(w-20,265,30,30);
	 			g2d.drawLine(w-5,295,w-5,335);
	 			g2d.drawLine(w-5,295,w-25,325);
	 			g2d.drawLine(w-5,295,w+15,325);
	 			g2d.drawLine(w-5,335,w-25,374);
	 			g2d.drawLine(w-5,335,w+15,374);


        for(w=650;w>=340;w-=20) {



		 g.setColor(Color.black);
		 g2d.drawOval(w-20,271,30,30);
		 g2d.drawLine(w-5,301,w-5,341);
		 g2d.drawLine(w-5,301,w-25,331);
		 g2d.drawLine(w-5,301,w+15,331);
		 g2d.drawLine(w-5,341,w-25,380);
		 g2d.drawLine(w-5,341,w+15,380);


         try {
		 	Thread.sleep(100);
		 	  }
		    catch (InterruptedException interruptedException) {}


         g.setColor(Color.green);
		 g2d.drawOval(w-20,271,30,30);
		 g2d.drawLine(w-5,301,w-5,341);
		 g2d.drawLine(w-5,301,w-25,331);
		 g2d.drawLine(w-5,301,w+15,331);
		 g2d.drawLine(w-5,341,w-25,380);
		 g2d.drawLine(w-5,341,w+15,380);


}


          g.setColor(Color.black);
		  g2d.drawOval(w-20,271,30,30);
		  g2d.drawLine(w-5,301,w-5,341);
		  g2d.drawLine(w-5,301,w-25,331);
		  g2d.drawLine(w-5,301,w+15,331);
		  g2d.drawLine(w-5,341,w-25,380);
		  g2d.drawLine(w-5,341,w+15,380);


           try {
		  	  Thread.sleep(100);
		  	   }
		  	   catch (InterruptedException interruptedException) {}



           g.setColor(Color.green);
		   g2d.drawOval(w-20,271,30,30);
		   g2d.drawLine(w-5,301,w-5,341);
		   g2d.drawLine(w-5,301,w-25,331);
		   g2d.drawLine(w-5,301,w+15,331);
		   g2d.drawLine(w-5,341,w-25,380);
		   g2d.drawLine(w-5,341,w+15,380);



            g.setColor(Color.black);
		   	g2d.drawOval(w-20,271,30,30);
		   	g2d.drawLine(w-5,301,w-5,341);
		   	g2d.drawLine(w-5,301,w-25,331);
		    g2d.drawLine(w-5,301,w+15,331);
		   	g2d.drawLine(w-5,320,w-25,a);
		   	g2d.drawLine(w-5,341,w+15,380);

            try {
				Thread.sleep(100);
				 }
			   catch (InterruptedException interruptedException) {}


            g.setColor(Color.green);
			g2d.drawOval(w-20,271,30,30);
			g2d.drawLine(w-5,301,w-5,341);
			g2d.drawLine(w-5,301,w-25,331);
			g2d.drawLine(w-5,301,w+15,331);
			g2d.drawLine(w-5,320,w-25,a);
			g2d.drawLine(w-5,341,w+15,380);


             g.setColor(Color.black);
			 g2d.drawOval(w-20,271,30,30);
			 g2d.drawLine(w-5,301,w-5,341);
			 g2d.drawLine(w-5,301,w-25,331);
			 g2d.drawLine(w-5,301,w+15,331);
			 g2d.drawLine(w-5,341,w-25,380);
			 g2d.drawLine(w-5,341,w+15,380);





// ----------------------movimento da bola no gol-------------------------------------------------





       g.setColor(Color.green);
       g2d.fillOval(320,a,25,25);

       g.setColor(Color.black);
	   g2d.drawOval(w-20,271,30,30);
	   g2d.drawLine(w-5,301,w-5,341);
	   g2d.drawLine(w-5,301,w-25,331);
	   g2d.drawLine(w-5,301,w+15,331);
	   g2d.drawLine(w-5,341,w-25,380);
	   g2d.drawLine(w-5,341,w+15,380);


      a=360;

      for ( j=320;j<=380;j+=20) {

		a=a-60;


       g.setColor(Color.black);
       g2d.fillOval(j,a,25,25);

       try {
	   	  Thread.sleep(100);
	   	   }
	   	   catch (InterruptedException interruptedException) {}

	   g.setColor(Color.green);
	   g2d.fillOval(j,a,25,25);

       g.setColor(Color.black);
	   g2d.drawOval(w-20,271,30,30);
	   g2d.drawLine(w-5,301,w-5,341);
	   g2d.drawLine(w-5,301,w-25,331);
	   g2d.drawLine(w-5,301,w+15,331);
	   g2d.drawLine(w-5,341,w-25,380);
	   g2d.drawLine(w-5,341,w+15,380);


          if ( a < 200) {

           g.setColor(Color.blue);
		   g2d.fillOval(j,a,25,25);

                   g2d.setColor(Color.black);
		           g2d.drawOval(350,110,30,30);
		   		   g2d.drawLine(365,140,365,180);
		   		   g2d.drawLine(365,140,340,130);
		   		   g2d.drawLine(365,140,385,170);
		   		   g2d.drawLine(365,180,345,219);
		   		   g2d.drawLine(365,180,385,219);



   }


} // fim do for


       g.setColor(Color.black);
       g2d.fillOval(j,a,25,25);



      // desenha uma String GOL

    for (int i=0;i<=280;i+=35) {

        g.setColor(Color.white);
	    g.setFont(new Font("Arial", Font.BOLD, 30 ));
	    g.drawString("GOL !", i ,80  );

         try {
					 Thread.sleep(500);
				     }
					catch (InterruptedException interruptedException) {}


         g.setColor(Color.blue);
	     g.drawString("GOL !", i ,80  );


	}


        try {
		   Thread.sleep(1000);
			}
	   	   catch (InterruptedException interruptedException) {}

         g2d.setColor(Color.blue);
		 g2d.drawOval(350,110,30,30);
		 g2d.drawLine(365,140,365,180);
		 g2d.drawLine(365,140,340,130);
	     g2d.drawLine(365,140,385,170);
		 g2d.drawLine(365,180,345,219);
		 g2d.drawLine(365,180,385,219);


         g2d.setColor(Color.black);
	     g2d.drawOval(350,110,30,30);
	   	 g2d.drawLine(365,140,365,180);
	   	 g2d.drawLine(365,140,345,170);
	   	 g2d.drawLine(365,140,385,170);
	   	 g2d.drawLine(365,180,345,219);
	   	 g2d.drawLine(365,180,385,219);

           try {
		 	  Thread.sleep(500);
		 	   }
		 	  catch (InterruptedException interruptedException) {}


         g.setColor(Color.green);
		 g2d.drawOval(w-20,271,30,30);
		 g2d.drawLine(w-5,301,w-5,341);
		 g2d.drawLine(w-5,301,w-25,331);
		 g2d.drawLine(w-5,301,w+15,331);
		 g2d.drawLine(w-5,341,w-25,380);
		 g2d.drawLine(w-5,341,w+15,380);



	     g.setColor(Color.black);
		 g2d.drawOval(w-20,271,30,30);
		 g2d.drawLine(w-5,301,w-5,341);
		 g2d.drawLine(w-5,301,w-25,291);
		 g2d.drawLine(w-5,301,w+15,331);
		 g2d.drawLine(w-5,341,w-25,380);
		 g2d.drawLine(w-5,341,w+15,380);



	          try {
	   		   Thread.sleep(1000);
	   			}
	   	   	   catch (InterruptedException interruptedException) {}



         g.setColor(Color.white);
         g.fillPolygon(dialogo5);
         g.fillPolygon(dialogo6);
         g.fillPolygon(dialogo7);
         g.fillPolygon(dialogo8);

         Polygon dialogo11 = new Polygon();
		 Polygon dialogo12 = new Polygon();
		 g.setColor(Color.white);
		 dialogo11.addPoint(w-25+35,286);
		 dialogo11.addPoint(w-25+25,276);
		 dialogo11.addPoint(w-25+10,276);
		 g.fillPolygon(dialogo11);

		 dialogo12.addPoint(w-25+10,276);
		 dialogo12.addPoint(w-25+10,216);
		 dialogo12.addPoint(w-25+150,216);
		 dialogo12.addPoint(w-25+150,276);
		 g.fillPolygon(dialogo12);




         conversa2(g,dialogo11,dialogo12,dialogo3,dialogo4,dialogo5,dialogo6,
		              dialogo7,dialogo8);










        try {
		  		Thread.sleep(6000);
		  		}
		  	   catch (InterruptedException interruptedException) {}




// -----------------fim da Animação-----------------------------------------------------------


    for (int s = 0; s <= 800; s += 80) {

        g.setColor(Color.blue);
        g.fillRect(0, 0, 1200, 800);

        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 100 ));
        g.drawString("Fim!!", 100 , s );

         if (s != 240) {

		 			 try {
		 			   	 Thread.sleep(500);
		 			     }
		 			   catch (Exception u) {}


		 			   		            }
		 			 else {

		 			     try {
		 			        Thread.sleep(3000);
		 			   		 }
		 			   		 catch (Exception u) {}

		 								}


		                        if (s < 800) {
		 					  		    g.setColor(Color.blue);
		 				                g.fillRect(0, 0, 1200 , 800 );


							   }






} // fim do for





} // fim do metodo paint





     // metodo para os dialogos

    public void conversa1 (Graphics g,Polygon dialogo1,Polygon dialogo2,
                                      Polygon dialogo3,Polygon dialogo4,
                                      Polygon dialogo5,Polygon dialogo6,
                                      Polygon dialogo7,Polygon dialogo8)   {




	    for (int i = 0; i <= 6; i++)  {

	      g.setColor(Color.black);
	   	  g.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));


	   	  if (i == 1) {

	   	  g.drawString("Vamos jogar futebol",90,585);


	        try {
	   		   Thread.sleep(1500);
	   		    }
	   		  catch (InterruptedException interruptedException) {}

	      g.drawString("Vamos !!",90,470);

	        try {
			  Thread.sleep(2500);
			    }
	   		  catch (InterruptedException interruptedException) {}



		 g.drawString("Eu vou ficar só olhando",805,295);


		    try {
				Thread.sleep(1600);
			    }
			  catch (InterruptedException interruptedException) {}


		g.drawString(" Eu também",805,380);




					    try {
							Thread.sleep(2000);
						    }
						  catch (InterruptedException interruptedException) {}




		}

	        else if ( i==2 || i==4 ) {

                g.setColor(Color.white);
                g.fillPolygon(dialogo1);
                g.fillPolygon(dialogo2);
                g.fillPolygon(dialogo3);
                g.fillPolygon(dialogo4);
                g.fillPolygon(dialogo5);
                g.fillPolygon(dialogo6);

                g.setColor(Color.green);
                g.fillPolygon(dialogo7);
                g.fillPolygon(dialogo8);

                g.setColor(Color.black);

	   		   try {
					 Thread.sleep(500);
				     }
	   		        catch (InterruptedException interruptedException) {}


			}

	   			else if ( i == 3) {

			   	  g.drawString("como eu sou um ",90,585);
	              g.drawString("craque no futebol ",90,595);
	              g.drawString("eu fico coma bola !!!",90,605);
	              g.drawString("kkkkkkkkkkk ",90,615);

	                try {
	   		             Thread.sleep(2500);
	   		            }
	   		           catch (InterruptedException interruptedException) {}

	              g.drawString("então eu sou o zagueiro",90,470);
	              g.drawString("mas eu sou o ",90,480);
	              g.drawString("melhor jogador",90,490);
                  g.drawString("claro!!!",90,500);
                   try {
				   	    Thread.sleep(3000);
				   	   }
				   	   catch (InterruptedException interruptedException) {}

			 }

                else if ( i == 5 ) {

                  g.drawString("então Vamos !",90,585);

                   try {
				  	    Thread.sleep(1500);
				  	   }
	   		           catch (InterruptedException interruptedException) {}

                  g.drawString("é vamos logo!",90,470);


			      try {
				  	 Thread.sleep(1500);
				  	  }
				  	 catch (InterruptedException interruptedException) {}

                  g.drawString("Vamos ver",805,295);
                  g.drawString("Se tu é ",805,305);
			      g.drawString("Bom mesmo",805,315);


				  try {
				  	  Thread.sleep(1500);
				  	  }
				  	 catch (InterruptedException interruptedException) {}


			}



                 else if ( i==6) {

				   g.setColor(Color.green);
				   g.fillPolygon(dialogo1);
				   g.fillPolygon(dialogo2);
				   g.fillPolygon(dialogo3);
                   g.fillPolygon(dialogo4);
                   g.fillPolygon(dialogo5);
				   g.fillPolygon(dialogo6);

			 }


} // fim do for



} // fim da classe conversa1





    public void conversa2 ( Graphics g,Polygon dialogo11,Polygon dialogo12,
                                       Polygon dialogo3,Polygon dialogo4,
                                       Polygon dialogo5,Polygon dialogo6,
                                       Polygon dialogo7,Polygon dialogo8)   {




     for (int i = 0; i <= 6; i++)  {

	 	      g.setColor(Color.black);
	 	   	  g.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));


       if ( i==1) {


           g.drawString("bonito gol",805,295);


       try {
	        Thread.sleep(1500);
		   }
		 catch (InterruptedException interruptedException) {}


            g.drawString("Realmente",805,380);
            g.drawString("Foi um",805,390);
            g.drawString("Golaço",805,400);



             try {
		   	      Thread.sleep(2500);
			   }
		   		 catch (InterruptedException interruptedException) {}

	   }

          else if(i==2) {

			  g.setColor(Color.green);
			  g.fillPolygon(dialogo5);
			  g.fillPolygon(dialogo6);
			  g.fillPolygon(dialogo7);
			  g.fillPolygon(dialogo8);

              g.setColor(Color.black);
              g.drawString("Na moral",w-25+35+30,286-55);
              g.drawString("Eu sou",w-25+35+30,286-45);
              g.drawString("muito bom",w-25+35+30,286-35);
              g.drawString("No futebol!!!",w-25+35+30,286-25);
              try {
			  	 Thread.sleep(500);
			  	  }
			  	 catch (InterruptedException interruptedException) {}



        }

    } // fim do for

}// fim da classe conversa2



 public static void main( String args[] ) {


   	   AnimacaoFutebol application = new AnimacaoFutebol();

   	      application.setDefaultCloseOperation(
   	         JFrame.EXIT_ON_CLOSE );

   	   } // fim do metodo main



} // fim da classe AnimacaoFutebol
