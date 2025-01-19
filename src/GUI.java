import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    // frame 1, will serve as the start up window for the game
    private static JFrame startPage = new JFrame("Start");
    // frame 2, will serve as the window the battle takes place in
    private static JFrame battlePage = new JFrame("Pokemon Battle"); // frame 2

    public static void main(final String[] args) {

        startGame();
        // battle();
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
        String[] pokemon = new String[] { "Charmander", "Pikachu", "Squirtle", "Eevee", "Psyduck", "Lucario",
                "Mr. Mime", };

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
    
                    battle(playerOneName, playerTwoName);
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

    public static void battle(String playerOneName, String playerTwoName) {
        // set default close operation so JFrame closes when user wants it to
        battlePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel for adding player1 name, poke stats, etc
        // JPanel userOnePanel = new JPanel();

        // adding user1 Name, poke stats, etc to frame
        // battlePage.add(userOnePanel, "West");

        // panel for adding player2 poke stats, etc
        // JPanel userTwoPanel = new JPanel();

        // adding player2 Name, poke stats, etc to frame
        // battlePage.add(userTwoPanel, "East");

        // panel for adding Background image
        JPanel backgroundPanel = new JPanel();

        // Image for background
        ImageIcon gameBackground = new ImageIcon("src/background3.png");

        // Label for adding image to
        JLabel backgroundLabel = new JLabel(gameBackground);

        // adding Label with background image in it to imagePanel so imagePanel can be
        // added to battlePage
        // frame
        backgroundPanel.add(backgroundLabel);

        // adding backgroundPanel to startPage frame so background shows
        battlePage.add(backgroundLabel);

        // panel for adding player1 poke image/ name/ attack/ poke stats
        JPanel pokeOnePanel = new JPanel();

        // label for displaying player1 name
        JLabel name1Label = new JLabel("Player 1: " + playerOneName);

        // adding the label with player1 name to the panel
        pokeOnePanel.add(name1Label);

        // Image for player1 poke
        ImageIcon playerOnePoke = new ImageIcon("src/snorlax_back.gif");

        // Label for adding player1 poke to 
        JLabel pokeOneLabel = new JLabel(playerOnePoke);

    //player ones health stats //////////////// add to pokeone 
    // it will be a Jlabel ////////////////////////////////////
        JProgressBar health1 =  new JProgressBar(0,100);
        health1.setStringPainted(true);
        health1.setForeground(Color.red);
    // change next line to adapt to pokemon current health
    int healthvalue = 90;
    //health.setValue(healValue);
    health1.setValue(healthvalue);
    pokeOnePanel.add(health1);
    /* switch(playeronepoke)
    {
        case "Charmander":
        health1.setValue = playerPokeOne.gethealth();
        


    }


    */   
        
    //pokeOnePanel.add(health1);
    //health1.setValue(nPokemon.remHealth);
        
    /*
    * logic for battle will have to deal negative numbers to the progress bar
    */


    // adding pokeOneLabel with background image in it to imagePanel so imagePanel can be added to battlePage
    // frame
    pokeOnePanel.add(pokeOneLabel);

        // move entry jTextfield for player1
        JTextField playerOneMove = new JTextField("Enter An Attack: ",13);

        // button creation for player1 submitting moves
        JButton playerOneAttack = new JButton("Attack");

        playerOneAttack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                battlePage.setVisible(false);
                pokemonWonDialog();
            }

        });

        // adding the jTextfield for player1 moves to pokeOnePanel
        pokeOnePanel.add(playerOneMove);

        // adding attack button for player1
        pokeOnePanel.add(playerOneAttack);

        // adding player1 pokemon panel with image to BattlePage frame so player1
        // pokemon shows
        battlePage.add(pokeOnePanel, "South");

        // // panel for adding player2 poke image/ name/ attack/ poke stats
        JPanel pokeTwoPanel = new JPanel();

        // label for displaying player2 name
        JLabel name2Label = new JLabel("Player 2: " + playerTwoName);

        // adding the label with player2 name to the panel
        pokeTwoPanel.add(name2Label);
// Image for player2 poke
ImageIcon playerTwoPoke = new ImageIcon("src/sandslash_front.gif");
   
    // Label for adding player2 poke to 
   JLabel pokeTwoLabel = new JLabel(playerTwoPoke);
   //used player2poke 
//player two health, add to poketwo health//////////////////////
        JProgressBar health =  new JProgressBar(0,100);
        // leave max at 100 or errors in calc happen
        health.setStringPainted(true);
        UIManager.put("health.selectionBackground",Color.GREEN);
        UIManager.put("health.selectionForeground",Color.WHITE);
        //health.setForeground(Color.RED);

        // change next value to adapt to change in health
        //health.setValue(playerO.gethealthLeft());
        //not sure how to connect this
        int healValue = 25; // set this equal to health value

        health.setValue(healValue);
        pokeTwoPanel.add(health);

        // edit per pokemon
        
        // something like : JProgressBar(0,this.gethealthTotal);
        
      

    // adding pokeTwoLabel with background image in it to imagePanel so imagePanel can be added to battlePage
    // frame
    pokeTwoPanel.add(pokeTwoLabel);

        // adding pokeTwoLabel with background image in it to imagePanel so imagePanel
        // can be added to battlePage
        // frame
        pokeTwoPanel.add(pokeTwoLabel);

        // move entry jTextfield for player2
        JTextField playerTwoMove = new JTextField("Enter An Attack: ",13);

        // button creation for player2 submitting moves
        JButton playerTwoAttack = new JButton("Attack");

        playerTwoAttack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                battlePage.setVisible(false);
                pokemonFaintDialog();
            }

        });

        // adding the jTextfield for player2 moves to panel
        pokeTwoPanel.add(playerTwoMove);

        // adding attack button for player2
        pokeTwoPanel.add(playerTwoAttack);

        // adding player2 pokemon panel with image to BattlePage frame so player2
        // pokemon shows
        battlePage.add(pokeTwoPanel, "North");

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
                // startPage.setVisible(true);
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
                // startPage.setVisible(true);
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
