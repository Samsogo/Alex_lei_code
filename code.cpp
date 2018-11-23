#include<iostream>
#include<fstream>
#include<string>
using namespace std;
struct student_course_info {
	string grade;//ѧ��
	string name;//�γ�����
	string kind;//�γ����
	string teacher;//�ڿν�ʦ
	string time;//�Ͽ�ʱ��
	string place;//�Ͽεص�
	int st;//ѧʱ
	int sc;//ѧ��
	int score;//�ɼ�
} sci[100];
int n = 5;
void input() {
	ifstream fin("a.txt",ios::in);
	for (int i = 0; i < n; i++) {
		fin >> sci[i].grade;
		fin >> sci[i].name;
		fin >> sci[i].kind;
		fin >> sci[i].teacher;
		fin >> sci[i].time;
		fin >> sci[i].place;
		fin >> sci[i].st;
		fin >> sci[i].sc;
		fin >> sci[i].score;
	}
	cout << "��ȡ�ɹ�" << endl;
	system("pause");
}

void save() {
	ofstream fout("b.txt");
	for (int i = 0; i < n; i++) {
		fout << sci[i].grade << "\t" << sci[i].kind << "\t" << sci[i].name << "\t" << sci[i].place << "\t" << sci[i].sc << "\t" << sci[i].score << "\t" << sci[i].st << "\t" << sci[i].teacher << "\t" << sci[i].time << endl;
	}
	cout << "����ɹ�" << endl;
	system("pause");
}

void search() {
	cout << "������γ�����:";
	string na;
	cin >> na;
	for (int i = 0; i < n; i++) {
		if (sci[i].name == na) {
			cout << sci[i].grade << "\t" << sci[i].kind << "\t" << sci[i].name << "\t" << sci[i].place << "\t" << sci[i].sc << "\t" << sci[i].score << "\t" << sci[i].st << "\t" << sci[i].teacher << "\t" << sci[i].time << endl;
		}
	}
	cout << "��ѯ�ɹ�!" << endl;
	system("pause");
}

void mod() {
	cout << "������γ����ƺ�Ҫ�޸ĵ��Ͽ���ʦ:";
	string s1, s2;
	cin >> s1 >> s2;
	for (int i = 0; i < n; i++) {
		if (sci[i].name == s1) {
			sci[i].teacher = s2;
		}
	}
	cout << "�޸ĳɹ�!" << endl;
	system("pause");
}

void del() {
	cout << "������Ҫɾ���Ŀγ����ƣ�";
	string na;
	cin >> na;
	int key = -1;
	for (int i = 0; i < n; i++) {
		if (sci[i].name == na) {
			key = i;
			break;
		}
	}
	for (int i = key; i < n-1; i++) {
		sci[i] = sci[i + 1];
	}
	cout << "ɾ���ɹ�!" << endl;
	system("pause");
}

void tongji() {
	int n1 = 0;//���޿�����
	int n2 = 0;//ѡ�޿�����
	int sum1 = 0;//������ܷ�
	int sum2 = 0;//ѡ�޿��ܷ�
	for (int i = 0; i < n; i++) {
		if (sci[i].kind == "���޿�") {
			n1++;
			sum1 += sci[i].score;
		}
		else {
			sum2 += sci[i].score;
			n2++;
		}
	}
	cout << "���޿�ƽ���֣�" << sum1 * 1.0 / n1 << endl;
	cout << "ѡ�޿�ƽ���֣�" << sum2 * 1.0 / n2 << endl;
	system("pause");
}

void zhpf() {
	int sum = 0;
	for (int i = 0; i < n; i++) {
		int l = sci[i].score;
		if (l < 60) {
			sum += 0;
		}
		else if (l < 70) {
			sum += 1;
		}
		else if (l < 80) {
			sum += 2;
		}
		else if (l < 90) {
			sum += 3;
		}
		else if (l < 100) {
			sum += 4;
		}
	}
	cout << "ѧ��Ϊ:" << sum * .10 / n << endl;
	system("pause");
}

void ext() {
	string a[100];
	int l1 = 0;
	string b[100];
	int l2 = 0;
	string c[100];
	int l3 = 0;
	string d[100];
	int l4 = 0;
	string e[100];
	int l5 = 0;
	for (int i = 0; i < n; i++) {
		if (sci[i].time == "����һ") {
			a[l1++] = sci[i].name;
		}else if (sci[i].time == "���ڶ�") {
			b[l2++] = sci[i].name;
		}else if (sci[i].time == "������") {
			c[l3++] = sci[i].name;
		}else if (sci[i].time == "������") {
			d[l4++] = sci[i].name;
		}else if (sci[i].time == "������") {
			e[l2++] = sci[i].name;
		}
	}
}

void menu() {
	cout << "		��ѧ���γ���ϢС����" << endl;
	cout << "---------------------------------------" << endl;
	cout << "		1--�γ���Ϣ¼��" << endl;
	cout << "		2--�γ���Ϣ����" << endl;
	cout << "		3--�γ���Ϣ��ѯ" << endl;
	cout << "		4--�γ���Ϣ�޸�" << endl;
	cout << "		5--�γ���Ϣɾ��" << endl;
	cout << "		6--ͳ��ƽ����" << endl;
	cout << "		7--�ۺ�����" << endl;
	cout << "		8--ÿ�տγ���Ϣ" << endl;
	cout << "		0--�˳�" << endl;
	cout << "---------------------------------------" << endl;
}
int main() {
	int c;
	while (true) {
		menu();
		cout << "Please input your choice:";
		cin >> c;
		switch (c) {
			case 1:input(); break;
			case 2: save(); break;
			case 3: search(); break;
			case 4: mod(); break;
			case 5: del(); break;
			case 0: exit(0); break;
			default: cout << "input invalid��please input valid number..." << endl;
		}
	}
	return 0;
}