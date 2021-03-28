import javax.swing.*;
import java.awt.*;
class gui {
public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Docker GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000, 100);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JButton rs = new JButton("RS Studio");
        JButton spyder = new JButton("Spyder");
        JButton ibm = new JButton("IBM SAS");
        JButton git = new JButton("Git");
        JButton jup = new JButton("Jupyter Notebook");
        JButton orange = new JButton("Orange");
        JButton vs = new JButton("Visual Studio Code IDE");
        JButton hadoop = new JButton("Apache Hadoop");
        JButton spark = new JButton("Apache Spark");
        JButton tab = new JButton("Tableau");
        JButton sc = new JButton("SonarCloud");
        JButton tensor = new JButton("TensorFlow");
        JButton markdown = new JButton("Markdown");

        panel.add(rs);
        panel.add(spyder);
        panel.add(ibm);
        panel.add(git);
        panel.add(jup);
        panel.add(orange);
        panel.add(vs);
        panel.add(hadoop);
        panel.add(spark);
        panel.add(tab);
        panel.add(sc);
        panel.add(tensor);
        panel.add(markdown);

        jup.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Runtime runtime = Runtime.getRuntime();
                                try {
                                        runtime.exec("ls");
                                        System.out.println("HELLO");
                                } catch (IOException e1) {
                                        e1.printStackTrace();
                                }
                        }
                });

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);
}
}