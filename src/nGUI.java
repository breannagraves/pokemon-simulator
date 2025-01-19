import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.Random;

public class nGUI {
    // frame 1, will serve as the start up window for the game
    private static JFrame startPage = new JFrame("Start");
    // frame 2, will serve as the window the battle takes place in
    private static JFrame battlePage = new JFrame("Pokemon Battle"); // frame 2

    public static void main(final String[] args) {

        startGame();
        //battle();
    }

    public static void startGame() {

        // set default close operation so JFrame closes when user wants it to
        startPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel for adding welcome message
        JPanel welcomePanel = new JPanel();

        // panel for adding image
        JPanel imagePanel = new JPanel();

        // panel for entry of players names & start button
        JPanel startPanel = new JPanel();
        // startPanel.setLayout(new BoxLayout(startPanel, BoxLayout.PAGE_AXIS));

        // jtextfield for player 1 name entry
        JTextField player1 = new JTextField("Player 1 Name: ",10);
        player1.setSize(350, 100);
        // jtextfield for player 2 name entry
        JTextField player2 = new JTextField("Player 2 Name: ",10);

        // commenting out the original pokemon selection text boxes
        // jTextfield for player 1 pokemon selection
        // JTextField player1Poke = new JTextField("Your Pokemon: ");

        // array of pokemon for now to test
        String[] pokemon = new String[] { "Charmander", "Eevee", "Lucario", "Mr.Mime", "Pikachu", "Psyduck", "Squirtle"};

        // dropdown for player1poke
        JComboBox<String> player1Poke = new JComboBox(pokemon);

        

        // commenting out the original pokemon selection text boxes
        // jTextfield for player 2 pokemon selection
        // JTextField player2Poke = new JTextField("Your Pokemon: ");

        // dropdown for player2poke
        JComboBox<String> player2Poke = new JComboBox(pokemon);

        // welcome message for the start page
        JLabel welcomeMessage = new JLabel("Welcome Pokemon Warrior!");

        // Image for background
        ImageIcon startGameBackground = new ImageIcon("src/Pokemon.jpg");

        // Label for adding image to
        JLabel imageLabel = new JLabel(startGameBackground);

        // adding Label with image to imagePanel so imagePanel can be added to startPage
        // frame
        imagePanel.add(imageLabel);

        // creation of the start button
        JButton startButton = new JButton("Start Game");

        // action listener that hides the startPage and reveals the battlePage, also
        // passes users
        // name to panel two
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startPage.setVisible(false);
                
                // capturing users name entries for display on battle frame
                String playerOneName = player1.getText();
                String playerTwoName = player2.getText();
                
                
                // getting user 1 selection from dropdown menu
                String poke1Name = player1Poke.getSelectedItem().toString();

                // getting user 2 selection from dropdown menu
                String poke2Name = player2Poke.getSelectedItem().toString();
                
                // creating new player 1 object
                nPlayer P1 = new nPlayer(playerOneName, null);

                // creating new player 2 object
                nPlayer P2 = new nPlayer(playerTwoName, null);
                

                // add selected pokemon name to player 1 team
                P1.addPoke(poke1Name);

                // add selected pokemon name to player 2 team
                P2.addPoke(poke2Name);

                if(poke1Name == "Charmander" && poke2Name == "Charmander")
                {
                    
                    // create pokeloader
                    PokeLoader loader = new PokeLoader();
                    
                    // create new Pokemon for player 1
                    nPokemon pokemon1 = loader.createMon("Charmander");
                    
                    // create new Pokemon for player 2 
                    nPokemon pokemon2 = loader.createMon("Charmander");
    
                    battle(playerOneName, playerTwoName, P1, P2);
                }

            }

        });


        // adding welcomeMessage to welcomePanel
        welcomePanel.add(welcomeMessage);

        // adding jtextfield so player1 can enter name
        startPanel.add(player1);

        // adding jTextfield for player1 poke selection
        startPanel.add(player1Poke);

        // adding jtextfield so player2 can enter name
        startPanel.add(player2);

        // adding jTextfield for player1 poke selection
        startPanel.add(player2Poke);

        // adding start button to startPanel
        startPanel.add(startButton);

        // adding imagePanel to startPage frame
        startPage.add(imagePanel);

        // specifying location on frame that the welcome message panel is to be added at
        startPage.add(welcomePanel, BorderLayout.NORTH);

        // specifying location on frame that the start button panel is to be added at
        startPage.add(startPanel, BorderLayout.SOUTH);

        startPage.setMinimumSize(new Dimension(500, 500));
        startPage.pack();

        // setting visibility of startPage Frame
        startPage.setVisible(true);

        
    }

