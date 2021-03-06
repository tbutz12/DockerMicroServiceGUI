import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLConnection;
import java.io.File;
import java.lang.ProcessBuilder.Redirect;
import java.util.Scanner;

class gui {
  public static void openURL(String url) {
    try {  //attempt to use Desktop library from JDK 1.6+
      Class<?> d = Class.forName("java.awt.Desktop");
      d.getDeclaredMethod("browse",
      new Class<?>[] {java.net.URI.class}).invoke(
      d.getDeclaredMethod("getDesktop").invoke(null),
      new Object[] {java.net.URI.create(url)});
    }
    catch(Exception ignore){
      try {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Mac OS")) {
          Class fileMgr = Class.forName("com.apple.eio.FileManager");
          Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[] {String.class});
          openURL.invoke(null, new Object[] {url});
        } else if (osName.startsWith("Windows")) {
          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } else { //assume Unix or Linux
          String[] browsers = { "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "chrome"};
          String browser = null;
          for (int count = 0; count < browsers.length && browser == null; count++) {
            if (Runtime.getRuntime().exec(new String[] {"which", browsers[count]}).waitFor() == 0) {
              browser = browsers[count];
            }
          }
          if (browser == null) {
            throw new Exception("Could not find web browser");
          } else {
            Runtime.getRuntime().exec(new String[] {browser, url});
          }
        }
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
  public static void main(String args[]) {
    //Creating the Frame
    JFrame frame = new JFrame("Docker GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 600);
    //Creating the panel at bottom and adding components
    JPanel panel = new JPanel(); // the panel is not visible in output
    int x = 5;
    int y = 5;
    panel.setLayout(new GridLayout(x, y));
    JButton rs = new JButton("RStudio");
    rs.setPreferredSize(new Dimension(60, 60));
    JButton spyder = new JButton("Spyder");
    spyder.setPreferredSize(new Dimension(60, 60));
    JButton ibm = new JButton("IBM SAS");
    ibm.setPreferredSize(new Dimension(60, 60));
    JButton git = new JButton("Git");
    git.setPreferredSize(new Dimension(60, 60));
    JButton jup = new JButton("Jupyter Notebook");
    jup.setPreferredSize(new Dimension(60, 60));
    JButton orange = new JButton("Orange");
    orange.setPreferredSize(new Dimension(60, 60));
    JButton vs = new JButton("Visual Studio Code IDE");
    vs.setPreferredSize(new Dimension(60, 60));
    JButton hadoop = new JButton("Apache Hadoop");
    hadoop.setPreferredSize(new Dimension(60, 60));
    JButton spark = new JButton("Apache Spark");
    spark.setPreferredSize(new Dimension(60, 60));
    JButton tab = new JButton("Tableau");
    tab.setPreferredSize(new Dimension(60, 60));
    JButton sq = new JButton("SonarQube");
    sq.setPreferredSize(new Dimension(60, 60));
    JButton tensor = new JButton("TensorFlow");
    tensor.setPreferredSize(new Dimension(60, 60));
    JButton markdown = new JButton("Markdown");
    markdown.setPreferredSize(new Dimension(60, 60));

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
    panel.add(sq);
    panel.add(tensor);
    panel.add(markdown);
    JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
    container.add(panel);
    rs.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        openURL("http://host.docker.internal:8787");
      }
    });
    spyder.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        try{
          URL myURL = new URL("http://host.docker.internal:6004");
          URLConnection myURLConnection = myURL.openConnection();
          myURLConnection.getContentLength();
        }
        catch(IOException ex){

        }
      }
    });
    ibm.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        try{
          URL myURL = new URL("http://host.docker.internal:3002");
          URLConnection myURLConnection = myURL.openConnection();
          myURLConnection.getContentLength();
        }
        catch(IOException ex){

        }
        openURL("https://welcome.oda.sas.com/login");
      }
    });
    git.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        try{
          URL myURL = new URL("http://host.docker.internal:6006");
          URLConnection myURLConnection = myURL.openConnection();
          myURLConnection.getContentLength();
        }
        catch(IOException ex){

        }
      }
    });
    jup.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        openURL("http://host.docker.internal:8888?token=easy");
      }

    });
    orange.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        try{
          URL myURL = new URL("http://host.docker.internal:6008");
          URLConnection myURLConnection = myURL.openConnection();
          myURLConnection.getContentLength();
        }
        catch(IOException ex){

        }
      }
    });
    vs.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        openURL("http://host.docker.internal:8443");
      }
    });
    hadoop.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        try{
          URL myURL = new URL("http://host.docker.internal:3004");
          URLConnection myURLConnection = myURL.openConnection();
          myURLConnection.getContentLength();
        }
        catch(IOException ex){

        }
        openURL("http://host.docker.internal:9870");
      }
    });
    spark.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        try{
          URL myURL = new URL("http://host.docker.internal:3006");
          URLConnection myURLConnection = myURL.openConnection();
          myURLConnection.getContentLength();
        }
        catch(IOException ex){

        }
      }
    });
    tab.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        openURL("https://public.tableau.com/en-us/s/");
      }
    });
    sq.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        openURL("http://host.docker.internal:9001");
      }
    });
    tensor.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        try{
          URL myURL = new URL("http://host.docker.internal:6002");
          URLConnection myURLConnection = myURL.openConnection();
          myURLConnection.getContentLength();
        }
        catch(IOException ex){
          ex.printStackTrace();
        }
      }
    });
    markdown.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        openURL("http://host.docker.internal:12345");
      }
    });

    //Adding Components to the frame.
    frame.getContentPane().add(BorderLayout.CENTER, panel);
    frame.setVisible(true);
  }


}
