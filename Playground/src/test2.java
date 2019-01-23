import javax.swing.*;

public class test2 {

  public void goldMethod(double points) {
      int packs = 0;
      while (points>=10000) {

          points= points-3000;
          packs = packs + 1;


      }

      JOptionPane.showMessageDialog(null,"You can purchase " + packs + " Gold packs with those points");

  }  public void silverMethod(double points) {
      int packs = 0;
      while (points>=5000) {

          points= points-1500;
          packs = packs + 1;


      }

      JOptionPane.showMessageDialog(null,"You can purchase " + packs + " Silver packs with those points");

  }  public void bronzeMethod(double points) {
      int packs = 0;
      while (points>=1500) {

          points= points-1000;
          packs = packs + 1;


      }

      JOptionPane.showMessageDialog(null,"You can purchase " + packs + " Bronze packs with those points");

  }


}
