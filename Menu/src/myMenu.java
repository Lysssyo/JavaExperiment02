import javax.swing.*;
public class myMenu extends JFrame{
    public  myMenu(){
        //设置界面大小
        this.setSize(400,250);

        //设置界面的Title
        this.setTitle("Menu");
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //初始化菜单，创建整个菜单对象
        JMenuBar jMenuBar=new JMenuBar();

        //创建菜单上三个选项的对象
        JMenu FileJMenu=new JMenu("File");
        JMenu FormatJMenu=new JMenu("Format");
        JMenu HelpJMenu=new JMenu("Help");

        //创建选项Format的选项
        JMenuItem LanguageItem=new JMenuItem("中文");
        JMenuItem SystemItem=new JMenuItem("进制");

        //菜单上面的选项添加到菜单对象jMenuBar中
        jMenuBar.add(FileJMenu);
        jMenuBar.add(FormatJMenu);
        jMenuBar.add(HelpJMenu);

/*        //菜单的选项Format添加其对应的选项
        FormatJMenu.add(LanguageItem);
        FormatJMenu.add(SystemItem);*/

        //为界面设置菜单
        this.setJMenuBar(jMenuBar);

        //显示所有内容，包括界面、菜单、菜单上的选项、选项的选项
        this.setVisible(true);

        //设置界面置顶，沉底
        this.setAlwaysOnTop(true);

    }



}
