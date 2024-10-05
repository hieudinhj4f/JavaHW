package GDiem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;
import java.util.Locale;

public abstract class Gui_findHV extends JFrame implements ActionListener {
    private String[] LopList= { "63PM1", "63PM2","63TH1","63TH2"};
    private JComboBox Lop = new JComboBox(LopList);
    private JRadioButton Male_btn = new JRadioButton("Nam");
    private JRadioButton Female_btn = new JRadioButton("Nữ");
    private ButtonGroup gender_btn = new ButtonGroup();
    private JButton add = new JButton("Them hoc vien");
    private String[] tt = {
            "Mã học viên" ,
            "Họ và tên",
            "Giới tính ",
            "Lớp",
            "Điểm",
            "Kết quả",
    };
    private JTable tb_ketqua = new JTable(new DefaultTableModel(tt,0));
    private JScrollPane scroll = new JScrollPane(tb_ketqua);
    private JButton search_btn = new JButton("Tim kiem");
    public Gui_findHV() {
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setTitle("Quản lý Điểm ");
        initializeComponent();
    }

    public void initializeComponent() {
        JLabel lb_class = new JLabel("Tên lớp bạn ");
        lb_class.setSize(80,20);
        lb_class.setLocation(10,20);
        lb_class.setVisible(true);

        Lop.setVisible(true);
        Lop.setLocation(90,20);
        Lop.setSize(80,20);
//
        JLabel gender = new JLabel("Giới tính của bạn là ");
        gender.setSize(140,20);
        gender.setLocation(10,60);
        gender.setVisible(true);
//
        Male_btn.setVisible(true);
        Male_btn.setSelected(true);
        Male_btn.setSize(70,30);
        Male_btn.setLocation(150,55);
//
        Female_btn.setVisible(true);
        Female_btn.setSelected(true);
        Female_btn.setSize(80,30);
        Female_btn.setLocation(220,55);
//
        add.setSize(140,30);
        add.setLocation(10,200);
        add.addActionListener(this);
//
        gender_btn.add(Male_btn);
        gender_btn.add(Female_btn);
        gender.setVisible(true);
//
        scroll.setVisible(true);
        scroll.setSize(600,70);
        scroll.setLocation(10,110  );
//

        this.add(Lop);
        this.add(lb_class);
        this.add(gender);
        this.add(Male_btn);
        this.add(Female_btn);
        this.add(scroll);
        this.add(add);

    };
    public static void actionPerformed(ActionEvent e){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Gui_findHV().setVisible(true);
    }

}
