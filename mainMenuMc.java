/**
 * @Author Niklas Choinowski
 * @made with Eclipse
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class mainMenuMc extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        mainMenuMc frame = new mainMenuMc();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
    }

    /**
     * Create the frame.
     */
    public mainMenuMc() {
        setTitle("Minecraft");
        setIconImage(Toolkit.getDefaultToolkit().getImage("minecraft.png"));
        setBackground(Color.GRAY);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }

        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 784, 500);
        contentPane = new JPanel();
        contentPane.setForeground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(-2, -37, 780, 508);
        contentPane.add(tabbedPane);

        JPanel main = new JPanel();
        tabbedPane.addTab("New tab", null, main, null);

        JButton btnSingleplayer = new JButton("Singleplayer");
        btnSingleplayer.setBounds(292, 200, 169, 36);
        btnSingleplayer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tabbedPane.setSelectedIndex(1);
                }
            });
        main.setLayout(null);
        main.add(btnSingleplayer);

        JButton btnMultiplayer = new JButton("Multiplayer");
        btnMultiplayer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tabbedPane.setSelectedIndex(2);
                }
            });
        btnMultiplayer.setBounds(292, 247, 169, 36);
        main.add(btnMultiplayer);

        JButton btnExit = new JButton("Spiel beenden");
        btnExit.setBackground(Color.getColor("#6c6c6c"));
        btnExit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        btnExit.setBounds(292, 294, 169, 23);
        main.add(btnExit);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("Webp.net-resizeimage.jpg"));
        lblNewLabel_2.setBounds(0, 11, 773, 469);
        main.add(lblNewLabel_2);

        JPanel singleplayer = new JPanel();
        tabbedPane.addTab("New tab", null, singleplayer, null);
        singleplayer.setLayout(null);

        JLabel lblNewLabel = new JLabel("Singleplayer");
        lblNewLabel.setForeground(Color.LIGHT_GRAY);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(6, 25, 763, 89);
        singleplayer.add(lblNewLabel);

        JButton btnNewButton = new JButton("Hauptmen\u00FC");
        btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tabbedPane.setSelectedIndex(0);
                }
            });
        btnNewButton.setBounds(300, 356, 176, 23);
        singleplayer.add(btnNewButton);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("1037745_minecraft-dirt-wallpapers-by-thedevartist-on-deviantart_1190x672_h (1).jpg"));
        lblNewLabel_3.setBounds(0, 11, 773, 469);
        singleplayer.add(lblNewLabel_3);

        JPanel multiplayer = new JPanel();
        tabbedPane.addTab("New tab", null, multiplayer, null);
        multiplayer.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Multiplayer");
        lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        lblNewLabel_1.setBounds(6, 25, 763, 79);
        multiplayer.add(lblNewLabel_1);

        JButton btnNewButton_1 = new JButton("Hauptmen\u00FC");
        btnNewButton_1.setBounds(300, 356, 174, 23);
        btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tabbedPane.setSelectedIndex(0);
                }
            });
        multiplayer.add(btnNewButton_1);

        JLabel lblNewLabel_3_1 = new JLabel("");
        lblNewLabel_3_1.setIcon(new ImageIcon("1037745_minecraft-dirt-wallpapers-by-thedevartist-on-deviantart_1190x672_h (1).jpg"));
        lblNewLabel_3_1.setBounds(0, 11, 773, 469);
        multiplayer.add(lblNewLabel_3_1);
    }
}
