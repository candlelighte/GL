package pack;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Calcul extends JFrame  implements ActionListener

{
   JPanel pChiffre = new JPanel(); 
   JPanel pSigne = new JPanel();   
   JPanel pSaisie = new JPanel(); 

   //Declaration des bouttons
   JButton b1 = new  JButton("1");
   JButton b2= new  JButton("2");
   JButton b3 = new  JButton("3");
   JButton b4 = new  JButton("4");
   JButton b5 = new  JButton("5");
   JButton b6 = new  JButton("6");
   JButton b7 = new  JButton("7");
   JButton b8 = new  JButton("8");
   JButton b9 = new  JButton("9");
   JButton b0 = new  JButton("0");
   JButton bPoint = new  JButton(".");
   JButton bEgal = new  JButton("=");
   JButton bMoins = new  JButton("-");
   JButton bPlus = new  JButton("+");
   JButton bFois = new  JButton("*");
   JButton bDiv = new  JButton("/");
   JButton bC = new  JButton("C");
   TextField cSaisie = new TextField(20); //Zone de saisie


   
   private String[] stocRes = new String[20];

   private int i = 0;

   static final int LARGEUR =  210;
   static final int LONGUEUR =  215;

   //cRes est une variable qui permet de stocker l’expression à évaluer
   private String cRes = "";

   //Prend Vraie si une erreur s'est produite
   private boolean erreur = false;

   public Calcul()
   {
     //On définit l'événement de fermeture de la fenêtre grâce à WindowAdapter
     WindowAdapter win = new WindowAdapter()
     {
       public void windowClosing(WindowEvent e)
       //Si on clique sur le bouton fermeture, on quitte le programme
       {System.exit(0);}
     };

     //On ajoute l'événement à notre fenêtre.
     addWindowListener(win);

       //On définit les événements pour les boutons.
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       bPlus.addActionListener(this);
       bMoins.addActionListener(this);
       bDiv.addActionListener(this);
       bFois.addActionListener(this);
       b0.addActionListener(this);
       bEgal.addActionListener(this);
       bC.addActionListener(this);
       bPoint.addActionListener(this);

     //On appelle la fonction afficher
     afficher();
   }

    //Cette méthode permet de construire l'interface graphique
    public void afficher()
    {
       setSize(LARGEUR,LONGUEUR); //Fixer la taille
       setResizable(true); //Empêcher le redimensionnement de la fenêtre
       setTitle("Calculatrice");  //Titre de la fenêtre
       setLocationRelativeTo(null); //centrer la fenêtre

      


       

       //On définit le conteneur pour la forme principale
       Container conteneur = getContentPane();

       BorderLayout disposition = new BorderLayout();
       conteneur.setLayout(disposition);

       //On définit une font pour le champ de saisie.
      //On peut aussi laisser la font par défaut.
       Font font = new Font("TimesNewRoman",Font.BOLD,15);
       cSaisie.setFont(font );

       //On désactive le champ de saisie pour la saisie avec le clavier
       cSaisie.setEnabled(false);

       //On ajoute le champ cSaisie au panel pSaisie dans la partie nord du panel
       pSaisie.add(cSaisie);
       conteneur.add("North",pSaisie );

       //On ajoute les boutons des chiffres au panel pChiffre
       pChiffre.add(b1);
       pChiffre.add(b2);
       pChiffre.add(b3);
       pChiffre.add(b4);
       pChiffre.add(b5);
       pChiffre.add(b6);
       pChiffre.add(b7);
       pChiffre.add(b8);
       pChiffre.add(b9);
       pChiffre.add(b0);
       pChiffre.add(bPoint);
       pChiffre.add(bC);

       
       // 5 lignes et 3 colonnes, puis on ajoute le panel pChiffre dans la zone Centre du conteneur général
       GridLayout dispositionChiffres = new GridLayout(5, 3);
       pChiffre.setLayout(dispositionChiffres);
       conteneur.add("Center",pChiffre );

       //On ajoute les opérateurs au panel pSigne
       pSigne.add(bDiv);
       pSigne.add(bFois);
       pSigne.add(bMoins);
       pSigne.add(bPlus);
       pSigne.add(bEgal);

       //On lui definit la disposition GridLayout
       // soit à déposer en 5 ligne et une seule colonne
       GridLayout dispositionSignes = new GridLayout(5,1);
       pSigne.setLayout(dispositionSignes);

       //On ajoute pSigne à l'est du panel général
       conteneur.add("East",pSigne);
     }

      public void actionPerformed(ActionEvent evt)
         {
            String operateur = "+-*/"; //Les opérateurs
            String chiffres = "0123456789."; //Les chiffres

           //cas où on a appuyé sur un bouton chiffre
           //on cumule la saisie dans la variable cRes
           //Ex. si on a appuyé sur 2 puis sur 5, on aura la chaine "25"  dansla variable cRes
            if ( chiffres.indexOf(evt.getActionCommand()) != -1 )
            {
                 //X.indexOf(Y) renvoie la position de Y dans X, et renvoie -1 si Y ne se trouve pas dans X
                 cRes = cRes + evt.getActionCommand(); // getActionCommand donne le contenu du bouton.
                 cSaisie.setText(cRes); //On l'affiche
            }

            else  // Si le boutton de l'événement est un operateur
            if ( operateur.indexOf(evt.getActionCommand()) != -1 )
            {
                 //On stocke toute la chaine correspondante au chiffre saisie dans un élément du tableau
                 stocRes[i] = cRes;
                 i++; //On incremente l'indice
                 stocRes[i] = evt.getActionCommand(); //Puis on sauvegrade l'operateur
                 i++; //on avance dans le tableau
                 cRes = ""; //Puis on remis la variable qui stocke la chaine à vide.
            }
            else  //cas où on a appuyé sur le boutton =
            if ( evt.getActionCommand().equals("=") )
            {
                 double leResultat = 0;
                 //Cas particulier :
                 //Si on a rien saisi, on initialise la variable cRes à 0
                 if ( cRes.equals("") )
                 {
                   cRes = "0";
                 }
                 stocRes[i] = cRes;
                 i++;

                 //On calcule l'expression via la méthode calculer()
                 leResultat = calculer();

                 //S'il y a erreur on affiche le message Erreur comme résultat
                 if ( erreur )
                 {
                   cSaisie.setText("Erreur ");
                 }
                 else
                 { //Sinon on affiche la variable leResultat renvoyée par la fonction calculer()
                   cSaisie.setText(""+leResultat);
                 }
            }
            else
            //cas où on a appuyé sur le bouton 'C'
            if ( evt.getActionCommand().equals("C")  ) {
                 //On initialise cRes et on vide le tableau stocRes via la méthode vidertableau()
                 cRes = "0";
                 cSaisie.setText(cRes);
                 vidertableau();
            }
           
         }

         //Cette méthode évolue l'expression contenue dans le tableau stockRes
         public double calculer()
         {
           erreur = false; //Par défaut, il n y a pas d'erreur
           double resultat = 0;
           try
           {
           //On initialise le résultat au premier élément du tableau
           resultat = Double.parseDouble(stocRes[0]);

           //Si l'exception est rencontré la variable erreur est mise à true
           } catch(Exception e)
             {
               erreur = true;
               return 0;
             }

           
           
            for(int j=0; j<= i-1; j++)
            {
                 try
                 {   //Opérateur + rencontré
                     if ( stocRes[j].equals("+") )
                     {
                       resultat = resultat + Double.parseDouble(stocRes [j+1]) ;
                       j++;
                     }else
                     //Opérateur - rencontré
                     if ( stocRes[j].equals("-") )
                     {
                       resultat = resultat - Double.parseDouble(stocRes [j+1]) ;
                       j++;
                     }else
                     //Opérateur * rencontré
                     if ( stocRes[j].equals("*") )
                     {
                       resultat = resultat * Double.parseDouble(stocRes [j+1]) ;
                       j++;
                     }else
                     //Opérateur / rencontré
                     if ( stocRes[j].equals("/") )
                     {
                       resultat = resultat / Double.parseDouble(stocRes [j+1]) ;
                       j++;
                     }
                 }catch (Exception e)
                   {
                     erreur = true; //Il ya une erreur quelques part, on initialise erreur à true
                     resultat = 0;
                   }
            }
            return resultat;
         }

         //Cette méthode vide le tableau stockRes
         public void vidertableau()
         {
             for ( int j = 0; j<= stocRes.length-1;j++ )
             {
               stocRes[j] = "";
               i=0;
             }
         }

   public static void main(String[] args)
    {
      new Calcul().setVisible(true);
    }

 }