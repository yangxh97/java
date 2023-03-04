import javax.swing.*;
public class frameDemo{
	public static void main(String[] args){
		JFrame jf=new JFrame("this is a JFrame");
		JLabel jl=new JLabel("lable");
		jf.add(jl);
		jf.setVisible(true);
		jf.setSize(200,300);

	}

}
