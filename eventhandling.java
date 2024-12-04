import java.awt.*;
import javax.swing.plaf.metal.MetalIconFactory;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
class eventhandling
{
    eventhandling f1=new eventhandling();
    f1.setTitle("EVENT HANDLING");

    Label l1=new Label("enter your name");
    Textfield t1=new Textfield(20);
    Button b1=new Button("greet");
    Label l2=new Label();
    f1.setLayout(new FlowLayout());
    f1.add(l1);
    f1.add(t1);
    f1.add(b1);
    f1.add(l2);

    b1.addActionListener( e-> {
        String name=new t1.getText();
        l2.setText("hello"+name+"how are you");
    }
    )

    f1.setSize(500,400);
    f1.setVisible(true);
}