public static void battle(String playerOneName, String playerTwoName, nPlayer P1, nPlayer P2) {
    // set default close operation so JFrame closes when user wants it to
    battlePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLayeredPane LayeredPane = new JLayeredPane();

    // Image for background
    ImageIcon gameBackground = new ImageIcon("src/background3.png");

    // Label for adding image to
    JLabel backgroundLabel = new JLabel(gameBackground);

    //backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // add the health bars to nGUI
        //player ones health stats //////////////// add to pokeone 
        // it will be a Jlabel ////////////////////////////////////
        JProgressBar health1 =  new JProgressBar(0,100);
        health1.setStringPainted(true);
        health1.setForeground(Color.red);
            // change next line to adapt to pokemon current health
        int healthvalue = 90;
            //health.setValue(healValue);
        health1.setValue(healthvalue);
       // pokeOnePanel.add(health1);
       // color of number
      // UIManager.put("ProgressBar.selectionForeground", Color.white);
      // UIManager.put("ProgressBar.selectionBackground", Color.RED);
       // color of bar
       UIManager.put("ProgressBar.foreground", Color.GREEN);

       JProgressBar health2 =  new JProgressBar(0,100);
       health2.setForeground(Color.RED);
       health2.setStringPainted(true);
       health2.setBorderPainted(true);
       //health2.setBackground(Color.green);
       //health2.setForeground(Color.red);
      
           // change next line to adapt to pokemon current health
       int healthvalue2 = 90;
          
       health2.setValue(healthvalue2);
    
    
    
    backgroundLabel.setBounds(40, 80, 700, 500);
                                  
    // label for displaying player1 name
    JLabel name1Label = new JLabel("Player 1: " + playerOneName);

    name1Label.setForeground(Color.white); 
    name1Label.setBounds(55,345,200,300);

    // move entry jTextfield for player1
    JTextField playerOneMove = new JTextField("Enter An Attack: ",10);
 

  
  
    playerOneMove.setBounds(55,510, 110,20);



    Random num = new Random();

    int res;

    res = 1 + num.nextInt(2);

    //res = 1 + num.nextInt( 2 );

    JButton playerOneAttack = new JButton("Attack");

        playerOneAttack.setBounds(175,510,70,20);

         // button creation for player2 submitting moves
         JButton playerTwoAttack = new JButton("Attack");

         playerTwoAttack.setBounds(655,315,70,20);

         

         

        

    if(res == 1){

        playerTwoAttack.setVisible(false);

        playerOneAttack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               playerTwoAttack.setVisible(true);
               playerOneAttack.setVisible(false);
            }

        });

        playerTwoAttack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                battlePage.setVisible(false);
                pokemonFaintDialog();
            }

        });

    }

    else if(res == 2){

        playerOneAttack.setVisible(false);

        playerTwoAttack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               playerOneAttack.setVisible(true);
               playerTwoAttack.setVisible(false);
            }

        });

        playerOneAttack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                battlePage.setVisible(false);
                pokemonFaintDialog();
            }

        });

    }
    
    /*else if(res == 2){
        JButton playerTwoAttack = new JButton("Attack");

        playerTwoAttack.setBounds(175,510,70,20);

        playerTwoAttack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // button creation for player2 submitting moves
                JButton playerOneAttack = new JButton("Attack");

                playerOneAttack.setBounds(655,315,70,20);

                playerOneAttack.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        battlePage.setVisible(false);
                        pokemonFaintDialog();
                    }

                });
            }

        });
    }*/

    // button creation for player1 submitting moves
    /*JButton playerOneAttack = new JButton("Attack");

    playerOneAttack.setBounds(175,510,70,20);

    playerOneAttack.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            battlePage.setVisible(false);
        //    pokemonWonDialog();
            // insert conditions for attack


        }

    });*/
    
    // Image for player1 poke
    ImageIcon playerOnePoke = new ImageIcon("src/snorlax_back.gif");

    // Label for adding player1 poke to 
    JLabel pokeOneLabel = new JLabel(playerOnePoke);

    pokeOneLabel.setBounds(210, 380, 100, 100);

    
    // label for displaying player2 name
    JLabel name2Label = new JLabel("Player 2: " + playerTwoName);

    name2Label.setForeground(Color.white); 
    name2Label.setBounds(535, 150, 200,300);
    
    // dropdown to select move for player1
    String playerMove1 = P1.team.get(0).moveList.get(0).getMoveName();
    String playerMove2 = P1.team.get(0).moveList.get(1).getMoveName();
    String[] player1Moves = {playerMove1, playerMove2};
    JComboBox player1Attacks = new JComboBox(player1Moves);
    LayeredPane.add(player1Attacks);
    player1Attacks.setBounds(55,510,100,20);

    // dropdown to select move for player2
    String player2Move1 = P2.team.get(0).moveList.get(0).getMoveName();
    String player2Move2 = P2.team.get(0).moveList.get(1).getMoveName();
    String[] player2Moves = {playerMove1, playerMove2};
    JComboBox player2Attacks = new JComboBox(player2Moves);
    LayeredPane.add(player2Attacks);
    player2Attacks.setBounds(535,315,100,20);
    

    // button creation for player2 submitting moves
    /*JButton playerTwoAttack = new JButton("Attack");

    playerTwoAttack.setBounds(655,315,70,20);

    playerTwoAttack.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            battlePage.setVisible(false);
            pokemonFaintDialog();
        }

    });*/
    
    // Image for player2 poke
    ImageIcon playerTwoPoke = new ImageIcon("src/sandslash_front.gif");

    // Label for adding player2 poke to 
    JLabel pokeTwoLabel = new JLabel(playerTwoPoke);

    pokeTwoLabel.setBounds(435, 300, 100, 100);
    
    health1.setBounds(55,470,115,100);
        //set healthbar for 1st player 
    health2.setBounds(535,225,115,100);
        // set healthbar for 2nd player 
    LayeredPane.add(health1);
        //health2 
    LayeredPane.add(health2);

    LayeredPane.add(name1Label);

    LayeredPane.add(name2Label);

    LayeredPane.add(playerOneAttack);

    LayeredPane.add(playerTwoAttack);

    LayeredPane.add(pokeOneLabel);

    LayeredPane.add(pokeTwoLabel);

    LayeredPane.add(backgroundLabel);

    battlePage.add(LayeredPane);
    
    battlePage.setMinimumSize(new Dimension(800, 700));
    
    
    ///////////////////////////////////////////////////////////////
    
    // panel for adding player1 name, poke stats, etc
    //JPanel userOnePanel = new JPanel();
    

    //adding user1 Name, poke stats, etc to frame 
    //battlePage.add(userOnePanel, "West");

    // panel for adding player2 poke stats, etc
    //JPanel userTwoPanel = new JPanel();


    //adding player2 Name, poke stats, etc to frame
    //battlePage.add(userTwoPanel, "East");

    ////////////////////////////////////////////////////////////////
    
    // // panel for adding Background image
    // JPanel backgroundPanel = new JPanel();

    // // Image for background
    // ImageIcon gameBackground = new ImageIcon("src/background3.png");

    // // Label for adding image to
    // JLabel backgroundLabel = new JLabel(gameBackground);

    // // adding Label with background image in it to imagePanel so imagePanel can be added to battlePage
    // // frame
    // backgroundPanel.add(backgroundLabel);

    // // adding backgroundPanel to startPage frame so background shows 
    // battlePage.add(backgroundLabel);
    
    
    // // panel for adding player1 poke image/ name/ attack/ poke stats
    // JPanel pokeOnePanel = new JPanel();

    // // label for displaying player1 name
    // JLabel name1Label = new JLabel("Player 1: " + playerOneName);

    // // adding the label with player1 name to the panel 
    // pokeOnePanel.add(name1Label);
    

    // // Image for player1 poke
    // ImageIcon playerOnePoke = new ImageIcon("src/snorlax_back.gif");

    // // Label for adding player1 poke to 
    // JLabel pokeOneLabel = new JLabel(playerOnePoke);

    // // adding pokeOneLabel with background image in it to imagePanel so imagePanel can be added to battlePage
    // // frame
    // pokeOnePanel.add(pokeOneLabel);

    // // add health stats for player1 here

    // // move entry jTextfield for player1 
    // JTextField playerOneMove = new JTextField("Enter An Attack: ");

    // // button creation for player1 submitting moves
    // JButton playerOneAttack = new JButton("Attack");

    // playerOneAttack.addActionListener(new ActionListener() {
    //         public void actionPerformed(ActionEvent e) {
    //             battlePage.setVisible(false);
    //             pokemonWonDialog();
    //         }

    //     });

    // // adding the jTextfield for player1 moves to pokeOnePanel
    // pokeOnePanel.add(playerOneMove);

    // // adding attack button for player1
    // pokeOnePanel.add(playerOneAttack);
     
    // // adding player1 pokemon panel with image to BattlePage frame so player1 pokemon shows 
    // battlePage.add(pokeOnePanel, "South");

    // // // panel for adding player2 poke image/ name/ attack/ poke stats
    // JPanel pokeTwoPanel = new JPanel();

    // // label for displaying player2 name
    // JLabel name2Label = new JLabel("Player 2: " + playerTwoName);

    // // adding the label with player2 name to the panel
    // pokeTwoPanel.add(name2Label);

    // // Image for player2 poke
    // ImageIcon playerTwoPoke = new ImageIcon("src/sandslash_front.gif");

    // // Label for adding player2 poke to 
    // JLabel pokeTwoLabel = new JLabel(playerTwoPoke);

    // // adding pokeTwoLabel with background image in it to imagePanel so imagePanel can be added to battlePage
    // // frame
    // pokeTwoPanel.add(pokeTwoLabel);

    // // add health bar for player2 here

    // // move entry jTextfield for player2 
    // JTextField playerTwoMove = new JTextField("Enter An Attack: ");

    // // button creation for player2 submitting moves
    // JButton playerTwoAttack = new JButton("Attack");

    // playerTwoAttack.addActionListener(new ActionListener() {
    //         public void actionPerformed(ActionEvent e) {
    //             battlePage.setVisible(false);
    //             pokemonFaintDialog();
    //         }

    //     });

    // // adding the jTextfield for player2 moves to panel
    // pokeTwoPanel.add(playerTwoMove);

    // // adding attack button for player2
    // pokeTwoPanel.add(playerTwoAttack);

    // // adding player2 pokemon panel with image to BattlePage frame so player2 pokemon shows 
    // battlePage.add(pokeTwoPanel, "North");

    battlePage.setMinimumSize(new Dimension(800, 700));
    battlePage.pack();
    battlePage.setVisible(true);

}

    // creating dialog box for when Pokemon dies/faints
    public static void pokemonFaintDialog() {
        JFrame f = new JFrame();

        // top of frame label
        JDialog d = new JDialog(f, "FAINTED", true);
        d.setLayout(new FlowLayout());

        // button options after fainting
        JLabel msg = new JLabel("OH NO! Your Pokemon has fainted!");
        JButton b1 = new JButton("Battle Again?");
        JButton b2 = new JButton("Quit Game");

        // action listener for button1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                //startPage.setVisible(true);
                startGame();
            }
        });

        // action listener for button2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                
            }
        });

        // adding message displayed in dialog and buttons
        d.add(msg);
        d.add(b1);
        d.add(b2);

        d.setSize(300, 100);
        d.setVisible(true);
    }

    public static void pokemonHitDialog() {
        JFrame f = new JFrame();

        // top of frame label
        JDialog d = new JDialog(f, "VICTORY", true);
        d.setLayout(new FlowLayout());

        // button options after winning
       // JLabel msg = new JLabel("Your pokemon:"+P1.team.get(0)" used : "+moveList.get(0));
        JButton b1 = new JButton("attack again?");
        JButton b2 = new JButton("Quit Game");

        // action listener for button1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                //startPage.setVisible(true);
                startPage.setVisible(true);
            }
    });

    // creating dialog box for when Pokemon winning
    public static void pokemonWonDialog() {
        JFrame f = new JFrame();

        // top of frame label
        JDialog d = new JDialog(f, "VICTORY", true);
        d.setLayout(new FlowLayout());

        // button options after winning
        JLabel msg = new JLabel("Your Pokemon has won the battle!");
        JButton b1 = new JButton("Battle Again?");
        JButton b2 = new JButton("Quit Game");

        // action listener for button1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                //startPage.setVisible(true);
                startPage.setVisible(true);
            }
        });

        // action listener for button2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
            }
        });

        // adding message displayed in dialog and buttons
        d.add(msg);
        d.add(b1);
        d.add(b2);

        d.setSize(300, 100);
        d.setVisible(true);
    }
}