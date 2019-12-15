package per.attendance.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {
	//��ʼ�����˵�
	JMenuBar jMenuBar= new JMenuBar();
	JMenu JMenuFile = new JMenu("�˵�");
	JMenuItem jMenuFileExit = new JMenuItem("�˳�ϵͳ");
	JMenu jMenuListName = new JMenu("Ա������");
	JMenuItem jMenuItemListName = new JMenuItem("���ɿ�������");
	JMenuItem jMenuItemCheckRecords = new JMenuItem("�鿴���ڼ�¼");
	JMenu jMenuManageWorkers = new JMenu("Ա������");
	JMenuItem jMenuItemAddWorker = new JMenuItem("����Ա��");
	JMenuItem jMenuItemDeleteWorker = new JMenuItem("ɾ��Ա��");
	JMenuItem jMenuItemUpdateWorker = new JMenuItem("�޸�Ա����Ϣ");
	JMenu JMenuSelectWorkers = new JMenu("Ա����ѯ");
	JMenuItem jMenuItemAllWokers = new JMenuItem("���ȫ��Ա��");
	//���췽���������ʼ��
	public MainFrame(){
		//����������壬�����䲼��
		JPanel contentPanel = (JPanel) getContentPane();
		contentPanel.setLayout( new BorderLayout());
		//��ܵĴ�С�������
		setSize(new Dimension(800,490));
		setTitle("�������ϵͳ");
		//���Ӳ˵���
		setJMenuBar(jMenuBar);
		// ���Ӳ˵�������˵���
		jMenuBar.add(JMenuFile);
		jMenuBar.add(jMenuListName);
		jMenuBar.add(jMenuManageWorkers);
		jMenuBar.add(JMenuSelectWorkers);
		jMenuBar.add(jMenuFileExit);
		// ���Ӳ˵��������˵����
		JMenuFile.add(jMenuFileExit);
		jMenuListName.add(jMenuItemListName);
		jMenuListName.add(jMenuItemCheckRecords);
		jMenuManageWorkers.add(jMenuItemAddWorker);
		jMenuManageWorkers.add(jMenuItemDeleteWorker);
		jMenuManageWorkers.add(jMenuItemUpdateWorker);
		JMenuSelectWorkers.add(jMenuItemAllWokers);
		// ���˵������¼�������
		jMenuFileExit.addActionListener(this);			// �˳�
		jMenuItemListName.addActionListener(this);		// ������ɵ�����
		jMenuItemCheckRecords.addActionListener(this);	// �鿴������¼
		jMenuItemAddWorker.addActionListener(this);		// ����Ա��
		jMenuItemDeleteWorker.addActionListener(this);	// ɾ��Ա��
		jMenuItemUpdateWorker.addActionListener(this);	// �޸�Ա��
		jMenuItemAllWokers.addActionListener(this);		// ���ȫ��Ա��
	}
			

	// �˵��¼��Ĵ�������
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		// �˳�
		if (e.getSource() == jMenuFileExit) {
			System.exit(0);
		}
		// �����������
		if (e.getSource() == jMenuItemListName) {
			this.remove(this.getContentPane());
			RandomListName randomListName = new RandomListName();
			this.setContentPane(randomListName.getWokersCounts());
			this.setVisible(true);
		}
		// �鿴������¼
		if (e.getSource() == jMenuItemCheckRecords) {
			
		}
		// ����Ա��
		if (e.getSource() == jMenuItemAddWorker) {
			
		}
		// ɾ��Ա��
		if (e.getSource() == jMenuItemDeleteWorker) {
			
		}
		// �޸�Ա��
		if (e.getSource() == jMenuItemUpdateWorker) {
			
		}
		// ���ȫ��Ա��
		if (e.getSource() == jMenuItemAllWokers) {
			
		}
	}
	
	
}




