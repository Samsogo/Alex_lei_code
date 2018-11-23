#include<iostream>
#include<fstream>
#include<string>
using namespace std;
struct student_course_info {
	string grade;//学期
	string name;//课程名称
	string kind;//课程类别
	string teacher;//授课教师
	string time;//上课时间
	string place;//上课地点
	int st;//学时
	int sc;//学分
	int score;//成绩
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
	cout << "读取成功" << endl;
	system("pause");
}

void save() {
	ofstream fout("b.txt");
	for (int i = 0; i < n; i++) {
		fout << sci[i].grade << "\t" << sci[i].kind << "\t" << sci[i].name << "\t" << sci[i].place << "\t" << sci[i].sc << "\t" << sci[i].score << "\t" << sci[i].st << "\t" << sci[i].teacher << "\t" << sci[i].time << endl;
	}
	cout << "保存成功" << endl;
	system("pause");
}

void search() {
	cout << "请输入课程名称:";
	string na;
	cin >> na;
	for (int i = 0; i < n; i++) {
		if (sci[i].name == na) {
			cout << sci[i].grade << "\t" << sci[i].kind << "\t" << sci[i].name << "\t" << sci[i].place << "\t" << sci[i].sc << "\t" << sci[i].score << "\t" << sci[i].st << "\t" << sci[i].teacher << "\t" << sci[i].time << endl;
		}
	}
	cout << "查询成功!" << endl;
	system("pause");
}

void mod() {
	cout << "请输入课程名称和要修改的上课老师:";
	string s1, s2;
	cin >> s1 >> s2;
	for (int i = 0; i < n; i++) {
		if (sci[i].name == s1) {
			sci[i].teacher = s2;
		}
	}
	cout << "修改成功!" << endl;
	system("pause");
}

void del() {
	cout << "请输入要删除的课程名称：";
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
	cout << "删除成功!" << endl;
	system("pause");
}

void tongji() {
	int n1 = 0;//必修课总数
	int n2 = 0;//选修课总数
	int sum1 = 0;//必须课总分
	int sum2 = 0;//选修课总分
	for (int i = 0; i < n; i++) {
		if (sci[i].kind == "必修课") {
			n1++;
			sum1 += sci[i].score;
		}
		else {
			sum2 += sci[i].score;
			n2++;
		}
	}
	cout << "必修课平均分：" << sum1 * 1.0 / n1 << endl;
	cout << "选修课平均分：" << sum2 * 1.0 / n2 << endl;
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
	cout << "学分为:" << sum * .10 / n << endl;
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
		if (sci[i].time == "星期一") {
			a[l1++] = sci[i].name;
		}else if (sci[i].time == "星期二") {
			b[l2++] = sci[i].name;
		}else if (sci[i].time == "星期三") {
			c[l3++] = sci[i].name;
		}else if (sci[i].time == "星期四") {
			d[l4++] = sci[i].name;
		}else if (sci[i].time == "星期五") {
			e[l2++] = sci[i].name;
		}
	}
}

void menu() {
	cout << "		大学生课程信息小帮手" << endl;
	cout << "---------------------------------------" << endl;
	cout << "		1--课程信息录入" << endl;
	cout << "		2--课程信息保存" << endl;
	cout << "		3--课程信息查询" << endl;
	cout << "		4--课程信息修改" << endl;
	cout << "		5--课程信息删除" << endl;
	cout << "		6--统计平均分" << endl;
	cout << "		7--综合评分" << endl;
	cout << "		8--每日课程信息" << endl;
	cout << "		0--退出" << endl;
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
			default: cout << "input invalid，please input valid number..." << endl;
		}
	}
	return 0;
}