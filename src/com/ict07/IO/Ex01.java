package com.ict07.IO;

public class Ex01 
{
	// File Ŭ���� : Ư�� ��ġ�� �����ϴ� �����̳� ���͸�(����)�� ó���ϴ� Ŭ����
	// ������ : File(File parent, String child), File(String pathname), 
	//		  File(String parent, String child), File(URI uri)
	//  	** parent => �������  , child => �������
	// parent + child => ��ü���
	// pathname => ��ü���
	// uri = ���߿� ��Ʈ��ũ �Ҷ� �ʿ�
	
	// �ֿ� �޼ҵ� 
	// - creatNewFile() : boolean => ������ �����ϸ� true, �������� ���ϸ� false(���� �̸��� ������ ��������)
	// - mkdir(), mkdirs() : boolean => ���͸��� �����ϸ� true, ���ϸ� false(���� �̸��� ������ ��������)
	// - mkdir(), mkdirs() ������
	// ������� �ϴ� ���͸��� �������͸��� �������� �ʴ� ��� ���� �Ұ� => mkdir()
	// ex) c:\base\want => want���͸��� ���鶧 base���͸��� ���� ��� ���� �Ұ�
	// ���� ���͸��� base�� want���͸� ���� ������ش�. => mkdirs()
	// - delete() : ���� ���͸� ����
	// - isDirectory() : boolean => ���͸��̸� true, �ƴϸ� false
	// - isFile() : boolean => �����̸� true, �ƴϸ� flase
	// **�������鿡�� computer���� file�� directory�� �����Ѵ�.
	//	��, file�� �ƴϸ� directory�̴�.
	// - ** list() : ������ ��ġ�� ���� �� ���͸��� String[]�� ��´�.(�� ��ũ ���鶧 ���)
	// - length() : �迭�̳� String������ ���̸� ��������,
	//				File Ŭ���������� ���̰� �ƴ϶� ������ ũ�⸦ byte�� ǥ���� ��
	//				(�뷮 : byte => KB => MB => GB => TB(�� �ܰ� �ö󰥶����� 1024(2�� 10��)))
	//					1KB = 1024byte
	// - getAbsolutePath() : ���� ��� ǥ��
	//						����� Ǯ����(���ۺ��� ������) => ���⼭ ������ root�� ����
	// ex) C:\study\javastudy\MyProject\src\com\ict07\IO
	// - getPath() : ��� ��� ǥ��
	// 				���� ����ġ�� �������� �ش� ���ϱ��� �����ϱ� ���� ���ľ� �ϴ� ���
	// - getCanonicalPath() : ����ȭ ���
	// - lastModified() : ������ ���� ��¥
	
	

	
	
}
